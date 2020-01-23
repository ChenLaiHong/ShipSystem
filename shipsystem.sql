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

 Date: 23/01/2020 21:43:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for crew
-- ----------------------------
DROP TABLE IF EXISTS `crew`;
CREATE TABLE `crew`  (
  `login_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工号，主键',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登陆密码',
  `gender` int(2) NULL DEFAULT NULL COMMENT '性别（0为男，1为女）',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `birth` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出生年月',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `household_register` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '户籍',
  `static_live` int(11) NULL DEFAULT 1 COMMENT '是否被删除了（0为删除了，1为不删除）',
  `role_id` int(11) NULL DEFAULT 1 COMMENT '角色（1：普通船员，2：中级船员，3：高级船员，4：船长）',
  PRIMARY KEY (`login_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of crew
-- ----------------------------
INSERT INTO `crew` VALUES ('111', '11222', 'e10adc3949ba59abbe56e057f20f883e', 0, NULL, NULL, NULL, '', 1, 1);
INSERT INTO `crew` VALUES ('12345632', '22', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL, NULL, NULL, '', 1, 2);
INSERT INTO `crew` VALUES ('16210120721', 'test1', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL, NULL, NULL, '', 1, 2);
INSERT INTO `crew` VALUES ('16210120722', 'test', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL, NULL, NULL, '', 1, 1);
INSERT INTO `crew` VALUES ('16210120723', '赖红', 'e10adc3949ba59abbe56e057f20f883e', 1, '17765602540', NULL, '1185630400@qq.com', '', 1, 1);
INSERT INTO `crew` VALUES ('16210120745', '111', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL, NULL, NULL, '', 1, 1);
INSERT INTO `crew` VALUES ('201613240323', '湛颖鸿', 'e10adc3949ba59abbe56e057f20f883e', 0, '18718934520', '2020-01-24', '1185630455@qq.com', '北京市/北京市/朝阳区', 1, 4);

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
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image`  (
  `person_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工号',
  `person_photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像地址',
  PRIMARY KEY (`person_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES ('201613240323', '/image/rotPhoto/20200120122946.jpg');

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
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource`  (
  `resoure_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源主键',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源名称',
  `resoure_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源地址',
  `resource_type` int(2) NULL DEFAULT NULL COMMENT '资源类型（1：列表，2：按钮）',
  `resource_parent_id` int(11) NULL DEFAULT NULL COMMENT '属于哪个资源的子资源',
  `resource_sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`resoure_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of resource
-- ----------------------------
INSERT INTO `resource` VALUES (1, '船员管理', '/toCrew', 1, 31, 1);
INSERT INTO `resource` VALUES (2, '船员添加', '/addCrew', 2, 1, 2);
INSERT INTO `resource` VALUES (3, '船员修改', '/editCrew', 2, 1, 3);
INSERT INTO `resource` VALUES (4, '船员删除', '/delCrew', 2, 1, 4);
INSERT INTO `resource` VALUES (5, '船员导出', '/exportCrew', 2, 1, 5);
INSERT INTO `resource` VALUES (6, '船舶管理', '/toShipInfo', 1, 31, 6);
INSERT INTO `resource` VALUES (7, '船舶添加', '/addShipInfo', 2, 6, 7);
INSERT INTO `resource` VALUES (8, '船舶修改', '/editShipInfo', 2, 6, 8);
INSERT INTO `resource` VALUES (9, '船舶删除', '/delShipInfo', 2, 6, 9);
INSERT INTO `resource` VALUES (10, '船舶导出', '/exportShipInfo', 2, 6, 10);
INSERT INTO `resource` VALUES (11, '专业管理', '/toMajor', 1, 31, 11);
INSERT INTO `resource` VALUES (12, '专业添加', '/addMajor', 2, 11, 12);
INSERT INTO `resource` VALUES (13, '专业修改', '/editMajor', 2, 11, 13);
INSERT INTO `resource` VALUES (14, '专业删除', '/delMajor', 2, 11, 14);
INSERT INTO `resource` VALUES (15, '专业导出', '/exportMajor', 2, 11, 15);
INSERT INTO `resource` VALUES (16, '年级管理', '/toGrade', 1, 31, 16);
INSERT INTO `resource` VALUES (17, '年级添加', '/addGrade', 2, 16, 17);
INSERT INTO `resource` VALUES (18, '年级修改', '/editGrade', 2, 16, 18);
INSERT INTO `resource` VALUES (20, '院系管理', '/toDepartment', 1, 31, 20);
INSERT INTO `resource` VALUES (21, '院系添加', '/addDepartment', 2, 20, 21);
INSERT INTO `resource` VALUES (22, '院系编辑', '/editDepartment', 2, 20, 22);
INSERT INTO `resource` VALUES (24, '角色管理', '/toRole', 1, 31, 24);
INSERT INTO `resource` VALUES (25, '角色添加', '/addRole', 2, 24, 25);
INSERT INTO `resource` VALUES (26, '角色修改', '/editRole', 2, 24, 26);
INSERT INTO `resource` VALUES (27, '通知管理', '/toNotice', 1, 31, 27);
INSERT INTO `resource` VALUES (28, '通知添加', '/addNotice', 2, 27, 28);
INSERT INTO `resource` VALUES (29, '通知编辑', '/editNotice', 2, 27, 29);
INSERT INTO `resource` VALUES (30, '通知删除', '/delNotice', 2, 27, 30);
INSERT INTO `resource` VALUES (31, '系统', '/sys', 1, 0, 31);
INSERT INTO `resource` VALUES (32, '方向选报任务管理', '/choiceTask/page', 1, 31, 32);
INSERT INTO `resource` VALUES (33, '专业方向管理', '/directionManager', 2, 11, 33);
INSERT INTO `resource` VALUES (34, '添加方向选报任务', '/addTask', 2, 32, 34);
INSERT INTO `resource` VALUES (35, '删除方向选报任务', '/delTask', 2, 32, 35);
INSERT INTO `resource` VALUES (36, '选报方向', '/chooceDirection', 1, 31, 36);
INSERT INTO `resource` VALUES (37, '添加专业方向', '/addDirection', 2, 11, 37);
INSERT INTO `resource` VALUES (38, '删除专业方向', '/delDirection', 2, 11, 38);
INSERT INTO `resource` VALUES (39, '更新专业方向', '/updateDirection', 2, 11, 39);

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
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '普通船员');
INSERT INTO `role` VALUES (2, '中级船员');
INSERT INTO `role` VALUES (3, '高级船员');
INSERT INTO `role` VALUES (4, '船长');

-- ----------------------------
-- Table structure for role_resource
-- ----------------------------
DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE `role_resource`  (
  `role_id` int(11) NOT NULL COMMENT '角色主键',
  `resoure_id` int(11) NOT NULL COMMENT '资源主键',
  PRIMARY KEY (`role_id`, `resoure_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role_resource
-- ----------------------------
INSERT INTO `role_resource` VALUES (1, 11);
INSERT INTO `role_resource` VALUES (1, 33);
INSERT INTO `role_resource` VALUES (1, 36);
INSERT INTO `role_resource` VALUES (2, 1);
INSERT INTO `role_resource` VALUES (2, 2);
INSERT INTO `role_resource` VALUES (2, 3);
INSERT INTO `role_resource` VALUES (2, 5);
INSERT INTO `role_resource` VALUES (2, 6);
INSERT INTO `role_resource` VALUES (2, 7);
INSERT INTO `role_resource` VALUES (2, 8);
INSERT INTO `role_resource` VALUES (2, 10);
INSERT INTO `role_resource` VALUES (2, 11);
INSERT INTO `role_resource` VALUES (2, 12);
INSERT INTO `role_resource` VALUES (2, 13);
INSERT INTO `role_resource` VALUES (2, 15);
INSERT INTO `role_resource` VALUES (2, 27);
INSERT INTO `role_resource` VALUES (2, 28);
INSERT INTO `role_resource` VALUES (2, 29);
INSERT INTO `role_resource` VALUES (3, 1);
INSERT INTO `role_resource` VALUES (3, 2);
INSERT INTO `role_resource` VALUES (3, 3);
INSERT INTO `role_resource` VALUES (3, 5);
INSERT INTO `role_resource` VALUES (3, 11);
INSERT INTO `role_resource` VALUES (3, 12);
INSERT INTO `role_resource` VALUES (3, 13);
INSERT INTO `role_resource` VALUES (3, 15);
INSERT INTO `role_resource` VALUES (3, 27);
INSERT INTO `role_resource` VALUES (3, 28);
INSERT INTO `role_resource` VALUES (3, 29);
INSERT INTO `role_resource` VALUES (4, 1);
INSERT INTO `role_resource` VALUES (4, 2);
INSERT INTO `role_resource` VALUES (4, 3);
INSERT INTO `role_resource` VALUES (4, 4);
INSERT INTO `role_resource` VALUES (4, 5);
INSERT INTO `role_resource` VALUES (4, 6);
INSERT INTO `role_resource` VALUES (4, 7);
INSERT INTO `role_resource` VALUES (4, 8);
INSERT INTO `role_resource` VALUES (4, 9);
INSERT INTO `role_resource` VALUES (4, 10);
INSERT INTO `role_resource` VALUES (4, 11);
INSERT INTO `role_resource` VALUES (4, 12);
INSERT INTO `role_resource` VALUES (4, 13);
INSERT INTO `role_resource` VALUES (4, 14);
INSERT INTO `role_resource` VALUES (4, 15);
INSERT INTO `role_resource` VALUES (4, 16);
INSERT INTO `role_resource` VALUES (4, 17);
INSERT INTO `role_resource` VALUES (4, 18);
INSERT INTO `role_resource` VALUES (4, 20);
INSERT INTO `role_resource` VALUES (4, 21);
INSERT INTO `role_resource` VALUES (4, 22);
INSERT INTO `role_resource` VALUES (4, 24);
INSERT INTO `role_resource` VALUES (4, 25);
INSERT INTO `role_resource` VALUES (4, 26);
INSERT INTO `role_resource` VALUES (4, 27);
INSERT INTO `role_resource` VALUES (4, 28);
INSERT INTO `role_resource` VALUES (4, 29);
INSERT INTO `role_resource` VALUES (4, 30);
INSERT INTO `role_resource` VALUES (4, 32);
INSERT INTO `role_resource` VALUES (4, 33);
INSERT INTO `role_resource` VALUES (4, 37);
INSERT INTO `role_resource` VALUES (4, 38);
INSERT INTO `role_resource` VALUES (4, 39);

-- ----------------------------
-- Table structure for shipinfo
-- ----------------------------
DROP TABLE IF EXISTS `shipinfo`;
CREATE TABLE `shipinfo`  (
  `ship_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '船舶基本信息主键',
  `ship_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '船舶名称',
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
  `state` int(11) NULL DEFAULT 1 COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ship_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_mysql500_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shipinfo
-- ----------------------------
INSERT INTO `shipinfo` VALUES (1, '11', 11.0000, 11.0000, 11.0000, 11.0000, 1.0000, 11.0000, 1, '11', '11', '11', '/image/rotPhoto/20200122051525.png', NULL, 1, '2020-01-22 17:15:27');
INSERT INTO `shipinfo` VALUES (2, '112', 1122.0000, 1124.0000, 15.0000, 225.0000, 225.0000, 2.0000, 2, '2', '2', '22', '/image/rotPhoto/20200122051507.png', NULL, 1, '2020-01-22 17:15:09');
INSERT INTO `shipinfo` VALUES (3, '4', 4.0000, 4.0000, 5.0000, 5.0000, 5.0000, 5.0000, 5, '5', '5', '5', '/image/rotPhoto/20200121033350.png', NULL, 1, '2020-01-22 17:05:39');
INSERT INTO `shipinfo` VALUES (4, 'test', 44.0000, 11.0000, 44.0000, 22.0000, 22.0000, 5.0000, 4, '44', '55', '4', '/image/rotPhoto/20200122050331.png', NULL, 1, '2020-01-22 17:03:44');
INSERT INTO `shipinfo` VALUES (5, '112', 1122.0000, 1124.0000, 15.0000, 225.0000, 225.0000, 2.0000, 2, '2', '2', '22', '/image/rotPhoto/20200122050833.png', NULL, 1, '2020-01-22 17:08:35');

SET FOREIGN_KEY_CHECKS = 1;
