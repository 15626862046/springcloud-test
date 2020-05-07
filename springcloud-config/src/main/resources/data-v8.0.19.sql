
-- 新建数据库及数据表，共新建三个库,以下这是mysql-8.0.19
/*
 Navicat Premium Data Transfer

 Source Server         : 112
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : 112.74.20.213:3306
 Source Schema         : springcloud_01

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 22/02/2020 17:43:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(0) NOT NULL AUTO_INCREMENT,
  `dname` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `db_source` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'springcloud_01');
INSERT INTO `dept` VALUES (2, '人事部', 'springcloud_01');
INSERT INTO `dept` VALUES (3, '财务部', 'springcloud_01');
INSERT INTO `dept` VALUES (4, '市场部', 'springcloud_01');
INSERT INTO `dept` VALUES (5, '运维部', 'springcloud_01');
INSERT INTO `dept` VALUES (6, '航空类', 'springcloud_01');

SET FOREIGN_KEY_CHECKS = 1;
