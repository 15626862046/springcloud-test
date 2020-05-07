



-- 新建数据库及数据表，共新建三个库,以下这是mysql-5.4.7
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `db_source` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'springcloud_03');
INSERT INTO `dept` VALUES (2, '人事部', 'springcloud_03');
INSERT INTO `dept` VALUES (3, '财务部', 'springcloud_03');
INSERT INTO `dept` VALUES (4, '市场部', 'springcloud_03');
INSERT INTO `dept` VALUES (5, '运维部', 'springcloud_03');
INSERT INTO `dept` VALUES (6, '航空类', 'springcloud_03');

SET FOREIGN_KEY_CHECKS = 1;




