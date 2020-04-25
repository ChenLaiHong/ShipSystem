/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : shipsystem

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-04-25 14:15:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blue_print
-- ----------------------------
DROP TABLE IF EXISTS `blue_print`;
CREATE TABLE `blue_print` (
  `print_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '图纸主键',
  `print_name` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '图纸名称',
  `print_url` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '图纸存放地址',
  `print_alias_name` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '图纸别名',
  `print_type` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '文件类型',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `state` int(11) DEFAULT NULL COMMENT '状态（1：正常，0：停用）',
  PRIMARY KEY (`print_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of blue_print
-- ----------------------------
INSERT INTO `blue_print` VALUES ('1', 'group', '/image/rotPhoto/20200425021410.wxml', '嗯嗯', 'wxml', '2020-04-25 14:14:11', '0');
INSERT INTO `blue_print` VALUES ('2', '时间', '/image/rotPhoto/20200425021419.rar', '测试', 'rar', '2020-04-25 14:14:20', '0');

-- ----------------------------
-- Table structure for crew
-- ----------------------------
DROP TABLE IF EXISTS `crew`;
CREATE TABLE `crew` (
  `login_id` varchar(50) NOT NULL COMMENT '工号，主键',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `password` varchar(255) DEFAULT NULL COMMENT '登陆密码',
  `gender` int(2) DEFAULT NULL COMMENT '性别（0为男，1为女）',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `birth` varchar(50) DEFAULT NULL COMMENT '出生年月',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `household_register` varchar(200) DEFAULT '' COMMENT '户籍',
  `static_live` int(11) DEFAULT '1' COMMENT '是否被删除了（0为删除了，1为不删除）',
  `role_id` int(11) DEFAULT '1' COMMENT '角色（1：普通船员，2：中级船员，3：高级船员，4：船长）',
  PRIMARY KEY (`login_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of crew
-- ----------------------------
INSERT INTO `crew` VALUES ('111', '11222', 'e10adc3949ba59abbe56e057f20f883e', '0', null, null, null, '', '0', '1');
INSERT INTO `crew` VALUES ('12345632', '22', 'e10adc3949ba59abbe56e057f20f883e', '0', null, null, null, '', '0', '2');
INSERT INTO `crew` VALUES ('123456789', '张三', 'e10adc3949ba59abbe56e057f20f883e', '0', null, null, null, '', '1', '2');
INSERT INTO `crew` VALUES ('16210120721', 'test1', 'e10adc3949ba59abbe56e057f20f883e', '0', null, null, null, '', '1', '2');
INSERT INTO `crew` VALUES ('16210120722', 'test', 'e10adc3949ba59abbe56e057f20f883e', '0', null, null, null, '', '1', '1');
INSERT INTO `crew` VALUES ('16210120723', '赖红', 'e10adc3949ba59abbe56e057f20f883e', '1', '17765602540', '1998-01-22', '1185630400@qq.com', '广东省/广州市/海珠区', '1', '1');
INSERT INTO `crew` VALUES ('16210120745', '111', 'e10adc3949ba59abbe56e057f20f883e', '1', null, null, null, '', '0', '1');
INSERT INTO `crew` VALUES ('201613240323', '湛颖鸿', 'e10adc3949ba59abbe56e057f20f883e', '0', '18718934520', '2020-01-24', '1185630455@qq.com', '北京市/北京市/朝阳区', '1', '4');
INSERT INTO `crew` VALUES ('987456321', '张三', 'e10adc3949ba59abbe56e057f20f883e', '1', null, null, null, '', '1', '1');

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `eid` int(11) NOT NULL AUTO_INCREMENT COMMENT '材料设备主键',
  `poisson_ratio` decimal(22,4) DEFAULT NULL COMMENT '泊松比',
  `elastic_modulus` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '弹性模量',
  `equipment_model` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '型号',
  `equipment_price` decimal(22,4) DEFAULT NULL COMMENT '价格',
  `ship_id` int(11) DEFAULT NULL COMMENT '外键，船舶主键',
  `state` int(11) DEFAULT '1' COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`eid`) USING BTREE,
  KEY `ship_id` (`ship_id`) USING BTREE,
  CONSTRAINT `equipment_ibfk_1` FOREIGN KEY (`ship_id`) REFERENCES `shipinfo` (`ship_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('1', '4.0000', '2', '222', '2.3000', '1', '1', '2020-01-25 23:00:32');
INSERT INTO `equipment` VALUES ('2', '2.3000', 'test', 'test', '5.6000', '1', '1', '2020-01-25 23:09:32');
INSERT INTO `equipment` VALUES ('3', '5.6000', 'ss', 'ss', '4.5000', '1', '1', '2020-01-25 23:09:32');
INSERT INTO `equipment` VALUES ('4', '2.3000', 'test', 'test', '5.6000', '1', '0', '2020-01-25 23:09:32');
INSERT INTO `equipment` VALUES ('5', '5.6000', 'ss', 'ss', '4.5000', '1', '0', '2020-01-25 23:09:32');
INSERT INTO `equipment` VALUES ('6', '2.3200', 'testaa', 'test', '15.6000', '3', '0', '2020-01-25 23:15:49');
INSERT INTO `equipment` VALUES ('7', '15.6000', 'ssaa', 'ss', '14.5000', '3', '0', '2020-01-25 23:15:49');
INSERT INTO `equipment` VALUES ('8', '2.3200', 'testaa', 'test', '15.6000', '3', '1', '2020-01-25 23:15:49');
INSERT INTO `equipment` VALUES ('9', '15.6000', 'ssaa', 'ss', '14.5000', '1', '1', '2020-01-25 23:22:40');
INSERT INTO `equipment` VALUES ('10', '4.0000', '44', '4444', '44.2000', '5', '1', '2020-01-26 17:44:54');
INSERT INTO `equipment` VALUES ('11', '5.0000', '55', '6699', '55.2000', '5', '1', '2020-01-27 11:27:00');
INSERT INTO `equipment` VALUES ('12', '4.0000', '44', '4444', '44.2000', '5', '0', '2020-01-26 17:44:54');
INSERT INTO `equipment` VALUES ('13', '5.0000', '55', '5555', '55.2000', '5', '0', '2020-01-26 17:44:54');
INSERT INTO `equipment` VALUES ('14', null, null, null, null, '2', '1', '2020-01-27 11:36:07');

-- ----------------------------
-- Table structure for goodsoperate
-- ----------------------------
DROP TABLE IF EXISTS `goodsoperate`;
CREATE TABLE `goodsoperate` (
  `operate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '货物运营主键',
  `operate_name` varchar(30) COLLATE utf8_general_mysql500_ci NOT NULL COMMENT '货物名称',
  `bearing_weight` decimal(22,4) DEFAULT NULL COMMENT '承载重量',
  `things_type` int(11) DEFAULT NULL COMMENT '货物类型\r\n(\r\n0：Traveler 旅客,\r\n1：Dangerous Cargo 危险货物，\r\n2：Awkward & Length Cargo 重大长件货物，\r\n3：Bulk Cargo 散装货物，\r\n4：Liquid Cargo 液体货物，\r\n5：Smelled Cargo 气味货物，\r\n6：Food Cargo 食品货物，\r\n7：Dusty and Dirty Cargo 扬尘污染货物，\r\n8：Clean Cargo 清洁货物，\r\n9：Refrigerated Cargo 冷藏货物，\r\n10：Fragile Cargo 易碎货答物，\r\n11：Valuable Cargo 贵重货物，\r\n12：Livestock Cargo 活牲畜货物，\r\n13：Liquefied Cargo 液化货物，\r\n14：Hygroscopic Cargo 易潮货物，\r\n15：General Cargo 普通货物\r\n)',
  `operate_type` int(11) DEFAULT NULL COMMENT '船舶类型（1：客船，2：干货船，3：液货船，4：滚装船）',
  `operate_price` decimal(10,2) DEFAULT NULL COMMENT '货物价格',
  `state` int(11) DEFAULT '1' COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `ship_id` int(11) DEFAULT NULL COMMENT '外键，船舶主键',
  PRIMARY KEY (`operate_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of goodsoperate
-- ----------------------------
INSERT INTO `goodsoperate` VALUES ('4', 'ces', '154.0000', '1', '2', '263.00', '1', '2020-04-23 23:38:16', '4');

-- ----------------------------
-- Table structure for grate
-- ----------------------------
DROP TABLE IF EXISTS `grate`;
CREATE TABLE `grate` (
  `grade_id` int(11) NOT NULL AUTO_INCREMENT,
  `grade_name` varchar(50) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '等级名',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `state` int(2) DEFAULT '1' COMMENT '状态（1：正常，0：非正常）',
  PRIMARY KEY (`grade_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of grate
-- ----------------------------
INSERT INTO `grate` VALUES ('1', '驾驶部', '2020-04-18 22:22:40', '1');
INSERT INTO `grate` VALUES ('2', '轮机部', '2020-04-18 22:16:31', '1');
INSERT INTO `grate` VALUES ('3', '管事部', '2020-04-18 22:16:44', '1');
INSERT INTO `grate` VALUES ('4', '普通船员', '2020-04-18 22:16:51', '0');

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `person_id` varchar(255) NOT NULL COMMENT '工号',
  `person_photo` varchar(255) DEFAULT NULL COMMENT '头像地址',
  PRIMARY KEY (`person_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES ('16210120723', '/image/rotPhoto/20200123111542.jpg');
INSERT INTO `image` VALUES ('201613240323', '/image/rotPhoto/20200120122946.jpg');

-- ----------------------------
-- Table structure for main_tain
-- ----------------------------
DROP TABLE IF EXISTS `main_tain`;
CREATE TABLE `main_tain` (
  `main_tain_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '养护主键',
  `main_tain_name` varchar(50) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '保养名称',
  `main_tain_remark` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '备注',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `state` int(11) DEFAULT NULL COMMENT '状态（1：正常，0：非正常）',
  PRIMARY KEY (`main_tain_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci COMMENT='保修\r\n';

-- ----------------------------
-- Records of main_tain
-- ----------------------------
INSERT INTO `main_tain` VALUES ('1', '装卸载设备', '检修负责人：大副；养护负责人：水手长、木匠', '2020-04-18 23:37:57', '0');
INSERT INTO `main_tain` VALUES ('2', '系泊系统设备', '检修负责人：大副；养护负责人水手长、木匠', '2020-04-18 23:38:23', '1');

-- ----------------------------
-- Table structure for note_pad
-- ----------------------------
DROP TABLE IF EXISTS `note_pad`;
CREATE TABLE `note_pad` (
  `note_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记事本主键',
  `time` date DEFAULT NULL COMMENT '时间',
  `value` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '事件',
  `user_id` varchar(200) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '用户id',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  `state` int(2) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`note_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of note_pad
-- ----------------------------
INSERT INTO `note_pad` VALUES ('1', '2020-04-21', '嗯嗯', '201613240323', '2020-04-20', '1');
INSERT INTO `note_pad` VALUES ('2', '2020-04-15', '去哪', '201613240323', '2020-04-21', '1');
INSERT INTO `note_pad` VALUES ('3', '2020-04-23', '开会', '201613240323', '2020-04-21', '1');
INSERT INTO `note_pad` VALUES ('4', '2020-04-22', '咔咔', '16210120723', '2020-04-21', '1');
INSERT INTO `note_pad` VALUES ('5', '2020-04-01', '做事', '201613240323', '2020-04-21', '1');
INSERT INTO `note_pad` VALUES ('6', '2020-04-09', '哈哈', '16210120723', '2020-04-21', '1');

-- ----------------------------
-- Table structure for repair
-- ----------------------------
DROP TABLE IF EXISTS `repair`;
CREATE TABLE `repair` (
  `repair_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '维修保养主键',
  `equipment_usage` text COLLATE utf8_general_mysql500_ci COMMENT '设备使用情况',
  `use_year` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '使用年限',
  `manage` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '管理',
  `ship_maintenance` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '船舶维修',
  `ship_report` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '船检报告',
  `consumption` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '消费记录',
  `state` int(11) DEFAULT '1' COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `ship_id` int(11) DEFAULT NULL COMMENT '外键（船舶主键）',
  PRIMARY KEY (`repair_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of repair
-- ----------------------------
INSERT INTO `repair` VALUES ('1', null, '5年', '测试流量', '222啊啊', '', '是是是', '1', '2020-01-26 22:05:40', '1');
INSERT INTO `repair` VALUES ('2', null, '4年', '是是是', '对对对', '/image/rotPhoto/20200126105155.xls', '额鹅鹅鹅', '1', '2020-01-26 22:51:56', '2');
INSERT INTO `repair` VALUES ('3', '是的发送到发电风扇', '8年', '是的发生', '水电费', '/image/rotPhoto/20200127113004.xls', '是的', '1', '2020-01-27 11:30:06', '1');

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `resoure_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源主键',
  `name` varchar(50) DEFAULT NULL COMMENT '资源名称',
  `resoure_url` varchar(100) DEFAULT NULL COMMENT '资源地址',
  `resource_type` int(2) DEFAULT NULL COMMENT '资源类型（1：列表，2：按钮）',
  `resource_parent_id` int(11) DEFAULT NULL COMMENT '属于哪个资源的子资源',
  `resource_sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`resoure_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of resource
-- ----------------------------
INSERT INTO `resource` VALUES ('1', '船员管理', '/toCrew', '1', '31', '1');
INSERT INTO `resource` VALUES ('2', '船员添加', '/addCrew', '2', '1', '2');
INSERT INTO `resource` VALUES ('3', '船员修改', '/editCrew', '2', '1', '3');
INSERT INTO `resource` VALUES ('4', '船员删除', '/delCrew', '2', '1', '4');
INSERT INTO `resource` VALUES ('5', '船员导出', '/exportCrew', '2', '1', '5');
INSERT INTO `resource` VALUES ('6', '船舶管理', '/toShipInfo', '1', '31', '6');
INSERT INTO `resource` VALUES ('7', '船舶添加', '/addShipInfo', '2', '6', '7');
INSERT INTO `resource` VALUES ('8', '船舶修改', '/editShipInfo', '2', '6', '8');
INSERT INTO `resource` VALUES ('9', '船舶删除', '/delShipInfo', '2', '6', '9');
INSERT INTO `resource` VALUES ('10', '船舶导出', '/exportShipInfo', '2', '6', '10');
INSERT INTO `resource` VALUES ('11', '设备管理', '/toEquipment', '1', '31', '11');
INSERT INTO `resource` VALUES ('12', '设备添加', '/addEquipment', '2', '11', '12');
INSERT INTO `resource` VALUES ('13', '设备修改', '/editEquipment', '2', '11', '13');
INSERT INTO `resource` VALUES ('14', '设备删除', '/delEquipment', '2', '11', '14');
INSERT INTO `resource` VALUES ('15', '设备导出', '/exportEquipment', '2', '11', '15');
INSERT INTO `resource` VALUES ('20', '货物管理', '/toGoods', '1', '31', '20');
INSERT INTO `resource` VALUES ('21', '货物添加', '/addGoods', '2', '20', '21');
INSERT INTO `resource` VALUES ('22', '货物编辑', '/editGoods', '2', '20', '22');
INSERT INTO `resource` VALUES ('23', '货物删除', '/delGoods', '2', '20', '23');
INSERT INTO `resource` VALUES ('24', '角色管理', '/toRole', '1', '31', '24');
INSERT INTO `resource` VALUES ('25', '角色添加', '/addRole', '2', '24', '25');
INSERT INTO `resource` VALUES ('26', '角色修改', '/editRole', '2', '24', '26');
INSERT INTO `resource` VALUES ('27', '维修管理', '/toRepair', '1', '31', '27');
INSERT INTO `resource` VALUES ('28', '维修添加', '/addRepair', '2', '27', '28');
INSERT INTO `resource` VALUES ('29', '维修编辑', '/editRepair', '2', '27', '29');
INSERT INTO `resource` VALUES ('30', '维修删除', '/delRepair', '2', '27', '30');
INSERT INTO `resource` VALUES ('31', '系统', '/sys', '1', '0', '31');
INSERT INTO `resource` VALUES ('32', '等级管理', '/toGrate', '1', '31', '32');
INSERT INTO `resource` VALUES ('33', '等级添加', '/addGrate', '2', '32', '33');
INSERT INTO `resource` VALUES ('34', '等级删除', '/delGrate', '2', '32', '34');
INSERT INTO `resource` VALUES ('35', '等级修改', '/editGrate', '2', '32', '35');
INSERT INTO `resource` VALUES ('36', '保修管理', '/toTain', '1', '31', '36');
INSERT INTO `resource` VALUES ('37', '保修添加', '/addTain', '2', '36', '37');
INSERT INTO `resource` VALUES ('38', '保修修改', '/editTain', '2', '36', '38');
INSERT INTO `resource` VALUES ('39', '保修删除', '/delTain', '2', '36', '39');
INSERT INTO `resource` VALUES ('40', '保修项目管理', '/toShipItems', '1', '31', '40');
INSERT INTO `resource` VALUES ('41', '保修项目添加', '/addItems', '2', '40', '41');
INSERT INTO `resource` VALUES ('42', '保修项目修改', '/editItems', '2', '40', '42');
INSERT INTO `resource` VALUES ('43', '保修项目删除', '/delItems', '2', '40', '43');
INSERT INTO `resource` VALUES ('44', '图纸管理', '/toPrint', '1', '31', '44');
INSERT INTO `resource` VALUES ('45', '图纸添加', '/addPrint', '2', '44', '45');
INSERT INTO `resource` VALUES ('46', '图纸修改', '/editPrint', '2', '44', '46');
INSERT INTO `resource` VALUES ('47', '图纸删除', '/delPrint', '2', '44', '47');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色主键',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '普通船员');
INSERT INTO `role` VALUES ('2', '中级船员');
INSERT INTO `role` VALUES ('3', '高级船员');
INSERT INTO `role` VALUES ('4', '船长');
INSERT INTO `role` VALUES ('5', '测试');

-- ----------------------------
-- Table structure for role_resource
-- ----------------------------
DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE `role_resource` (
  `role_id` int(11) NOT NULL COMMENT '角色主键',
  `resoure_id` int(11) NOT NULL COMMENT '资源主键',
  PRIMARY KEY (`role_id`,`resoure_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of role_resource
-- ----------------------------
INSERT INTO `role_resource` VALUES ('1', '11');
INSERT INTO `role_resource` VALUES ('2', '1');
INSERT INTO `role_resource` VALUES ('2', '2');
INSERT INTO `role_resource` VALUES ('2', '3');
INSERT INTO `role_resource` VALUES ('2', '5');
INSERT INTO `role_resource` VALUES ('2', '6');
INSERT INTO `role_resource` VALUES ('2', '7');
INSERT INTO `role_resource` VALUES ('2', '8');
INSERT INTO `role_resource` VALUES ('2', '10');
INSERT INTO `role_resource` VALUES ('2', '11');
INSERT INTO `role_resource` VALUES ('2', '12');
INSERT INTO `role_resource` VALUES ('2', '13');
INSERT INTO `role_resource` VALUES ('2', '15');
INSERT INTO `role_resource` VALUES ('2', '27');
INSERT INTO `role_resource` VALUES ('2', '28');
INSERT INTO `role_resource` VALUES ('2', '29');
INSERT INTO `role_resource` VALUES ('3', '1');
INSERT INTO `role_resource` VALUES ('3', '2');
INSERT INTO `role_resource` VALUES ('3', '3');
INSERT INTO `role_resource` VALUES ('3', '5');
INSERT INTO `role_resource` VALUES ('3', '11');
INSERT INTO `role_resource` VALUES ('3', '12');
INSERT INTO `role_resource` VALUES ('3', '13');
INSERT INTO `role_resource` VALUES ('3', '15');
INSERT INTO `role_resource` VALUES ('3', '27');
INSERT INTO `role_resource` VALUES ('3', '28');
INSERT INTO `role_resource` VALUES ('3', '29');
INSERT INTO `role_resource` VALUES ('4', '1');
INSERT INTO `role_resource` VALUES ('4', '2');
INSERT INTO `role_resource` VALUES ('4', '3');
INSERT INTO `role_resource` VALUES ('4', '4');
INSERT INTO `role_resource` VALUES ('4', '5');
INSERT INTO `role_resource` VALUES ('4', '6');
INSERT INTO `role_resource` VALUES ('4', '7');
INSERT INTO `role_resource` VALUES ('4', '8');
INSERT INTO `role_resource` VALUES ('4', '9');
INSERT INTO `role_resource` VALUES ('4', '10');
INSERT INTO `role_resource` VALUES ('4', '11');
INSERT INTO `role_resource` VALUES ('4', '12');
INSERT INTO `role_resource` VALUES ('4', '13');
INSERT INTO `role_resource` VALUES ('4', '14');
INSERT INTO `role_resource` VALUES ('4', '15');
INSERT INTO `role_resource` VALUES ('4', '16');
INSERT INTO `role_resource` VALUES ('4', '17');
INSERT INTO `role_resource` VALUES ('4', '18');
INSERT INTO `role_resource` VALUES ('4', '20');
INSERT INTO `role_resource` VALUES ('4', '21');
INSERT INTO `role_resource` VALUES ('4', '22');
INSERT INTO `role_resource` VALUES ('4', '24');
INSERT INTO `role_resource` VALUES ('4', '25');
INSERT INTO `role_resource` VALUES ('4', '26');
INSERT INTO `role_resource` VALUES ('4', '27');
INSERT INTO `role_resource` VALUES ('4', '28');
INSERT INTO `role_resource` VALUES ('4', '29');
INSERT INTO `role_resource` VALUES ('4', '30');
INSERT INTO `role_resource` VALUES ('4', '32');
INSERT INTO `role_resource` VALUES ('4', '33');
INSERT INTO `role_resource` VALUES ('4', '34');
INSERT INTO `role_resource` VALUES ('4', '35');
INSERT INTO `role_resource` VALUES ('4', '36');
INSERT INTO `role_resource` VALUES ('4', '37');
INSERT INTO `role_resource` VALUES ('4', '38');
INSERT INTO `role_resource` VALUES ('4', '39');
INSERT INTO `role_resource` VALUES ('4', '40');
INSERT INTO `role_resource` VALUES ('4', '41');
INSERT INTO `role_resource` VALUES ('4', '42');
INSERT INTO `role_resource` VALUES ('4', '43');
INSERT INTO `role_resource` VALUES ('4', '44');
INSERT INTO `role_resource` VALUES ('4', '45');
INSERT INTO `role_resource` VALUES ('4', '46');
INSERT INTO `role_resource` VALUES ('4', '47');

-- ----------------------------
-- Table structure for second_grade
-- ----------------------------
DROP TABLE IF EXISTS `second_grade`;
CREATE TABLE `second_grade` (
  `second_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '二级主键',
  `second_name` varchar(50) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '二级名称',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `state` int(2) DEFAULT NULL COMMENT '状态',
  `grade_id` int(11) DEFAULT NULL COMMENT '一级外键',
  PRIMARY KEY (`second_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of second_grade
-- ----------------------------
INSERT INTO `second_grade` VALUES ('1', '大副', '2020-04-18 23:04:22', '0', '1');
INSERT INTO `second_grade` VALUES ('2', '二副', '2020-04-18 23:04:13', '1', '1');

-- ----------------------------
-- Table structure for shipinfo
-- ----------------------------
DROP TABLE IF EXISTS `shipinfo`;
CREATE TABLE `shipinfo` (
  `ship_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '船舶基本信息主键',
  `ship_name` varchar(100) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '船舶名称',
  `total_length` decimal(22,4) DEFAULT NULL COMMENT '总长',
  `type_width` decimal(22,4) DEFAULT NULL COMMENT '型宽',
  `type_depth` decimal(22,4) DEFAULT NULL COMMENT '型深',
  `displacement` decimal(22,4) DEFAULT NULL COMMENT '排水量',
  `design_draft` decimal(22,4) DEFAULT NULL COMMENT '设计型吃水',
  `structural_draft` decimal(22,4) DEFAULT NULL COMMENT '结构型吃水',
  `hold_number` int(11) DEFAULT NULL COMMENT '设计货舱个数',
  `temperature` varchar(50) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '液货船设计温度',
  `cargo_proportion` varchar(50) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '设计液货比重',
  `steam_pressure` varchar(50) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '设计液货舱顶蒸汽压力',
  `ship_image` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '图纸',
  `other_file` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '其他文件',
  `state` int(11) DEFAULT '1' COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ship_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of shipinfo
-- ----------------------------
INSERT INTO `shipinfo` VALUES ('1', '啊啊啊', '11.0000', '11.0000', '11.0000', '11.0000', '1.0000', '11.0000', '1', '11', '11', '11', '/image/rotPhoto/20200122051525.png', null, '0', '2020-01-22 17:15:27');
INSERT INTO `shipinfo` VALUES ('2', '112', '1122.0000', '1124.0000', '15.0000', '225.0000', '225.0000', '2.0000', '2', '2', '2', '22', '/image/rotPhoto/20200122051507.png', null, '0', '2020-01-22 17:15:09');
INSERT INTO `shipinfo` VALUES ('3', '4', '4.0000', '4.0000', '5.0000', '5.0000', '5.0000', '5.0000', '5', '5', '5', '5', '/image/rotPhoto/20200121033350.png', null, '0', '2020-01-22 17:05:39');
INSERT INTO `shipinfo` VALUES ('4', 'test', '44.0000', '11.0000', '44.0000', '22.0000', '22.0000', '5.0000', '4', '44', '55', '4', '/image/rotPhoto/20200217102826.png', '/image/rotPhoto/20200217102834.rvt', '1', '2020-02-17 22:28:36');
INSERT INTO `shipinfo` VALUES ('5', '11222', '1122.0000', '1124.0000', '15.0000', '225.0000', '225.0000', '2.0000', '2', '2', '2', '22', '/image/rotPhoto/20200125020044.png', '/image/rotPhoto/20200125020057.xlsx', '1', '2020-01-26 22:29:56');
INSERT INTO `shipinfo` VALUES ('6', '123456789', '3.0000', '3.0000', '3.0000', '3.0000', '3.0000', '3.0000', '3', '3', '3', '3', '/image/rotPhoto/20200126102706.png', '/image/rotPhoto/20200217102942.rvt', '1', '2020-02-17 22:29:45');

-- ----------------------------
-- Table structure for tain_items
-- ----------------------------
DROP TABLE IF EXISTS `tain_items`;
CREATE TABLE `tain_items` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '项目主键',
  `item_name` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '项目名称',
  `item_demand` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '项目要求',
  `item_cycle` varchar(100) COLLATE utf8_general_mysql500_ci DEFAULT NULL COMMENT '项目周期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `state` int(2) DEFAULT '1' COMMENT '状态（1：正常，0：非正常）',
  `main_tain_id` int(11) DEFAULT NULL COMMENT '保修外键',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci COMMENT='保修项\r\n';

-- ----------------------------
-- Records of tain_items
-- ----------------------------
INSERT INTO `tain_items` VALUES ('1', '各层甲板、船壳外板', '检查腐蚀、损伤、变形、水密情况，除锈、油漆，每年统油一度', '每季度', '2020-04-19 01:13:03', '1', '1');
INSERT INTO `tain_items` VALUES ('2', '肋骨、桁梁、支柱、龙骨板', '检查腐蚀、损伤、变形、水密情况', '每季度', '2020-04-19 01:13:31', '1', '1');
INSERT INTO `tain_items` VALUES ('3', '磁罗经', '检查液体有无气泡，罗经刻度盘转动是否灵活，误差有误异常变化。', '每季度', '2020-04-19 01:14:06', '1', '2');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(11) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `owner` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', '李四a', '2', '张三');
