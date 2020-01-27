/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : shipsystem

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-01-27 11:55:10
*/

SET FOREIGN_KEY_CHECKS=0;

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
  `operate_type` int(11) DEFAULT NULL COMMENT '运输货物类型（1：客船，2：干货船，3：液货船，4：滚装船）',
  `bearing_weight` decimal(22,4) DEFAULT NULL COMMENT '承载重量',
  `operate_price` decimal(10,2) DEFAULT NULL COMMENT '货物价格',
  `state` int(11) DEFAULT '1' COMMENT '状态（1：正常；0：抛弃）',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `ship_id` int(11) DEFAULT NULL COMMENT '外键，船舶主键',
  PRIMARY KEY (`operate_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of goodsoperate
-- ----------------------------
INSERT INTO `goodsoperate` VALUES ('1', '1', '45.3000', '55.30', '1', '2020-01-27 11:38:48', '2');
INSERT INTO `goodsoperate` VALUES ('2', '2', '236.0000', '365.00', '1', '2020-01-27 11:43:40', '1');
INSERT INTO `goodsoperate` VALUES ('3', '3', '63.5000', '548.60', '0', '2020-01-27 11:48:04', '4');

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
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

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

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL COMMENT '角色主键',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '普通船员');
INSERT INTO `role` VALUES ('2', '中级船员');
INSERT INTO `role` VALUES ('3', '高级船员');
INSERT INTO `role` VALUES ('4', '船长');

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
INSERT INTO `shipinfo` VALUES ('4', 'test', '44.0000', '11.0000', '44.0000', '22.0000', '22.0000', '5.0000', '4', '44', '55', '4', '/image/rotPhoto/20200122050331.png', null, '1', '2020-01-22 17:03:44');
INSERT INTO `shipinfo` VALUES ('5', '11222', '1122.0000', '1124.0000', '15.0000', '225.0000', '225.0000', '2.0000', '2', '2', '2', '22', '/image/rotPhoto/20200125020044.png', '/image/rotPhoto/20200125020057.xlsx', '1', '2020-01-26 22:29:56');
INSERT INTO `shipinfo` VALUES ('6', '123456789', '3.0000', '3.0000', '3.0000', '3.0000', '3.0000', '3.0000', '3', '3', '3', '3', '/image/rotPhoto/20200126102706.png', '', '1', '2020-01-26 22:28:09');
