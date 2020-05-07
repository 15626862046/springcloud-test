

package com.jun.springcloud.myRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
//import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class JunRandomRule extends AbstractLoadBalancerRule {
    private int total = 0;//被调用的总次数
    private int currentIndex = 0;//当前服务的索引
    public JunRandomRule() {
    }

    //@SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();//获取活着的服务
                List<Server> allList = lb.getAllServers();//获得全部的服务
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                /*
                int index = this.chooseRandomInt(serverCount);//生成区间随机数
                server = (Server)upList.get(index);//从活着的服务中，随机获取一个
                 */
                //---------------------------
                if(total<5){
                    server=upList.get(currentIndex);//获取当前服务
                    total++;
                }else{
                    total = 0;
                    currentIndex++;
                    if(currentIndex>upList.size()){
                        currentIndex=0;
                    }
                    upList.get(currentIndex);
                }
                //----------------------------
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
