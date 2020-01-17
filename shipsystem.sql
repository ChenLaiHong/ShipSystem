/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50627
 Source Host           : localhost:3366
 Source Schema         : shipsystem

 Target Server Type    : MySQL
 Target Server Version : 50627
 File Encoding         : 65001

 Date: 17/01/2020 16:49:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment`  (
  `eid` int(11) NOT NULL AUTO_INCREMENT COMMENT '材料设备主键',
  `poisson_ratio` decimal(22, 4) NULL DEFAULT NULL COMMENT '泊松比',
  `elastic_modulus` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '弹性模量',
  `equipment_model` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '型号',
  `equipment_price` decimal(22, 4) NULL DEFAULT NULL COMMENT '价格',
  `ship_id` int(11) NULL DEFAULT NULL COMMENT '外键，船舶主键',
  `state` int(11) NULL DEFAULT NULL COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`eid`) USING BTREE,
  INDEX `ship_id`(`ship_id`) USING BTREE,
  CONSTRAINT `equipment_ibfk_1` FOREIGN KEY (`ship_id`) REFERENCES `shipinfo` (`ship_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_mysql500_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for goodsoperate
-- ----------------------------
DROP TABLE IF EXISTS `goodsoperate`;
CREATE TABLE `goodsoperate`  (
  `operate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '货物运营主键',
  `operate_type` int(11) NULL DEFAULT NULL COMMENT '运输货物类型（1：客船，2：干货船，3：液货船，4：滚装船）',
  `bearing_weight` decimal(22, 4) NULL DEFAULT NULL COMMENT '承载重量',
  `operate_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '货物价格',
  `state` int(11) NULL DEFAULT NULL COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `ship_id` int(11) NULL DEFAULT NULL COMMENT '外键，船舶主键',
  PRIMARY KEY (`operate_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_mysql500_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `login_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工号，主键',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登陆密码',
  `gender` int(2) NULL DEFAULT NULL COMMENT '性别（0为男，1为女）',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `birth` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出生年月',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `household_register` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '户籍',
  `static_live` int(11) NULL DEFAULT 1 COMMENT '是否被删除了（0为删除了，1为不删除）',
  `role_id` int(11) NULL DEFAULT 1 COMMENT '角色（1：船长，2：高级船员，3：中级船员，4：普通船员）',
  PRIMARY KEY (`login_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for repair
-- ----------------------------
DROP TABLE IF EXISTS `repair`;
CREATE TABLE `repair`  (
  `repair_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '维修保养主键',
  `equipment_usage` text CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL COMMENT '设备使用情况',
  `use_year` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '使用年限',
  `manage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '管理',
  `ship_maintenance` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '船舶维修',
  `ship_report` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '船检报告',
  `consumption` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '消费记录',
  `state` int(11) NULL DEFAULT NULL COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `ship_id` int(11) NULL DEFAULT NULL COMMENT '外键（船舶主键）',
  PRIMARY KEY (`repair_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_mysql500_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `role_id` int(11) NOT NULL COMMENT '角色主键',
  `role_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for shipinfo
-- ----------------------------
DROP TABLE IF EXISTS `shipinfo`;
CREATE TABLE `shipinfo`  (
  `ship_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '船舶基本信息主键',
  `total_length` decimal(22, 4) NULL DEFAULT NULL COMMENT '总长',
  `type_width` decimal(22, 4) NULL DEFAULT NULL COMMENT '型宽',
  `type_depth` decimal(22, 4) NULL DEFAULT NULL COMMENT '型深',
  `displacement` decimal(22, 4) NULL DEFAULT NULL COMMENT '排水量',
  `design_draft` decimal(22, 4) NULL DEFAULT NULL COMMENT '设计型吃水',
  `structural_draft` decimal(22, 4) NULL DEFAULT NULL COMMENT '结构型吃水',
  `hold_number` int(11) NULL DEFAULT NULL COMMENT '设计货舱个数',
  `temperature` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '液货船设计温度',
  `cargo_proportion` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '设计液货比重',
  `steam_pressure` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '设计液货舱顶蒸汽压力',
  `ship_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '图纸',
  `other_file` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '其他文件',
  `state` int(11) NULL DEFAULT NULL COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ship_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_mysql500_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
