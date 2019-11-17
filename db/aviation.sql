/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : aviation

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 18/09/2019 09:02:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for f_airplane
-- ----------------------------
DROP TABLE IF EXISTS `f_airplane`;
CREATE TABLE `f_airplane`  (
  `plane_id` int(11) NOT NULL AUTO_INCREMENT,
  `plane_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '航班名称',
  `plane_seat` int(11) NOT NULL COMMENT '飞机座位数',
  `plane_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '飞机型号',
  `plane_locationx` int(11) NULL DEFAULT NULL COMMENT '飞机座位宽度',
  `plane_locationy` int(11) NULL DEFAULT NULL COMMENT '飞机座位长度',
  `plane_use` int(11) NOT NULL COMMENT '飞机可用：0，不可用：1',
  PRIMARY KEY (`plane_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of f_airplane
-- ----------------------------
INSERT INTO `f_airplane` VALUES (1, 'SA123', 180, '空客A233', 0, 0, 0);
INSERT INTO `f_airplane` VALUES (2, 'SA321', 216, '波音A233', 0, 0, 0);
INSERT INTO `f_airplane` VALUES (3, 'SA234', 192, '空客B233', 7, 30, 0);
INSERT INTO `f_airplane` VALUES (4, 'SA432', 186, '波音B233', 0, 0, 0);

-- ----------------------------
-- Table structure for f_orderinfo
-- ----------------------------
DROP TABLE IF EXISTS `f_orderinfo`;
CREATE TABLE `f_orderinfo`  (
  `order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '座位id',
  `seat_id` int(11) NOT NULL DEFAULT 0 COMMENT '座位id',
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '旅客姓名',
  `u_id_type` int(11) NULL DEFAULT NULL COMMENT '证件类型  身份证 0，护照 1',
  `u_id_num1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '证件号码',
  `seat_type` int(11) NULL DEFAULT NULL COMMENT '座位等级，头等舱 0；商务舱 1；经济舱 2',
  `plane_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '航班名称',
  `plane_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4543 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of f_orderinfo
-- ----------------------------
INSERT INTO `f_orderinfo` VALUES (4526, 211, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4527, 212, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4528, 213, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4529, 215, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4530, 216, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4531, 217, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4532, 218, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4533, 219, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4534, 220, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4535, 222, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4536, 223, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4537, 224, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4538, 225, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4539, 226, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4540, 227, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4541, 229, 'zs', NULL, NULL, NULL, 'SA321', NULL);
INSERT INTO `f_orderinfo` VALUES (4542, 293, 'zs', NULL, NULL, NULL, 'SA321', NULL);

-- ----------------------------
-- Table structure for f_person_demand
-- ----------------------------
DROP TABLE IF EXISTS `f_person_demand`;
CREATE TABLE `f_person_demand`  (
  `demand_id` int(11) NOT NULL AUTO_INCREMENT,
  `userinfo_id` int(11) NOT NULL COMMENT '用户id',
  `order_id` int(11) NULL DEFAULT NULL COMMENT '订单编号',
  `plane_id` int(11) NOT NULL,
  `demand_renshu` int(11) NULL DEFAULT NULL COMMENT '人数',
  `demand_women` int(11) NULL DEFAULT NULL COMMENT '年轻女性',
  `demand_men` int(11) NULL DEFAULT NULL COMMENT '年轻男性',
  `demand_nobaby` int(11) NULL DEFAULT NULL COMMENT '四周无婴儿',
  `demand_window` int(11) NULL DEFAULT NULL COMMENT '靠窗：0，不靠窗：1',
  `demand_aisle` int(11) NULL DEFAULT NULL COMMENT '靠过道：0，不：1',
  `demand_front` int(11) NULL DEFAULT NULL COMMENT '靠前：0，不：',
  `demand_exit` int(11) NULL DEFAULT NULL COMMENT '紧急出口：0，不：1',
  `demand_spacious` int(11) NULL DEFAULT NULL COMMENT '腿部宽敞：0，不：1',
  `demand_gate` int(11) NULL DEFAULT NULL COMMENT '登机口：0，不：1',
  `demand_baby` int(11) NULL DEFAULT NULL COMMENT '婴儿座位：0，不：1',
  `demand_all` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '全部需求',
  `demand_manzu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '满足的需求',
  PRIMARY KEY (`demand_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 188 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of f_person_demand
-- ----------------------------
INSERT INTO `f_person_demand` VALUES (184, 1, 4542, 2, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, '婴儿挂载,登机口,紧急出口,靠窗,腿部宽敞', NULL);
INSERT INTO `f_person_demand` VALUES (185, 1, 0, 2, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, NULL, NULL);
INSERT INTO `f_person_demand` VALUES (186, 1, 0, 2, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, NULL, NULL);
INSERT INTO `f_person_demand` VALUES (187, 1, 0, 2, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, NULL, NULL);

-- ----------------------------
-- Table structure for f_seattype
-- ----------------------------
DROP TABLE IF EXISTS `f_seattype`;
CREATE TABLE `f_seattype`  (
  `seat_id` int(11) NOT NULL AUTO_INCREMENT,
  `plane_id` int(11) NOT NULL,
  `seat_yn` int(11) NOT NULL COMMENT '座位：0，不：1',
  `seat_type` int(11) NOT NULL COMMENT '座位等级，头等舱 0；商务舱 1；经济舱 2',
  `seat_window` int(11) NOT NULL COMMENT '靠窗：0，不靠窗：1',
  `seat_aisle` int(11) NOT NULL COMMENT '靠过道：0，不：1',
  `seat_front` int(11) NOT NULL COMMENT '靠前：0，不：',
  `seat_exit` int(11) NOT NULL COMMENT '紧急出口：0，不：1',
  `seat_spacious` int(11) NOT NULL COMMENT '腿部宽敞：0，不：1',
  `seat_gate` int(11) NOT NULL COMMENT '登机口：0，不：1',
  `seat_baby` int(11) NOT NULL COMMENT '婴儿座位：0，不：1',
  `seat_locationx` int(11) NOT NULL,
  `seat_locationy` int(11) NOT NULL,
  `seat_locationname` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`seat_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 904 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of f_seattype
-- ----------------------------
INSERT INTO `f_seattype` VALUES (1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, NULL);
INSERT INTO `f_seattype` VALUES (2, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, NULL);
INSERT INTO `f_seattype` VALUES (3, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 2, NULL);
INSERT INTO `f_seattype` VALUES (4, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 3, NULL);
INSERT INTO `f_seattype` VALUES (5, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 4, NULL);
INSERT INTO `f_seattype` VALUES (6, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 5, NULL);
INSERT INTO `f_seattype` VALUES (7, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 6, NULL);
INSERT INTO `f_seattype` VALUES (8, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 6, NULL);
INSERT INTO `f_seattype` VALUES (9, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 5, NULL);
INSERT INTO `f_seattype` VALUES (10, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 4, NULL);
INSERT INTO `f_seattype` VALUES (11, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 3, NULL);
INSERT INTO `f_seattype` VALUES (12, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 2, NULL);
INSERT INTO `f_seattype` VALUES (13, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, NULL);
INSERT INTO `f_seattype` VALUES (14, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, NULL);
INSERT INTO `f_seattype` VALUES (15, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 0, NULL);
INSERT INTO `f_seattype` VALUES (16, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 1, NULL);
INSERT INTO `f_seattype` VALUES (17, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 2, 2, NULL);
INSERT INTO `f_seattype` VALUES (18, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, NULL);
INSERT INTO `f_seattype` VALUES (19, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 2, 4, NULL);
INSERT INTO `f_seattype` VALUES (20, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 5, NULL);
INSERT INTO `f_seattype` VALUES (21, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 6, NULL);
INSERT INTO `f_seattype` VALUES (22, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 3, 6, NULL);
INSERT INTO `f_seattype` VALUES (23, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 5, NULL);
INSERT INTO `f_seattype` VALUES (24, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 3, 4, NULL);
INSERT INTO `f_seattype` VALUES (25, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 3, 3, NULL);
INSERT INTO `f_seattype` VALUES (26, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 3, 2, NULL);
INSERT INTO `f_seattype` VALUES (27, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 1, NULL);
INSERT INTO `f_seattype` VALUES (28, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 0, NULL);
INSERT INTO `f_seattype` VALUES (29, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 4, 0, NULL);
INSERT INTO `f_seattype` VALUES (30, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 4, 1, NULL);
INSERT INTO `f_seattype` VALUES (31, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 4, 2, NULL);
INSERT INTO `f_seattype` VALUES (32, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 4, 3, NULL);
INSERT INTO `f_seattype` VALUES (33, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 4, 4, NULL);
INSERT INTO `f_seattype` VALUES (34, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 4, 5, NULL);
INSERT INTO `f_seattype` VALUES (35, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 4, 6, NULL);
INSERT INTO `f_seattype` VALUES (36, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 5, 6, NULL);
INSERT INTO `f_seattype` VALUES (37, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 5, 5, NULL);
INSERT INTO `f_seattype` VALUES (38, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 5, 4, NULL);
INSERT INTO `f_seattype` VALUES (39, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 5, 3, NULL);
INSERT INTO `f_seattype` VALUES (40, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 5, 2, NULL);
INSERT INTO `f_seattype` VALUES (41, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 5, 1, NULL);
INSERT INTO `f_seattype` VALUES (42, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 5, 0, NULL);
INSERT INTO `f_seattype` VALUES (43, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 6, 0, NULL);
INSERT INTO `f_seattype` VALUES (44, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 6, 1, NULL);
INSERT INTO `f_seattype` VALUES (45, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 6, 2, NULL);
INSERT INTO `f_seattype` VALUES (46, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 6, 3, NULL);
INSERT INTO `f_seattype` VALUES (47, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 6, 4, NULL);
INSERT INTO `f_seattype` VALUES (48, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 6, 5, NULL);
INSERT INTO `f_seattype` VALUES (49, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 6, 6, NULL);
INSERT INTO `f_seattype` VALUES (50, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 7, 6, NULL);
INSERT INTO `f_seattype` VALUES (51, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 7, 5, NULL);
INSERT INTO `f_seattype` VALUES (52, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 7, 4, NULL);
INSERT INTO `f_seattype` VALUES (53, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 7, 3, NULL);
INSERT INTO `f_seattype` VALUES (54, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 7, 2, NULL);
INSERT INTO `f_seattype` VALUES (55, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 7, 1, NULL);
INSERT INTO `f_seattype` VALUES (56, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 7, 0, NULL);
INSERT INTO `f_seattype` VALUES (57, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 8, 0, NULL);
INSERT INTO `f_seattype` VALUES (58, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 8, 1, NULL);
INSERT INTO `f_seattype` VALUES (59, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 2, NULL);
INSERT INTO `f_seattype` VALUES (60, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 8, 3, NULL);
INSERT INTO `f_seattype` VALUES (61, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 4, NULL);
INSERT INTO `f_seattype` VALUES (62, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 8, 5, NULL);
INSERT INTO `f_seattype` VALUES (63, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 8, 6, NULL);
INSERT INTO `f_seattype` VALUES (64, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 9, 6, NULL);
INSERT INTO `f_seattype` VALUES (65, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 9, 5, NULL);
INSERT INTO `f_seattype` VALUES (66, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 9, 4, NULL);
INSERT INTO `f_seattype` VALUES (67, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 9, 3, NULL);
INSERT INTO `f_seattype` VALUES (68, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 9, 2, NULL);
INSERT INTO `f_seattype` VALUES (69, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 9, 1, NULL);
INSERT INTO `f_seattype` VALUES (70, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 9, 0, NULL);
INSERT INTO `f_seattype` VALUES (71, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 10, 0, NULL);
INSERT INTO `f_seattype` VALUES (72, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 10, 1, NULL);
INSERT INTO `f_seattype` VALUES (73, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 10, 2, NULL);
INSERT INTO `f_seattype` VALUES (74, 1, 1, 2, 1, 1, 0, 1, 0, 1, 1, 10, 3, NULL);
INSERT INTO `f_seattype` VALUES (75, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 10, 4, NULL);
INSERT INTO `f_seattype` VALUES (76, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 10, 5, NULL);
INSERT INTO `f_seattype` VALUES (77, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 10, 6, NULL);
INSERT INTO `f_seattype` VALUES (78, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 11, 6, NULL);
INSERT INTO `f_seattype` VALUES (79, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 11, 5, NULL);
INSERT INTO `f_seattype` VALUES (80, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 11, 4, NULL);
INSERT INTO `f_seattype` VALUES (81, 1, 1, 2, 1, 1, 0, 1, 0, 1, 1, 11, 3, NULL);
INSERT INTO `f_seattype` VALUES (82, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 11, 2, NULL);
INSERT INTO `f_seattype` VALUES (83, 1, 0, 2, 1, 1, 0, 1, 1, 1, 0, 11, 1, NULL);
INSERT INTO `f_seattype` VALUES (84, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 11, 0, NULL);
INSERT INTO `f_seattype` VALUES (85, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 12, 0, NULL);
INSERT INTO `f_seattype` VALUES (86, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 12, 1, NULL);
INSERT INTO `f_seattype` VALUES (87, 1, 0, 2, 1, 0, 0, 0, 0, 1, 1, 12, 2, NULL);
INSERT INTO `f_seattype` VALUES (88, 1, 1, 2, 1, 1, 0, 1, 0, 1, 1, 12, 3, NULL);
INSERT INTO `f_seattype` VALUES (89, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 12, 4, NULL);
INSERT INTO `f_seattype` VALUES (90, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 12, 5, NULL);
INSERT INTO `f_seattype` VALUES (91, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 12, 6, NULL);
INSERT INTO `f_seattype` VALUES (92, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 13, 6, NULL);
INSERT INTO `f_seattype` VALUES (93, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 13, 5, NULL);
INSERT INTO `f_seattype` VALUES (94, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 13, 4, NULL);
INSERT INTO `f_seattype` VALUES (95, 1, 1, 2, 1, 1, 0, 1, 0, 1, 1, 13, 3, NULL);
INSERT INTO `f_seattype` VALUES (96, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 13, 2, NULL);
INSERT INTO `f_seattype` VALUES (97, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 13, 1, NULL);
INSERT INTO `f_seattype` VALUES (98, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 13, 0, NULL);
INSERT INTO `f_seattype` VALUES (99, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 14, 0, NULL);
INSERT INTO `f_seattype` VALUES (100, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 14, 1, NULL);
INSERT INTO `f_seattype` VALUES (101, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 14, 2, NULL);
INSERT INTO `f_seattype` VALUES (102, 1, 1, 2, 1, 1, 0, 1, 0, 1, 1, 14, 3, NULL);
INSERT INTO `f_seattype` VALUES (103, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 14, 4, NULL);
INSERT INTO `f_seattype` VALUES (104, 1, 0, 2, 1, 1, 0, 1, 1, 1, 1, 14, 5, NULL);
INSERT INTO `f_seattype` VALUES (105, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 14, 6, NULL);
INSERT INTO `f_seattype` VALUES (106, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 15, 6, NULL);
INSERT INTO `f_seattype` VALUES (107, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 15, 5, NULL);
INSERT INTO `f_seattype` VALUES (108, 1, 0, 2, 1, 0, 0, 1, 0, 1, 0, 15, 4, NULL);
INSERT INTO `f_seattype` VALUES (109, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 15, 3, NULL);
INSERT INTO `f_seattype` VALUES (110, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 15, 2, NULL);
INSERT INTO `f_seattype` VALUES (111, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 15, 1, NULL);
INSERT INTO `f_seattype` VALUES (112, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 15, 0, NULL);
INSERT INTO `f_seattype` VALUES (113, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 16, 0, NULL);
INSERT INTO `f_seattype` VALUES (114, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 16, 1, NULL);
INSERT INTO `f_seattype` VALUES (115, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 16, 2, NULL);
INSERT INTO `f_seattype` VALUES (116, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 16, 3, NULL);
INSERT INTO `f_seattype` VALUES (117, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 16, 4, NULL);
INSERT INTO `f_seattype` VALUES (118, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 16, 5, NULL);
INSERT INTO `f_seattype` VALUES (119, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 16, 6, NULL);
INSERT INTO `f_seattype` VALUES (120, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 17, 6, NULL);
INSERT INTO `f_seattype` VALUES (121, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 17, 5, NULL);
INSERT INTO `f_seattype` VALUES (122, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 17, 4, NULL);
INSERT INTO `f_seattype` VALUES (123, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 17, 3, NULL);
INSERT INTO `f_seattype` VALUES (124, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 17, 2, NULL);
INSERT INTO `f_seattype` VALUES (125, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 17, 1, NULL);
INSERT INTO `f_seattype` VALUES (126, 1, 0, 2, 0, 1, 1, 0, 1, 1, 1, 17, 0, NULL);
INSERT INTO `f_seattype` VALUES (127, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 18, 0, NULL);
INSERT INTO `f_seattype` VALUES (128, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 18, 1, NULL);
INSERT INTO `f_seattype` VALUES (129, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 18, 2, NULL);
INSERT INTO `f_seattype` VALUES (130, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 18, 3, NULL);
INSERT INTO `f_seattype` VALUES (131, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 18, 4, NULL);
INSERT INTO `f_seattype` VALUES (132, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 18, 5, NULL);
INSERT INTO `f_seattype` VALUES (133, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 18, 6, NULL);
INSERT INTO `f_seattype` VALUES (134, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 19, 6, NULL);
INSERT INTO `f_seattype` VALUES (135, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 19, 5, NULL);
INSERT INTO `f_seattype` VALUES (136, 1, 0, 2, 1, 0, 0, 1, 0, 1, 0, 19, 4, NULL);
INSERT INTO `f_seattype` VALUES (137, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 19, 3, NULL);
INSERT INTO `f_seattype` VALUES (138, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 19, 2, NULL);
INSERT INTO `f_seattype` VALUES (139, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 19, 1, NULL);
INSERT INTO `f_seattype` VALUES (140, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 19, 0, NULL);
INSERT INTO `f_seattype` VALUES (141, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 20, 0, NULL);
INSERT INTO `f_seattype` VALUES (142, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 20, 1, NULL);
INSERT INTO `f_seattype` VALUES (143, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 20, 2, NULL);
INSERT INTO `f_seattype` VALUES (144, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 20, 3, NULL);
INSERT INTO `f_seattype` VALUES (145, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 20, 4, NULL);
INSERT INTO `f_seattype` VALUES (146, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 20, 5, NULL);
INSERT INTO `f_seattype` VALUES (147, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 20, 6, NULL);
INSERT INTO `f_seattype` VALUES (148, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 21, 6, NULL);
INSERT INTO `f_seattype` VALUES (149, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 21, 5, NULL);
INSERT INTO `f_seattype` VALUES (150, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 21, 4, NULL);
INSERT INTO `f_seattype` VALUES (151, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 21, 3, NULL);
INSERT INTO `f_seattype` VALUES (152, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 21, 2, NULL);
INSERT INTO `f_seattype` VALUES (153, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 21, 1, NULL);
INSERT INTO `f_seattype` VALUES (154, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 21, 0, NULL);
INSERT INTO `f_seattype` VALUES (155, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 22, 0, NULL);
INSERT INTO `f_seattype` VALUES (156, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 22, 1, NULL);
INSERT INTO `f_seattype` VALUES (157, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 22, 2, NULL);
INSERT INTO `f_seattype` VALUES (158, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 22, 3, NULL);
INSERT INTO `f_seattype` VALUES (159, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 22, 4, NULL);
INSERT INTO `f_seattype` VALUES (160, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 22, 5, NULL);
INSERT INTO `f_seattype` VALUES (161, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 22, 6, NULL);
INSERT INTO `f_seattype` VALUES (162, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 23, 6, NULL);
INSERT INTO `f_seattype` VALUES (163, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 23, 5, NULL);
INSERT INTO `f_seattype` VALUES (164, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 23, 4, NULL);
INSERT INTO `f_seattype` VALUES (165, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 23, 3, NULL);
INSERT INTO `f_seattype` VALUES (166, 1, 0, 2, 1, 0, 0, 1, 0, 1, 0, 23, 2, NULL);
INSERT INTO `f_seattype` VALUES (167, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 23, 1, NULL);
INSERT INTO `f_seattype` VALUES (168, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 23, 0, NULL);
INSERT INTO `f_seattype` VALUES (169, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 24, 0, NULL);
INSERT INTO `f_seattype` VALUES (170, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 24, 1, NULL);
INSERT INTO `f_seattype` VALUES (171, 1, 0, 2, 1, 0, 0, 0, 0, 1, 1, 24, 2, NULL);
INSERT INTO `f_seattype` VALUES (172, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 24, 3, NULL);
INSERT INTO `f_seattype` VALUES (173, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 24, 4, NULL);
INSERT INTO `f_seattype` VALUES (174, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 24, 5, NULL);
INSERT INTO `f_seattype` VALUES (175, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 24, 6, NULL);
INSERT INTO `f_seattype` VALUES (176, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 25, 6, NULL);
INSERT INTO `f_seattype` VALUES (177, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 25, 5, NULL);
INSERT INTO `f_seattype` VALUES (178, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 25, 4, NULL);
INSERT INTO `f_seattype` VALUES (179, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 25, 3, NULL);
INSERT INTO `f_seattype` VALUES (180, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 25, 2, NULL);
INSERT INTO `f_seattype` VALUES (181, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 25, 1, NULL);
INSERT INTO `f_seattype` VALUES (182, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 25, 0, NULL);
INSERT INTO `f_seattype` VALUES (183, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 26, 0, NULL);
INSERT INTO `f_seattype` VALUES (184, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 26, 1, NULL);
INSERT INTO `f_seattype` VALUES (185, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 26, 2, NULL);
INSERT INTO `f_seattype` VALUES (186, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 26, 3, NULL);
INSERT INTO `f_seattype` VALUES (187, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 26, 4, NULL);
INSERT INTO `f_seattype` VALUES (188, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 26, 5, NULL);
INSERT INTO `f_seattype` VALUES (189, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 26, 6, NULL);
INSERT INTO `f_seattype` VALUES (190, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 27, 6, NULL);
INSERT INTO `f_seattype` VALUES (191, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 27, 5, NULL);
INSERT INTO `f_seattype` VALUES (192, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 27, 4, NULL);
INSERT INTO `f_seattype` VALUES (193, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 27, 3, NULL);
INSERT INTO `f_seattype` VALUES (194, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 27, 2, NULL);
INSERT INTO `f_seattype` VALUES (195, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 27, 1, NULL);
INSERT INTO `f_seattype` VALUES (196, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 27, 0, NULL);
INSERT INTO `f_seattype` VALUES (197, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 28, 0, NULL);
INSERT INTO `f_seattype` VALUES (198, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 28, 1, NULL);
INSERT INTO `f_seattype` VALUES (199, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 28, 2, NULL);
INSERT INTO `f_seattype` VALUES (200, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 28, 3, NULL);
INSERT INTO `f_seattype` VALUES (201, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 28, 4, NULL);
INSERT INTO `f_seattype` VALUES (202, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 28, 5, NULL);
INSERT INTO `f_seattype` VALUES (203, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 28, 6, NULL);
INSERT INTO `f_seattype` VALUES (204, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 29, 6, NULL);
INSERT INTO `f_seattype` VALUES (205, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 29, 5, NULL);
INSERT INTO `f_seattype` VALUES (206, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 29, 4, NULL);
INSERT INTO `f_seattype` VALUES (207, 1, 1, 2, 1, 1, 1, 1, 0, 1, 1, 29, 3, NULL);
INSERT INTO `f_seattype` VALUES (208, 1, 0, 2, 1, 0, 0, 1, 0, 1, 1, 29, 2, NULL);
INSERT INTO `f_seattype` VALUES (209, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 29, 1, NULL);
INSERT INTO `f_seattype` VALUES (210, 1, 0, 2, 0, 1, 1, 1, 1, 1, 1, 29, 0, NULL);
INSERT INTO `f_seattype` VALUES (211, 2, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, NULL);
INSERT INTO `f_seattype` VALUES (212, 2, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, NULL);
INSERT INTO `f_seattype` VALUES (213, 2, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 2, NULL);
INSERT INTO `f_seattype` VALUES (214, 2, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 3, NULL);
INSERT INTO `f_seattype` VALUES (215, 2, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 4, NULL);
INSERT INTO `f_seattype` VALUES (216, 2, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 5, NULL);
INSERT INTO `f_seattype` VALUES (217, 2, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 6, NULL);
INSERT INTO `f_seattype` VALUES (218, 2, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 6, NULL);
INSERT INTO `f_seattype` VALUES (219, 2, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 5, NULL);
INSERT INTO `f_seattype` VALUES (220, 2, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 4, NULL);
INSERT INTO `f_seattype` VALUES (221, 2, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 3, NULL);
INSERT INTO `f_seattype` VALUES (222, 2, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 2, NULL);
INSERT INTO `f_seattype` VALUES (223, 2, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, NULL);
INSERT INTO `f_seattype` VALUES (224, 2, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, NULL);
INSERT INTO `f_seattype` VALUES (225, 2, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 0, NULL);
INSERT INTO `f_seattype` VALUES (226, 2, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 1, NULL);
INSERT INTO `f_seattype` VALUES (227, 2, 0, 0, 1, 0, 0, 1, 0, 1, 1, 2, 2, NULL);
INSERT INTO `f_seattype` VALUES (228, 2, 1, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, NULL);
INSERT INTO `f_seattype` VALUES (229, 2, 0, 0, 1, 0, 0, 1, 0, 1, 1, 2, 4, NULL);
INSERT INTO `f_seattype` VALUES (230, 2, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 5, NULL);
INSERT INTO `f_seattype` VALUES (231, 2, 0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 6, NULL);
INSERT INTO `f_seattype` VALUES (232, 2, 0, 0, 0, 1, 1, 1, 0, 1, 1, 3, 6, NULL);
INSERT INTO `f_seattype` VALUES (233, 2, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 5, NULL);
INSERT INTO `f_seattype` VALUES (234, 2, 0, 0, 1, 0, 1, 1, 0, 1, 1, 3, 4, NULL);
INSERT INTO `f_seattype` VALUES (235, 2, 1, 0, 0, 0, 1, 1, 0, 1, 1, 3, 3, NULL);
INSERT INTO `f_seattype` VALUES (236, 2, 0, 0, 1, 0, 1, 1, 0, 1, 1, 3, 2, NULL);
INSERT INTO `f_seattype` VALUES (237, 2, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 1, NULL);
INSERT INTO `f_seattype` VALUES (238, 2, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 0, NULL);
INSERT INTO `f_seattype` VALUES (239, 2, 0, 0, 0, 1, 1, 1, 0, 1, 1, 4, 0, NULL);
INSERT INTO `f_seattype` VALUES (240, 2, 0, 0, 1, 1, 1, 1, 0, 1, 1, 4, 1, NULL);
INSERT INTO `f_seattype` VALUES (241, 2, 0, 0, 1, 0, 1, 1, 0, 1, 1, 4, 2, NULL);
INSERT INTO `f_seattype` VALUES (242, 2, 1, 0, 0, 0, 1, 1, 0, 1, 1, 4, 3, NULL);
INSERT INTO `f_seattype` VALUES (243, 2, 0, 0, 1, 0, 1, 1, 0, 1, 1, 4, 4, NULL);
INSERT INTO `f_seattype` VALUES (244, 2, 0, 0, 1, 1, 1, 1, 0, 1, 1, 4, 5, NULL);
INSERT INTO `f_seattype` VALUES (245, 2, 0, 0, 0, 1, 1, 1, 0, 1, 1, 4, 6, NULL);
INSERT INTO `f_seattype` VALUES (246, 2, 0, 1, 0, 1, 0, 1, 0, 0, 1, 5, 6, NULL);
INSERT INTO `f_seattype` VALUES (247, 2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 5, 5, NULL);
INSERT INTO `f_seattype` VALUES (248, 2, 0, 1, 1, 0, 0, 1, 0, 1, 1, 5, 4, NULL);
INSERT INTO `f_seattype` VALUES (249, 2, 1, 1, 1, 1, 0, 1, 0, 1, 1, 5, 3, NULL);
INSERT INTO `f_seattype` VALUES (250, 2, 0, 1, 1, 0, 0, 1, 0, 1, 1, 5, 2, NULL);
INSERT INTO `f_seattype` VALUES (251, 2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 5, 1, NULL);
INSERT INTO `f_seattype` VALUES (252, 2, 0, 1, 0, 1, 0, 1, 0, 1, 1, 5, 0, NULL);
INSERT INTO `f_seattype` VALUES (253, 2, 0, 1, 0, 1, 0, 1, 0, 1, 1, 6, 0, NULL);
INSERT INTO `f_seattype` VALUES (254, 2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 6, 1, NULL);
INSERT INTO `f_seattype` VALUES (255, 2, 0, 1, 1, 0, 0, 1, 0, 1, 1, 6, 2, NULL);
INSERT INTO `f_seattype` VALUES (256, 2, 1, 1, 1, 1, 0, 0, 0, 1, 1, 6, 3, NULL);
INSERT INTO `f_seattype` VALUES (257, 2, 0, 1, 1, 0, 0, 1, 0, 1, 1, 6, 4, NULL);
INSERT INTO `f_seattype` VALUES (258, 2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 6, 5, NULL);
INSERT INTO `f_seattype` VALUES (259, 2, 0, 1, 0, 1, 0, 1, 0, 1, 1, 6, 6, NULL);
INSERT INTO `f_seattype` VALUES (260, 2, 0, 1, 0, 1, 0, 1, 0, 1, 1, 7, 6, NULL);
INSERT INTO `f_seattype` VALUES (261, 2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 7, 5, NULL);
INSERT INTO `f_seattype` VALUES (262, 2, 0, 1, 1, 0, 0, 1, 0, 1, 1, 7, 4, NULL);
INSERT INTO `f_seattype` VALUES (263, 2, 1, 1, 1, 1, 0, 1, 0, 1, 1, 7, 3, NULL);
INSERT INTO `f_seattype` VALUES (264, 2, 0, 1, 1, 0, 0, 1, 0, 1, 1, 7, 2, NULL);
INSERT INTO `f_seattype` VALUES (265, 2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 7, 1, NULL);
INSERT INTO `f_seattype` VALUES (266, 2, 0, 1, 0, 1, 0, 1, 0, 1, 1, 7, 0, NULL);
INSERT INTO `f_seattype` VALUES (267, 2, 0, 1, 0, 1, 1, 1, 0, 1, 1, 8, 0, NULL);
INSERT INTO `f_seattype` VALUES (268, 2, 0, 1, 1, 1, 1, 1, 0, 1, 1, 8, 1, NULL);
INSERT INTO `f_seattype` VALUES (269, 2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 2, NULL);
INSERT INTO `f_seattype` VALUES (270, 2, 1, 1, 1, 1, 1, 1, 0, 1, 1, 8, 3, NULL);
INSERT INTO `f_seattype` VALUES (271, 2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 4, NULL);
INSERT INTO `f_seattype` VALUES (272, 2, 0, 1, 1, 1, 1, 1, 0, 1, 1, 8, 5, NULL);
INSERT INTO `f_seattype` VALUES (273, 2, 0, 1, 0, 1, 1, 1, 0, 1, 1, 8, 6, NULL);
INSERT INTO `f_seattype` VALUES (274, 2, 0, 1, 0, 1, 1, 1, 0, 1, 1, 9, 6, NULL);
INSERT INTO `f_seattype` VALUES (275, 2, 0, 1, 1, 1, 1, 1, 0, 1, 1, 9, 5, NULL);
INSERT INTO `f_seattype` VALUES (276, 2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 9, 4, NULL);
INSERT INTO `f_seattype` VALUES (277, 2, 1, 1, 1, 1, 1, 1, 0, 1, 1, 9, 3, NULL);
INSERT INTO `f_seattype` VALUES (278, 2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 9, 2, NULL);
INSERT INTO `f_seattype` VALUES (279, 2, 0, 1, 1, 1, 1, 1, 0, 1, 1, 9, 1, NULL);
INSERT INTO `f_seattype` VALUES (280, 2, 0, 1, 0, 1, 1, 1, 0, 1, 1, 9, 0, NULL);
INSERT INTO `f_seattype` VALUES (281, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 10, 0, NULL);
INSERT INTO `f_seattype` VALUES (282, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 10, 1, NULL);
INSERT INTO `f_seattype` VALUES (283, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 10, 2, NULL);
INSERT INTO `f_seattype` VALUES (284, 2, 1, 2, 1, 1, 0, 1, 0, 1, 1, 10, 3, NULL);
INSERT INTO `f_seattype` VALUES (285, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 10, 4, NULL);
INSERT INTO `f_seattype` VALUES (286, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 10, 5, NULL);
INSERT INTO `f_seattype` VALUES (287, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 10, 6, NULL);
INSERT INTO `f_seattype` VALUES (288, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 11, 6, NULL);
INSERT INTO `f_seattype` VALUES (289, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 11, 5, NULL);
INSERT INTO `f_seattype` VALUES (290, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 11, 4, NULL);
INSERT INTO `f_seattype` VALUES (291, 2, 1, 2, 1, 1, 0, 1, 0, 1, 1, 11, 3, NULL);
INSERT INTO `f_seattype` VALUES (292, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 11, 2, NULL);
INSERT INTO `f_seattype` VALUES (293, 2, 0, 2, 1, 1, 0, 1, 1, 1, 0, 11, 1, NULL);
INSERT INTO `f_seattype` VALUES (294, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 11, 0, NULL);
INSERT INTO `f_seattype` VALUES (295, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 12, 0, NULL);
INSERT INTO `f_seattype` VALUES (296, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 12, 1, NULL);
INSERT INTO `f_seattype` VALUES (297, 2, 0, 2, 1, 0, 0, 0, 0, 1, 1, 12, 2, NULL);
INSERT INTO `f_seattype` VALUES (298, 2, 1, 2, 1, 1, 0, 1, 0, 1, 1, 12, 3, NULL);
INSERT INTO `f_seattype` VALUES (299, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 12, 4, NULL);
INSERT INTO `f_seattype` VALUES (300, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 12, 5, NULL);
INSERT INTO `f_seattype` VALUES (301, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 12, 6, NULL);
INSERT INTO `f_seattype` VALUES (302, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 13, 6, NULL);
INSERT INTO `f_seattype` VALUES (303, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 13, 5, NULL);
INSERT INTO `f_seattype` VALUES (304, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 13, 4, NULL);
INSERT INTO `f_seattype` VALUES (305, 2, 1, 2, 1, 1, 0, 1, 0, 1, 1, 13, 3, NULL);
INSERT INTO `f_seattype` VALUES (306, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 13, 2, NULL);
INSERT INTO `f_seattype` VALUES (307, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 13, 1, NULL);
INSERT INTO `f_seattype` VALUES (308, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 13, 0, NULL);
INSERT INTO `f_seattype` VALUES (309, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 14, 0, NULL);
INSERT INTO `f_seattype` VALUES (310, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 14, 1, NULL);
INSERT INTO `f_seattype` VALUES (311, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 14, 2, NULL);
INSERT INTO `f_seattype` VALUES (312, 2, 1, 2, 1, 1, 0, 1, 0, 1, 1, 14, 3, NULL);
INSERT INTO `f_seattype` VALUES (313, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 14, 4, NULL);
INSERT INTO `f_seattype` VALUES (314, 2, 0, 2, 1, 1, 0, 1, 1, 1, 1, 14, 5, NULL);
INSERT INTO `f_seattype` VALUES (315, 2, 0, 2, 0, 1, 0, 1, 1, 1, 1, 14, 6, NULL);
INSERT INTO `f_seattype` VALUES (316, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 15, 6, NULL);
INSERT INTO `f_seattype` VALUES (317, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 15, 5, NULL);
INSERT INTO `f_seattype` VALUES (318, 2, 0, 2, 1, 0, 0, 1, 0, 1, 0, 15, 4, NULL);
INSERT INTO `f_seattype` VALUES (319, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 15, 3, NULL);
INSERT INTO `f_seattype` VALUES (320, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 15, 2, NULL);
INSERT INTO `f_seattype` VALUES (321, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 15, 1, NULL);
INSERT INTO `f_seattype` VALUES (322, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 15, 0, NULL);
INSERT INTO `f_seattype` VALUES (323, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 16, 0, NULL);
INSERT INTO `f_seattype` VALUES (324, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 16, 1, NULL);
INSERT INTO `f_seattype` VALUES (325, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 16, 2, NULL);
INSERT INTO `f_seattype` VALUES (326, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 16, 3, NULL);
INSERT INTO `f_seattype` VALUES (327, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 16, 4, NULL);
INSERT INTO `f_seattype` VALUES (328, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 16, 5, NULL);
INSERT INTO `f_seattype` VALUES (329, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 16, 6, NULL);
INSERT INTO `f_seattype` VALUES (330, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 17, 6, NULL);
INSERT INTO `f_seattype` VALUES (331, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 17, 5, NULL);
INSERT INTO `f_seattype` VALUES (332, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 17, 4, NULL);
INSERT INTO `f_seattype` VALUES (333, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 17, 3, NULL);
INSERT INTO `f_seattype` VALUES (334, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 17, 2, NULL);
INSERT INTO `f_seattype` VALUES (335, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 17, 1, NULL);
INSERT INTO `f_seattype` VALUES (336, 2, 0, 2, 0, 1, 1, 0, 1, 1, 1, 17, 0, NULL);
INSERT INTO `f_seattype` VALUES (337, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 18, 0, NULL);
INSERT INTO `f_seattype` VALUES (338, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 18, 1, NULL);
INSERT INTO `f_seattype` VALUES (339, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 18, 2, NULL);
INSERT INTO `f_seattype` VALUES (340, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 18, 3, NULL);
INSERT INTO `f_seattype` VALUES (341, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 18, 4, NULL);
INSERT INTO `f_seattype` VALUES (342, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 18, 5, NULL);
INSERT INTO `f_seattype` VALUES (343, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 18, 6, NULL);
INSERT INTO `f_seattype` VALUES (344, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 19, 6, NULL);
INSERT INTO `f_seattype` VALUES (345, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 19, 5, NULL);
INSERT INTO `f_seattype` VALUES (346, 2, 0, 2, 1, 0, 0, 1, 0, 1, 0, 19, 4, NULL);
INSERT INTO `f_seattype` VALUES (347, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 19, 3, NULL);
INSERT INTO `f_seattype` VALUES (348, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 19, 2, NULL);
INSERT INTO `f_seattype` VALUES (349, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 19, 1, NULL);
INSERT INTO `f_seattype` VALUES (350, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 19, 0, NULL);
INSERT INTO `f_seattype` VALUES (351, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 20, 0, NULL);
INSERT INTO `f_seattype` VALUES (352, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 20, 1, NULL);
INSERT INTO `f_seattype` VALUES (353, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 20, 2, NULL);
INSERT INTO `f_seattype` VALUES (354, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 20, 3, NULL);
INSERT INTO `f_seattype` VALUES (355, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 20, 4, NULL);
INSERT INTO `f_seattype` VALUES (356, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 20, 5, NULL);
INSERT INTO `f_seattype` VALUES (357, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 20, 6, NULL);
INSERT INTO `f_seattype` VALUES (358, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 21, 6, NULL);
INSERT INTO `f_seattype` VALUES (359, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 21, 5, NULL);
INSERT INTO `f_seattype` VALUES (360, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 21, 4, NULL);
INSERT INTO `f_seattype` VALUES (361, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 21, 3, NULL);
INSERT INTO `f_seattype` VALUES (362, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 21, 2, NULL);
INSERT INTO `f_seattype` VALUES (363, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 21, 1, NULL);
INSERT INTO `f_seattype` VALUES (364, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 21, 0, NULL);
INSERT INTO `f_seattype` VALUES (365, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 22, 0, NULL);
INSERT INTO `f_seattype` VALUES (366, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 22, 1, NULL);
INSERT INTO `f_seattype` VALUES (367, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 22, 2, NULL);
INSERT INTO `f_seattype` VALUES (368, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 22, 3, NULL);
INSERT INTO `f_seattype` VALUES (369, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 22, 4, NULL);
INSERT INTO `f_seattype` VALUES (370, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 22, 5, NULL);
INSERT INTO `f_seattype` VALUES (371, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 22, 6, NULL);
INSERT INTO `f_seattype` VALUES (372, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 23, 6, NULL);
INSERT INTO `f_seattype` VALUES (373, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 23, 5, NULL);
INSERT INTO `f_seattype` VALUES (374, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 23, 4, NULL);
INSERT INTO `f_seattype` VALUES (375, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 23, 3, NULL);
INSERT INTO `f_seattype` VALUES (376, 2, 0, 2, 1, 0, 0, 1, 0, 1, 0, 23, 2, NULL);
INSERT INTO `f_seattype` VALUES (377, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 23, 1, NULL);
INSERT INTO `f_seattype` VALUES (378, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 23, 0, NULL);
INSERT INTO `f_seattype` VALUES (379, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 24, 0, NULL);
INSERT INTO `f_seattype` VALUES (380, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 24, 1, NULL);
INSERT INTO `f_seattype` VALUES (381, 2, 0, 2, 1, 0, 0, 0, 0, 1, 1, 24, 2, NULL);
INSERT INTO `f_seattype` VALUES (382, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 24, 3, NULL);
INSERT INTO `f_seattype` VALUES (383, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 24, 4, NULL);
INSERT INTO `f_seattype` VALUES (384, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 24, 5, NULL);
INSERT INTO `f_seattype` VALUES (385, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 24, 6, NULL);
INSERT INTO `f_seattype` VALUES (386, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 25, 6, NULL);
INSERT INTO `f_seattype` VALUES (387, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 25, 5, NULL);
INSERT INTO `f_seattype` VALUES (388, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 25, 4, NULL);
INSERT INTO `f_seattype` VALUES (389, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 25, 3, NULL);
INSERT INTO `f_seattype` VALUES (390, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 25, 2, NULL);
INSERT INTO `f_seattype` VALUES (391, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 25, 1, NULL);
INSERT INTO `f_seattype` VALUES (392, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 25, 0, NULL);
INSERT INTO `f_seattype` VALUES (393, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 26, 0, NULL);
INSERT INTO `f_seattype` VALUES (394, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 26, 1, NULL);
INSERT INTO `f_seattype` VALUES (395, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 26, 2, NULL);
INSERT INTO `f_seattype` VALUES (396, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 26, 3, NULL);
INSERT INTO `f_seattype` VALUES (397, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 26, 4, NULL);
INSERT INTO `f_seattype` VALUES (398, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 26, 5, NULL);
INSERT INTO `f_seattype` VALUES (399, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 26, 6, NULL);
INSERT INTO `f_seattype` VALUES (400, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 27, 6, NULL);
INSERT INTO `f_seattype` VALUES (401, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 27, 5, NULL);
INSERT INTO `f_seattype` VALUES (402, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 27, 4, NULL);
INSERT INTO `f_seattype` VALUES (403, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 27, 3, NULL);
INSERT INTO `f_seattype` VALUES (404, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 27, 2, NULL);
INSERT INTO `f_seattype` VALUES (405, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 27, 1, NULL);
INSERT INTO `f_seattype` VALUES (406, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 27, 0, NULL);
INSERT INTO `f_seattype` VALUES (407, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 28, 0, NULL);
INSERT INTO `f_seattype` VALUES (408, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 28, 1, NULL);
INSERT INTO `f_seattype` VALUES (409, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 28, 2, NULL);
INSERT INTO `f_seattype` VALUES (410, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 28, 3, NULL);
INSERT INTO `f_seattype` VALUES (411, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 28, 4, NULL);
INSERT INTO `f_seattype` VALUES (412, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 28, 5, NULL);
INSERT INTO `f_seattype` VALUES (413, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 28, 6, NULL);
INSERT INTO `f_seattype` VALUES (414, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 29, 6, NULL);
INSERT INTO `f_seattype` VALUES (415, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 29, 5, NULL);
INSERT INTO `f_seattype` VALUES (416, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 29, 4, NULL);
INSERT INTO `f_seattype` VALUES (417, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 29, 3, NULL);
INSERT INTO `f_seattype` VALUES (418, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 29, 2, NULL);
INSERT INTO `f_seattype` VALUES (419, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 29, 1, NULL);
INSERT INTO `f_seattype` VALUES (420, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 29, 0, NULL);
INSERT INTO `f_seattype` VALUES (421, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 30, 0, NULL);
INSERT INTO `f_seattype` VALUES (422, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 30, 1, NULL);
INSERT INTO `f_seattype` VALUES (423, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 30, 2, NULL);
INSERT INTO `f_seattype` VALUES (424, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 30, 3, NULL);
INSERT INTO `f_seattype` VALUES (425, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 30, 4, NULL);
INSERT INTO `f_seattype` VALUES (426, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 30, 5, NULL);
INSERT INTO `f_seattype` VALUES (427, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 30, 6, NULL);
INSERT INTO `f_seattype` VALUES (428, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 31, 6, NULL);
INSERT INTO `f_seattype` VALUES (429, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 31, 5, NULL);
INSERT INTO `f_seattype` VALUES (430, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 31, 4, NULL);
INSERT INTO `f_seattype` VALUES (431, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 31, 3, NULL);
INSERT INTO `f_seattype` VALUES (432, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 31, 2, NULL);
INSERT INTO `f_seattype` VALUES (433, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 31, 1, NULL);
INSERT INTO `f_seattype` VALUES (434, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 31, 0, NULL);
INSERT INTO `f_seattype` VALUES (435, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 32, 0, NULL);
INSERT INTO `f_seattype` VALUES (436, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 32, 1, NULL);
INSERT INTO `f_seattype` VALUES (437, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 32, 2, NULL);
INSERT INTO `f_seattype` VALUES (438, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 32, 3, NULL);
INSERT INTO `f_seattype` VALUES (439, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 32, 4, NULL);
INSERT INTO `f_seattype` VALUES (440, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 32, 5, NULL);
INSERT INTO `f_seattype` VALUES (441, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 32, 6, NULL);
INSERT INTO `f_seattype` VALUES (442, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 33, 6, NULL);
INSERT INTO `f_seattype` VALUES (443, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 33, 5, NULL);
INSERT INTO `f_seattype` VALUES (444, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 33, 4, NULL);
INSERT INTO `f_seattype` VALUES (445, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 33, 3, NULL);
INSERT INTO `f_seattype` VALUES (446, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 33, 2, NULL);
INSERT INTO `f_seattype` VALUES (447, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 33, 1, NULL);
INSERT INTO `f_seattype` VALUES (448, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 33, 0, NULL);
INSERT INTO `f_seattype` VALUES (449, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 34, 0, NULL);
INSERT INTO `f_seattype` VALUES (450, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 34, 1, NULL);
INSERT INTO `f_seattype` VALUES (451, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 34, 2, NULL);
INSERT INTO `f_seattype` VALUES (452, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 34, 3, NULL);
INSERT INTO `f_seattype` VALUES (453, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 34, 4, NULL);
INSERT INTO `f_seattype` VALUES (454, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 34, 5, NULL);
INSERT INTO `f_seattype` VALUES (455, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 34, 6, NULL);
INSERT INTO `f_seattype` VALUES (456, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 35, 6, NULL);
INSERT INTO `f_seattype` VALUES (457, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 35, 5, NULL);
INSERT INTO `f_seattype` VALUES (458, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 35, 4, NULL);
INSERT INTO `f_seattype` VALUES (459, 2, 1, 2, 1, 1, 1, 1, 0, 1, 1, 35, 3, NULL);
INSERT INTO `f_seattype` VALUES (460, 2, 0, 2, 1, 0, 0, 1, 0, 1, 1, 35, 2, NULL);
INSERT INTO `f_seattype` VALUES (461, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 35, 1, NULL);
INSERT INTO `f_seattype` VALUES (462, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 35, 0, NULL);
INSERT INTO `f_seattype` VALUES (463, 3, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, NULL);
INSERT INTO `f_seattype` VALUES (464, 3, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, NULL);
INSERT INTO `f_seattype` VALUES (465, 3, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 2, NULL);
INSERT INTO `f_seattype` VALUES (466, 3, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 3, NULL);
INSERT INTO `f_seattype` VALUES (467, 3, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 4, NULL);
INSERT INTO `f_seattype` VALUES (468, 3, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 5, NULL);
INSERT INTO `f_seattype` VALUES (469, 3, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 6, NULL);
INSERT INTO `f_seattype` VALUES (470, 3, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 6, NULL);
INSERT INTO `f_seattype` VALUES (471, 3, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 5, NULL);
INSERT INTO `f_seattype` VALUES (472, 3, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 4, NULL);
INSERT INTO `f_seattype` VALUES (473, 3, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 3, NULL);
INSERT INTO `f_seattype` VALUES (474, 3, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 2, NULL);
INSERT INTO `f_seattype` VALUES (475, 3, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, NULL);
INSERT INTO `f_seattype` VALUES (476, 3, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, NULL);
INSERT INTO `f_seattype` VALUES (477, 3, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 0, NULL);
INSERT INTO `f_seattype` VALUES (478, 3, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 1, NULL);
INSERT INTO `f_seattype` VALUES (479, 3, 0, 0, 1, 0, 0, 1, 0, 1, 1, 2, 2, NULL);
INSERT INTO `f_seattype` VALUES (480, 3, 1, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, NULL);
INSERT INTO `f_seattype` VALUES (481, 3, 0, 0, 1, 0, 0, 1, 0, 1, 1, 2, 4, NULL);
INSERT INTO `f_seattype` VALUES (482, 3, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 5, NULL);
INSERT INTO `f_seattype` VALUES (483, 3, 0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 6, NULL);
INSERT INTO `f_seattype` VALUES (484, 3, 0, 0, 0, 1, 1, 1, 0, 1, 1, 3, 6, NULL);
INSERT INTO `f_seattype` VALUES (485, 3, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 5, NULL);
INSERT INTO `f_seattype` VALUES (486, 3, 0, 0, 1, 0, 1, 1, 0, 1, 1, 3, 4, NULL);
INSERT INTO `f_seattype` VALUES (487, 3, 1, 0, 0, 0, 1, 1, 0, 1, 1, 3, 3, NULL);
INSERT INTO `f_seattype` VALUES (488, 3, 0, 0, 1, 0, 1, 1, 0, 1, 1, 3, 2, NULL);
INSERT INTO `f_seattype` VALUES (489, 3, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 1, NULL);
INSERT INTO `f_seattype` VALUES (490, 3, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 0, NULL);
INSERT INTO `f_seattype` VALUES (491, 3, 0, 0, 0, 1, 1, 1, 0, 1, 1, 4, 0, NULL);
INSERT INTO `f_seattype` VALUES (492, 3, 0, 0, 1, 1, 1, 1, 0, 1, 1, 4, 1, NULL);
INSERT INTO `f_seattype` VALUES (493, 3, 0, 0, 1, 0, 1, 1, 0, 1, 1, 4, 2, NULL);
INSERT INTO `f_seattype` VALUES (494, 3, 1, 0, 0, 0, 1, 1, 0, 1, 1, 4, 3, NULL);
INSERT INTO `f_seattype` VALUES (495, 3, 0, 0, 1, 0, 1, 1, 0, 1, 1, 4, 4, NULL);
INSERT INTO `f_seattype` VALUES (496, 3, 0, 0, 1, 1, 1, 1, 0, 1, 1, 4, 5, NULL);
INSERT INTO `f_seattype` VALUES (497, 3, 0, 0, 0, 1, 1, 1, 0, 1, 1, 4, 6, NULL);
INSERT INTO `f_seattype` VALUES (498, 3, 0, 1, 0, 1, 0, 1, 0, 0, 1, 5, 6, NULL);
INSERT INTO `f_seattype` VALUES (499, 3, 0, 1, 1, 1, 0, 1, 0, 1, 1, 5, 5, NULL);
INSERT INTO `f_seattype` VALUES (500, 3, 0, 1, 1, 0, 0, 1, 0, 1, 1, 5, 4, NULL);
INSERT INTO `f_seattype` VALUES (501, 3, 1, 1, 1, 1, 0, 1, 0, 1, 1, 5, 3, NULL);
INSERT INTO `f_seattype` VALUES (502, 3, 0, 1, 1, 0, 0, 1, 0, 1, 1, 5, 2, NULL);
INSERT INTO `f_seattype` VALUES (503, 3, 0, 1, 1, 1, 0, 1, 0, 1, 1, 5, 1, NULL);
INSERT INTO `f_seattype` VALUES (504, 3, 0, 1, 0, 1, 0, 1, 0, 1, 1, 5, 0, NULL);
INSERT INTO `f_seattype` VALUES (505, 3, 0, 1, 0, 1, 0, 1, 0, 1, 1, 6, 0, NULL);
INSERT INTO `f_seattype` VALUES (506, 3, 0, 1, 1, 1, 0, 1, 0, 1, 1, 6, 1, NULL);
INSERT INTO `f_seattype` VALUES (507, 3, 0, 1, 1, 0, 0, 1, 0, 1, 1, 6, 2, NULL);
INSERT INTO `f_seattype` VALUES (508, 3, 1, 1, 1, 1, 0, 0, 0, 1, 1, 6, 3, NULL);
INSERT INTO `f_seattype` VALUES (509, 3, 0, 1, 1, 0, 0, 1, 0, 1, 1, 6, 4, NULL);
INSERT INTO `f_seattype` VALUES (510, 3, 0, 1, 1, 1, 0, 1, 0, 1, 1, 6, 5, NULL);
INSERT INTO `f_seattype` VALUES (511, 3, 0, 1, 0, 1, 0, 1, 0, 1, 1, 6, 6, NULL);
INSERT INTO `f_seattype` VALUES (512, 3, 0, 1, 0, 1, 0, 1, 0, 1, 1, 7, 6, NULL);
INSERT INTO `f_seattype` VALUES (513, 3, 0, 1, 1, 1, 0, 1, 0, 1, 1, 7, 5, NULL);
INSERT INTO `f_seattype` VALUES (514, 3, 0, 1, 1, 0, 0, 1, 0, 1, 1, 7, 4, NULL);
INSERT INTO `f_seattype` VALUES (515, 3, 1, 1, 1, 1, 0, 1, 0, 1, 1, 7, 3, NULL);
INSERT INTO `f_seattype` VALUES (516, 3, 0, 1, 1, 0, 0, 1, 0, 1, 1, 7, 2, NULL);
INSERT INTO `f_seattype` VALUES (517, 3, 0, 1, 1, 1, 0, 1, 0, 1, 1, 7, 1, NULL);
INSERT INTO `f_seattype` VALUES (518, 3, 0, 1, 0, 1, 0, 1, 0, 1, 1, 7, 0, NULL);
INSERT INTO `f_seattype` VALUES (519, 3, 0, 1, 0, 1, 1, 1, 0, 1, 1, 8, 0, NULL);
INSERT INTO `f_seattype` VALUES (520, 3, 0, 1, 1, 1, 1, 1, 0, 1, 1, 8, 1, NULL);
INSERT INTO `f_seattype` VALUES (521, 3, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 2, NULL);
INSERT INTO `f_seattype` VALUES (522, 3, 1, 1, 1, 1, 1, 1, 0, 1, 1, 8, 3, NULL);
INSERT INTO `f_seattype` VALUES (523, 3, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 4, NULL);
INSERT INTO `f_seattype` VALUES (524, 3, 0, 1, 1, 1, 1, 1, 0, 1, 1, 8, 5, NULL);
INSERT INTO `f_seattype` VALUES (525, 3, 0, 1, 0, 1, 1, 1, 0, 1, 1, 8, 6, NULL);
INSERT INTO `f_seattype` VALUES (526, 3, 0, 1, 0, 1, 1, 1, 0, 1, 1, 9, 6, NULL);
INSERT INTO `f_seattype` VALUES (527, 3, 0, 1, 1, 1, 1, 1, 0, 1, 1, 9, 5, NULL);
INSERT INTO `f_seattype` VALUES (528, 3, 0, 1, 1, 0, 1, 1, 0, 1, 1, 9, 4, NULL);
INSERT INTO `f_seattype` VALUES (529, 3, 1, 1, 1, 1, 1, 1, 0, 1, 1, 9, 3, NULL);
INSERT INTO `f_seattype` VALUES (530, 3, 0, 1, 1, 0, 1, 1, 0, 1, 1, 9, 2, NULL);
INSERT INTO `f_seattype` VALUES (531, 3, 0, 1, 1, 1, 1, 1, 0, 1, 1, 9, 1, NULL);
INSERT INTO `f_seattype` VALUES (532, 3, 0, 1, 0, 1, 1, 1, 0, 1, 1, 9, 0, NULL);
INSERT INTO `f_seattype` VALUES (533, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 10, 0, NULL);
INSERT INTO `f_seattype` VALUES (534, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 10, 1, NULL);
INSERT INTO `f_seattype` VALUES (535, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 10, 2, NULL);
INSERT INTO `f_seattype` VALUES (536, 3, 1, 2, 1, 1, 0, 1, 0, 1, 1, 10, 3, NULL);
INSERT INTO `f_seattype` VALUES (537, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 10, 4, NULL);
INSERT INTO `f_seattype` VALUES (538, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 10, 5, NULL);
INSERT INTO `f_seattype` VALUES (539, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 10, 6, NULL);
INSERT INTO `f_seattype` VALUES (540, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 11, 6, NULL);
INSERT INTO `f_seattype` VALUES (541, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 11, 5, NULL);
INSERT INTO `f_seattype` VALUES (542, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 11, 4, NULL);
INSERT INTO `f_seattype` VALUES (543, 3, 1, 2, 1, 1, 0, 1, 0, 1, 1, 11, 3, NULL);
INSERT INTO `f_seattype` VALUES (544, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 11, 2, NULL);
INSERT INTO `f_seattype` VALUES (545, 3, 0, 2, 1, 1, 0, 1, 1, 1, 0, 11, 1, NULL);
INSERT INTO `f_seattype` VALUES (546, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 11, 0, NULL);
INSERT INTO `f_seattype` VALUES (547, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 12, 0, NULL);
INSERT INTO `f_seattype` VALUES (548, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 12, 1, NULL);
INSERT INTO `f_seattype` VALUES (549, 3, 0, 2, 1, 0, 0, 0, 0, 1, 1, 12, 2, NULL);
INSERT INTO `f_seattype` VALUES (550, 3, 1, 2, 1, 1, 0, 1, 0, 1, 1, 12, 3, NULL);
INSERT INTO `f_seattype` VALUES (551, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 12, 4, NULL);
INSERT INTO `f_seattype` VALUES (552, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 12, 5, NULL);
INSERT INTO `f_seattype` VALUES (553, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 12, 6, NULL);
INSERT INTO `f_seattype` VALUES (554, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 13, 6, NULL);
INSERT INTO `f_seattype` VALUES (555, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 13, 5, NULL);
INSERT INTO `f_seattype` VALUES (556, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 13, 4, NULL);
INSERT INTO `f_seattype` VALUES (557, 3, 1, 2, 1, 1, 0, 1, 0, 1, 1, 13, 3, NULL);
INSERT INTO `f_seattype` VALUES (558, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 13, 2, NULL);
INSERT INTO `f_seattype` VALUES (559, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 13, 1, NULL);
INSERT INTO `f_seattype` VALUES (560, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 13, 0, NULL);
INSERT INTO `f_seattype` VALUES (561, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 14, 0, NULL);
INSERT INTO `f_seattype` VALUES (562, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 14, 1, NULL);
INSERT INTO `f_seattype` VALUES (563, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 14, 2, NULL);
INSERT INTO `f_seattype` VALUES (564, 3, 1, 2, 1, 1, 0, 1, 0, 1, 1, 14, 3, NULL);
INSERT INTO `f_seattype` VALUES (565, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 14, 4, NULL);
INSERT INTO `f_seattype` VALUES (566, 3, 0, 2, 1, 1, 0, 1, 1, 1, 1, 14, 5, NULL);
INSERT INTO `f_seattype` VALUES (567, 3, 0, 2, 0, 1, 0, 1, 1, 1, 1, 14, 6, NULL);
INSERT INTO `f_seattype` VALUES (568, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 15, 6, NULL);
INSERT INTO `f_seattype` VALUES (569, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 15, 5, NULL);
INSERT INTO `f_seattype` VALUES (570, 3, 0, 2, 1, 0, 0, 1, 0, 1, 0, 15, 4, NULL);
INSERT INTO `f_seattype` VALUES (571, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 15, 3, NULL);
INSERT INTO `f_seattype` VALUES (572, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 15, 2, NULL);
INSERT INTO `f_seattype` VALUES (573, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 15, 1, NULL);
INSERT INTO `f_seattype` VALUES (574, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 15, 0, NULL);
INSERT INTO `f_seattype` VALUES (575, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 16, 0, NULL);
INSERT INTO `f_seattype` VALUES (576, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 16, 1, NULL);
INSERT INTO `f_seattype` VALUES (577, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 16, 2, NULL);
INSERT INTO `f_seattype` VALUES (578, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 16, 3, NULL);
INSERT INTO `f_seattype` VALUES (579, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 16, 4, NULL);
INSERT INTO `f_seattype` VALUES (580, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 16, 5, NULL);
INSERT INTO `f_seattype` VALUES (581, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 16, 6, NULL);
INSERT INTO `f_seattype` VALUES (582, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 17, 6, NULL);
INSERT INTO `f_seattype` VALUES (583, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 17, 5, NULL);
INSERT INTO `f_seattype` VALUES (584, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 17, 4, NULL);
INSERT INTO `f_seattype` VALUES (585, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 17, 3, NULL);
INSERT INTO `f_seattype` VALUES (586, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 17, 2, NULL);
INSERT INTO `f_seattype` VALUES (587, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 17, 1, NULL);
INSERT INTO `f_seattype` VALUES (588, 3, 0, 2, 0, 1, 1, 0, 1, 1, 1, 17, 0, NULL);
INSERT INTO `f_seattype` VALUES (589, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 18, 0, NULL);
INSERT INTO `f_seattype` VALUES (590, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 18, 1, NULL);
INSERT INTO `f_seattype` VALUES (591, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 18, 2, NULL);
INSERT INTO `f_seattype` VALUES (592, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 18, 3, NULL);
INSERT INTO `f_seattype` VALUES (593, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 18, 4, NULL);
INSERT INTO `f_seattype` VALUES (594, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 18, 5, NULL);
INSERT INTO `f_seattype` VALUES (595, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 18, 6, NULL);
INSERT INTO `f_seattype` VALUES (596, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 19, 6, NULL);
INSERT INTO `f_seattype` VALUES (597, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 19, 5, NULL);
INSERT INTO `f_seattype` VALUES (598, 3, 0, 2, 1, 0, 0, 1, 0, 1, 0, 19, 4, NULL);
INSERT INTO `f_seattype` VALUES (599, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 19, 3, NULL);
INSERT INTO `f_seattype` VALUES (600, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 19, 2, NULL);
INSERT INTO `f_seattype` VALUES (601, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 19, 1, NULL);
INSERT INTO `f_seattype` VALUES (602, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 19, 0, NULL);
INSERT INTO `f_seattype` VALUES (603, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 20, 0, NULL);
INSERT INTO `f_seattype` VALUES (604, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 20, 1, NULL);
INSERT INTO `f_seattype` VALUES (605, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 20, 2, NULL);
INSERT INTO `f_seattype` VALUES (606, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 20, 3, NULL);
INSERT INTO `f_seattype` VALUES (607, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 20, 4, NULL);
INSERT INTO `f_seattype` VALUES (608, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 20, 5, NULL);
INSERT INTO `f_seattype` VALUES (609, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 20, 6, NULL);
INSERT INTO `f_seattype` VALUES (610, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 21, 6, NULL);
INSERT INTO `f_seattype` VALUES (611, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 21, 5, NULL);
INSERT INTO `f_seattype` VALUES (612, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 21, 4, NULL);
INSERT INTO `f_seattype` VALUES (613, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 21, 3, NULL);
INSERT INTO `f_seattype` VALUES (614, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 21, 2, NULL);
INSERT INTO `f_seattype` VALUES (615, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 21, 1, NULL);
INSERT INTO `f_seattype` VALUES (616, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 21, 0, NULL);
INSERT INTO `f_seattype` VALUES (617, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 22, 0, NULL);
INSERT INTO `f_seattype` VALUES (618, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 22, 1, NULL);
INSERT INTO `f_seattype` VALUES (619, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 22, 2, NULL);
INSERT INTO `f_seattype` VALUES (620, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 22, 3, NULL);
INSERT INTO `f_seattype` VALUES (621, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 22, 4, NULL);
INSERT INTO `f_seattype` VALUES (622, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 22, 5, NULL);
INSERT INTO `f_seattype` VALUES (623, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 22, 6, NULL);
INSERT INTO `f_seattype` VALUES (624, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 23, 6, NULL);
INSERT INTO `f_seattype` VALUES (625, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 23, 5, NULL);
INSERT INTO `f_seattype` VALUES (626, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 23, 4, NULL);
INSERT INTO `f_seattype` VALUES (627, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 23, 3, NULL);
INSERT INTO `f_seattype` VALUES (628, 3, 0, 2, 1, 0, 0, 1, 0, 1, 0, 23, 2, NULL);
INSERT INTO `f_seattype` VALUES (629, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 23, 1, NULL);
INSERT INTO `f_seattype` VALUES (630, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 23, 0, NULL);
INSERT INTO `f_seattype` VALUES (631, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 24, 0, NULL);
INSERT INTO `f_seattype` VALUES (632, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 24, 1, NULL);
INSERT INTO `f_seattype` VALUES (633, 3, 0, 2, 1, 0, 0, 0, 0, 1, 1, 24, 2, NULL);
INSERT INTO `f_seattype` VALUES (634, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 24, 3, NULL);
INSERT INTO `f_seattype` VALUES (635, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 24, 4, NULL);
INSERT INTO `f_seattype` VALUES (636, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 24, 5, NULL);
INSERT INTO `f_seattype` VALUES (637, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 24, 6, NULL);
INSERT INTO `f_seattype` VALUES (638, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 25, 6, NULL);
INSERT INTO `f_seattype` VALUES (639, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 25, 5, NULL);
INSERT INTO `f_seattype` VALUES (640, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 25, 4, NULL);
INSERT INTO `f_seattype` VALUES (641, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 25, 3, NULL);
INSERT INTO `f_seattype` VALUES (642, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 25, 2, NULL);
INSERT INTO `f_seattype` VALUES (643, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 25, 1, NULL);
INSERT INTO `f_seattype` VALUES (644, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 25, 0, NULL);
INSERT INTO `f_seattype` VALUES (645, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 26, 0, NULL);
INSERT INTO `f_seattype` VALUES (646, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 26, 1, NULL);
INSERT INTO `f_seattype` VALUES (647, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 26, 2, NULL);
INSERT INTO `f_seattype` VALUES (648, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 26, 3, NULL);
INSERT INTO `f_seattype` VALUES (649, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 26, 4, NULL);
INSERT INTO `f_seattype` VALUES (650, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 26, 5, NULL);
INSERT INTO `f_seattype` VALUES (651, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 26, 6, NULL);
INSERT INTO `f_seattype` VALUES (652, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 27, 6, NULL);
INSERT INTO `f_seattype` VALUES (653, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 27, 5, NULL);
INSERT INTO `f_seattype` VALUES (654, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 27, 4, NULL);
INSERT INTO `f_seattype` VALUES (655, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 27, 3, NULL);
INSERT INTO `f_seattype` VALUES (656, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 27, 2, NULL);
INSERT INTO `f_seattype` VALUES (657, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 27, 1, NULL);
INSERT INTO `f_seattype` VALUES (658, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 27, 0, NULL);
INSERT INTO `f_seattype` VALUES (659, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 28, 0, NULL);
INSERT INTO `f_seattype` VALUES (660, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 28, 1, NULL);
INSERT INTO `f_seattype` VALUES (661, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 28, 2, NULL);
INSERT INTO `f_seattype` VALUES (662, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 28, 3, NULL);
INSERT INTO `f_seattype` VALUES (663, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 28, 4, NULL);
INSERT INTO `f_seattype` VALUES (664, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 28, 5, NULL);
INSERT INTO `f_seattype` VALUES (665, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 28, 6, NULL);
INSERT INTO `f_seattype` VALUES (666, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 29, 6, NULL);
INSERT INTO `f_seattype` VALUES (667, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 29, 5, NULL);
INSERT INTO `f_seattype` VALUES (668, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 29, 4, NULL);
INSERT INTO `f_seattype` VALUES (669, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 29, 3, NULL);
INSERT INTO `f_seattype` VALUES (670, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 29, 2, NULL);
INSERT INTO `f_seattype` VALUES (671, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 29, 1, NULL);
INSERT INTO `f_seattype` VALUES (672, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 29, 0, NULL);
INSERT INTO `f_seattype` VALUES (673, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 30, 0, NULL);
INSERT INTO `f_seattype` VALUES (674, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 30, 1, NULL);
INSERT INTO `f_seattype` VALUES (675, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 30, 2, NULL);
INSERT INTO `f_seattype` VALUES (676, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 30, 3, NULL);
INSERT INTO `f_seattype` VALUES (677, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 30, 4, NULL);
INSERT INTO `f_seattype` VALUES (678, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 30, 5, NULL);
INSERT INTO `f_seattype` VALUES (679, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 30, 6, NULL);
INSERT INTO `f_seattype` VALUES (680, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 31, 6, NULL);
INSERT INTO `f_seattype` VALUES (681, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 31, 5, NULL);
INSERT INTO `f_seattype` VALUES (682, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 31, 4, NULL);
INSERT INTO `f_seattype` VALUES (683, 3, 1, 2, 1, 1, 1, 1, 0, 1, 1, 31, 3, NULL);
INSERT INTO `f_seattype` VALUES (684, 3, 0, 2, 1, 0, 0, 1, 0, 1, 1, 31, 2, NULL);
INSERT INTO `f_seattype` VALUES (685, 3, 0, 2, 1, 1, 1, 1, 1, 1, 1, 31, 1, NULL);
INSERT INTO `f_seattype` VALUES (686, 3, 0, 2, 0, 1, 1, 1, 1, 1, 1, 31, 0, NULL);
INSERT INTO `f_seattype` VALUES (687, 4, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, NULL);
INSERT INTO `f_seattype` VALUES (688, 4, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, NULL);
INSERT INTO `f_seattype` VALUES (689, 4, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 2, NULL);
INSERT INTO `f_seattype` VALUES (690, 4, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 3, NULL);
INSERT INTO `f_seattype` VALUES (691, 4, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 4, NULL);
INSERT INTO `f_seattype` VALUES (692, 4, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 5, NULL);
INSERT INTO `f_seattype` VALUES (693, 4, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 6, NULL);
INSERT INTO `f_seattype` VALUES (694, 4, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 6, NULL);
INSERT INTO `f_seattype` VALUES (695, 4, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 5, NULL);
INSERT INTO `f_seattype` VALUES (696, 4, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 4, NULL);
INSERT INTO `f_seattype` VALUES (697, 4, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 3, NULL);
INSERT INTO `f_seattype` VALUES (698, 4, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 2, NULL);
INSERT INTO `f_seattype` VALUES (699, 4, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, NULL);
INSERT INTO `f_seattype` VALUES (700, 4, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, NULL);
INSERT INTO `f_seattype` VALUES (701, 4, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 0, NULL);
INSERT INTO `f_seattype` VALUES (702, 4, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 1, NULL);
INSERT INTO `f_seattype` VALUES (703, 4, 0, 0, 1, 0, 0, 1, 0, 1, 1, 2, 2, NULL);
INSERT INTO `f_seattype` VALUES (704, 4, 1, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, NULL);
INSERT INTO `f_seattype` VALUES (705, 4, 0, 0, 1, 0, 0, 1, 0, 1, 1, 2, 4, NULL);
INSERT INTO `f_seattype` VALUES (706, 4, 0, 0, 1, 1, 0, 1, 0, 1, 1, 2, 5, NULL);
INSERT INTO `f_seattype` VALUES (707, 4, 0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 6, NULL);
INSERT INTO `f_seattype` VALUES (708, 4, 0, 0, 0, 1, 1, 1, 0, 1, 1, 3, 6, NULL);
INSERT INTO `f_seattype` VALUES (709, 4, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 5, NULL);
INSERT INTO `f_seattype` VALUES (710, 4, 0, 0, 1, 0, 1, 1, 0, 1, 1, 3, 4, NULL);
INSERT INTO `f_seattype` VALUES (711, 4, 1, 0, 0, 0, 1, 1, 0, 1, 1, 3, 3, NULL);
INSERT INTO `f_seattype` VALUES (712, 4, 0, 0, 1, 0, 1, 1, 0, 1, 1, 3, 2, NULL);
INSERT INTO `f_seattype` VALUES (713, 4, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 1, NULL);
INSERT INTO `f_seattype` VALUES (714, 4, 0, 0, 1, 1, 1, 1, 0, 1, 1, 3, 0, NULL);
INSERT INTO `f_seattype` VALUES (715, 4, 0, 0, 0, 1, 1, 1, 0, 1, 1, 4, 0, NULL);
INSERT INTO `f_seattype` VALUES (716, 4, 0, 0, 1, 1, 1, 1, 0, 1, 1, 4, 1, NULL);
INSERT INTO `f_seattype` VALUES (717, 4, 0, 0, 1, 0, 1, 1, 0, 1, 1, 4, 2, NULL);
INSERT INTO `f_seattype` VALUES (718, 4, 1, 0, 0, 0, 1, 1, 0, 1, 1, 4, 3, NULL);
INSERT INTO `f_seattype` VALUES (719, 4, 0, 0, 1, 0, 1, 1, 0, 1, 1, 4, 4, NULL);
INSERT INTO `f_seattype` VALUES (720, 4, 0, 0, 1, 1, 1, 1, 0, 1, 1, 4, 5, NULL);
INSERT INTO `f_seattype` VALUES (721, 4, 0, 0, 0, 1, 1, 1, 0, 1, 1, 4, 6, NULL);
INSERT INTO `f_seattype` VALUES (722, 4, 0, 1, 0, 1, 0, 1, 0, 0, 1, 5, 6, NULL);
INSERT INTO `f_seattype` VALUES (723, 4, 0, 1, 1, 1, 0, 1, 0, 1, 1, 5, 5, NULL);
INSERT INTO `f_seattype` VALUES (724, 4, 0, 1, 1, 0, 0, 1, 0, 1, 1, 5, 4, NULL);
INSERT INTO `f_seattype` VALUES (725, 4, 1, 1, 1, 1, 0, 1, 0, 1, 1, 5, 3, NULL);
INSERT INTO `f_seattype` VALUES (726, 4, 0, 1, 1, 0, 0, 1, 0, 1, 1, 5, 2, NULL);
INSERT INTO `f_seattype` VALUES (727, 4, 0, 1, 1, 1, 0, 1, 0, 1, 1, 5, 1, NULL);
INSERT INTO `f_seattype` VALUES (728, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 5, 0, NULL);
INSERT INTO `f_seattype` VALUES (729, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 6, 0, NULL);
INSERT INTO `f_seattype` VALUES (730, 4, 0, 1, 1, 1, 0, 1, 0, 1, 1, 6, 1, NULL);
INSERT INTO `f_seattype` VALUES (731, 4, 0, 1, 1, 0, 0, 1, 0, 1, 1, 6, 2, NULL);
INSERT INTO `f_seattype` VALUES (732, 4, 1, 1, 1, 1, 0, 0, 0, 1, 1, 6, 3, NULL);
INSERT INTO `f_seattype` VALUES (733, 4, 0, 1, 1, 0, 0, 1, 0, 1, 1, 6, 4, NULL);
INSERT INTO `f_seattype` VALUES (734, 4, 0, 1, 1, 1, 0, 1, 0, 1, 1, 6, 5, NULL);
INSERT INTO `f_seattype` VALUES (735, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 6, 6, NULL);
INSERT INTO `f_seattype` VALUES (736, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 7, 6, NULL);
INSERT INTO `f_seattype` VALUES (737, 4, 0, 1, 1, 1, 0, 1, 0, 1, 1, 7, 5, NULL);
INSERT INTO `f_seattype` VALUES (738, 4, 0, 1, 1, 0, 0, 1, 0, 1, 1, 7, 4, NULL);
INSERT INTO `f_seattype` VALUES (739, 4, 1, 1, 1, 1, 0, 1, 0, 1, 1, 7, 3, NULL);
INSERT INTO `f_seattype` VALUES (740, 4, 0, 1, 1, 0, 0, 1, 0, 1, 1, 7, 2, NULL);
INSERT INTO `f_seattype` VALUES (741, 4, 0, 1, 1, 1, 0, 1, 0, 1, 1, 7, 1, NULL);
INSERT INTO `f_seattype` VALUES (742, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 7, 0, NULL);
INSERT INTO `f_seattype` VALUES (743, 4, 0, 1, 0, 1, 1, 1, 0, 1, 1, 8, 0, NULL);
INSERT INTO `f_seattype` VALUES (744, 4, 0, 1, 1, 1, 1, 1, 0, 1, 1, 8, 1, NULL);
INSERT INTO `f_seattype` VALUES (745, 4, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 2, NULL);
INSERT INTO `f_seattype` VALUES (746, 4, 1, 1, 1, 1, 1, 1, 0, 1, 1, 8, 3, NULL);
INSERT INTO `f_seattype` VALUES (747, 4, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 4, NULL);
INSERT INTO `f_seattype` VALUES (748, 4, 0, 1, 1, 1, 1, 1, 0, 1, 1, 8, 5, NULL);
INSERT INTO `f_seattype` VALUES (749, 4, 0, 1, 0, 1, 1, 1, 0, 1, 1, 8, 6, NULL);
INSERT INTO `f_seattype` VALUES (750, 4, 0, 1, 0, 1, 1, 1, 0, 1, 1, 9, 6, NULL);
INSERT INTO `f_seattype` VALUES (751, 4, 0, 1, 1, 1, 1, 1, 0, 1, 1, 9, 5, NULL);
INSERT INTO `f_seattype` VALUES (752, 4, 0, 1, 1, 0, 1, 1, 0, 1, 1, 9, 4, NULL);
INSERT INTO `f_seattype` VALUES (753, 4, 1, 1, 1, 1, 1, 1, 0, 1, 1, 9, 3, NULL);
INSERT INTO `f_seattype` VALUES (754, 4, 0, 1, 1, 0, 1, 1, 0, 1, 1, 9, 2, NULL);
INSERT INTO `f_seattype` VALUES (755, 4, 0, 1, 1, 1, 1, 1, 0, 1, 1, 9, 1, NULL);
INSERT INTO `f_seattype` VALUES (756, 4, 0, 1, 0, 1, 1, 1, 0, 1, 1, 9, 0, NULL);
INSERT INTO `f_seattype` VALUES (757, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 10, 0, NULL);
INSERT INTO `f_seattype` VALUES (758, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 10, 1, NULL);
INSERT INTO `f_seattype` VALUES (759, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 10, 2, NULL);
INSERT INTO `f_seattype` VALUES (760, 4, 1, 2, 1, 1, 0, 1, 0, 1, 1, 10, 3, NULL);
INSERT INTO `f_seattype` VALUES (761, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 10, 4, NULL);
INSERT INTO `f_seattype` VALUES (762, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 10, 5, NULL);
INSERT INTO `f_seattype` VALUES (763, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 10, 6, NULL);
INSERT INTO `f_seattype` VALUES (764, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 11, 6, NULL);
INSERT INTO `f_seattype` VALUES (765, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 11, 5, NULL);
INSERT INTO `f_seattype` VALUES (766, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 11, 4, NULL);
INSERT INTO `f_seattype` VALUES (767, 4, 1, 2, 1, 1, 0, 1, 0, 1, 1, 11, 3, NULL);
INSERT INTO `f_seattype` VALUES (768, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 11, 2, NULL);
INSERT INTO `f_seattype` VALUES (769, 4, 0, 2, 1, 1, 0, 1, 1, 1, 0, 11, 1, NULL);
INSERT INTO `f_seattype` VALUES (770, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 11, 0, NULL);
INSERT INTO `f_seattype` VALUES (771, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 12, 0, NULL);
INSERT INTO `f_seattype` VALUES (772, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 12, 1, NULL);
INSERT INTO `f_seattype` VALUES (773, 4, 0, 2, 1, 0, 0, 0, 0, 1, 1, 12, 2, NULL);
INSERT INTO `f_seattype` VALUES (774, 4, 1, 2, 1, 1, 0, 1, 0, 1, 1, 12, 3, NULL);
INSERT INTO `f_seattype` VALUES (775, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 12, 4, NULL);
INSERT INTO `f_seattype` VALUES (776, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 12, 5, NULL);
INSERT INTO `f_seattype` VALUES (777, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 12, 6, NULL);
INSERT INTO `f_seattype` VALUES (778, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 13, 6, NULL);
INSERT INTO `f_seattype` VALUES (779, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 13, 5, NULL);
INSERT INTO `f_seattype` VALUES (780, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 13, 4, NULL);
INSERT INTO `f_seattype` VALUES (781, 4, 1, 2, 1, 1, 0, 1, 0, 1, 1, 13, 3, NULL);
INSERT INTO `f_seattype` VALUES (782, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 13, 2, NULL);
INSERT INTO `f_seattype` VALUES (783, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 13, 1, NULL);
INSERT INTO `f_seattype` VALUES (784, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 13, 0, NULL);
INSERT INTO `f_seattype` VALUES (785, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 14, 0, NULL);
INSERT INTO `f_seattype` VALUES (786, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 14, 1, NULL);
INSERT INTO `f_seattype` VALUES (787, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 14, 2, NULL);
INSERT INTO `f_seattype` VALUES (788, 4, 1, 2, 1, 1, 0, 1, 0, 1, 1, 14, 3, NULL);
INSERT INTO `f_seattype` VALUES (789, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 14, 4, NULL);
INSERT INTO `f_seattype` VALUES (790, 4, 0, 2, 1, 1, 0, 1, 1, 1, 1, 14, 5, NULL);
INSERT INTO `f_seattype` VALUES (791, 4, 0, 2, 0, 1, 0, 1, 1, 1, 1, 14, 6, NULL);
INSERT INTO `f_seattype` VALUES (792, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 15, 6, NULL);
INSERT INTO `f_seattype` VALUES (793, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 15, 5, NULL);
INSERT INTO `f_seattype` VALUES (794, 4, 0, 2, 1, 0, 0, 1, 0, 1, 0, 15, 4, NULL);
INSERT INTO `f_seattype` VALUES (795, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 15, 3, NULL);
INSERT INTO `f_seattype` VALUES (796, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 15, 2, NULL);
INSERT INTO `f_seattype` VALUES (797, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 15, 1, NULL);
INSERT INTO `f_seattype` VALUES (798, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 15, 0, NULL);
INSERT INTO `f_seattype` VALUES (799, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 16, 0, NULL);
INSERT INTO `f_seattype` VALUES (800, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 16, 1, NULL);
INSERT INTO `f_seattype` VALUES (801, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 16, 2, NULL);
INSERT INTO `f_seattype` VALUES (802, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 16, 3, NULL);
INSERT INTO `f_seattype` VALUES (803, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 16, 4, NULL);
INSERT INTO `f_seattype` VALUES (804, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 16, 5, NULL);
INSERT INTO `f_seattype` VALUES (805, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 16, 6, NULL);
INSERT INTO `f_seattype` VALUES (806, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 17, 6, NULL);
INSERT INTO `f_seattype` VALUES (807, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 17, 5, NULL);
INSERT INTO `f_seattype` VALUES (808, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 17, 4, NULL);
INSERT INTO `f_seattype` VALUES (809, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 17, 3, NULL);
INSERT INTO `f_seattype` VALUES (810, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 17, 2, NULL);
INSERT INTO `f_seattype` VALUES (811, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 17, 1, NULL);
INSERT INTO `f_seattype` VALUES (812, 4, 0, 2, 0, 1, 1, 0, 1, 1, 1, 17, 0, NULL);
INSERT INTO `f_seattype` VALUES (813, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 18, 0, NULL);
INSERT INTO `f_seattype` VALUES (814, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 18, 1, NULL);
INSERT INTO `f_seattype` VALUES (815, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 18, 2, NULL);
INSERT INTO `f_seattype` VALUES (816, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 18, 3, NULL);
INSERT INTO `f_seattype` VALUES (817, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 18, 4, NULL);
INSERT INTO `f_seattype` VALUES (818, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 18, 5, NULL);
INSERT INTO `f_seattype` VALUES (819, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 18, 6, NULL);
INSERT INTO `f_seattype` VALUES (820, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 19, 6, NULL);
INSERT INTO `f_seattype` VALUES (821, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 19, 5, NULL);
INSERT INTO `f_seattype` VALUES (822, 4, 0, 2, 1, 0, 0, 1, 0, 1, 0, 19, 4, NULL);
INSERT INTO `f_seattype` VALUES (823, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 19, 3, NULL);
INSERT INTO `f_seattype` VALUES (824, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 19, 2, NULL);
INSERT INTO `f_seattype` VALUES (825, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 19, 1, NULL);
INSERT INTO `f_seattype` VALUES (826, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 19, 0, NULL);
INSERT INTO `f_seattype` VALUES (827, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 20, 0, NULL);
INSERT INTO `f_seattype` VALUES (828, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 20, 1, NULL);
INSERT INTO `f_seattype` VALUES (829, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 20, 2, NULL);
INSERT INTO `f_seattype` VALUES (830, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 20, 3, NULL);
INSERT INTO `f_seattype` VALUES (831, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 20, 4, NULL);
INSERT INTO `f_seattype` VALUES (832, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 20, 5, NULL);
INSERT INTO `f_seattype` VALUES (833, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 20, 6, NULL);
INSERT INTO `f_seattype` VALUES (834, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 21, 6, NULL);
INSERT INTO `f_seattype` VALUES (835, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 21, 5, NULL);
INSERT INTO `f_seattype` VALUES (836, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 21, 4, NULL);
INSERT INTO `f_seattype` VALUES (837, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 21, 3, NULL);
INSERT INTO `f_seattype` VALUES (838, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 21, 2, NULL);
INSERT INTO `f_seattype` VALUES (839, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 21, 1, NULL);
INSERT INTO `f_seattype` VALUES (840, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 21, 0, NULL);
INSERT INTO `f_seattype` VALUES (841, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 22, 0, NULL);
INSERT INTO `f_seattype` VALUES (842, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 22, 1, NULL);
INSERT INTO `f_seattype` VALUES (843, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 22, 2, NULL);
INSERT INTO `f_seattype` VALUES (844, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 22, 3, NULL);
INSERT INTO `f_seattype` VALUES (845, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 22, 4, NULL);
INSERT INTO `f_seattype` VALUES (846, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 22, 5, NULL);
INSERT INTO `f_seattype` VALUES (847, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 22, 6, NULL);
INSERT INTO `f_seattype` VALUES (848, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 23, 6, NULL);
INSERT INTO `f_seattype` VALUES (849, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 23, 5, NULL);
INSERT INTO `f_seattype` VALUES (850, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 23, 4, NULL);
INSERT INTO `f_seattype` VALUES (851, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 23, 3, NULL);
INSERT INTO `f_seattype` VALUES (852, 4, 0, 2, 1, 0, 0, 1, 0, 1, 0, 23, 2, NULL);
INSERT INTO `f_seattype` VALUES (853, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 23, 1, NULL);
INSERT INTO `f_seattype` VALUES (854, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 23, 0, NULL);
INSERT INTO `f_seattype` VALUES (855, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 24, 0, NULL);
INSERT INTO `f_seattype` VALUES (856, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 24, 1, NULL);
INSERT INTO `f_seattype` VALUES (857, 4, 0, 2, 1, 0, 0, 0, 0, 1, 1, 24, 2, NULL);
INSERT INTO `f_seattype` VALUES (858, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 24, 3, NULL);
INSERT INTO `f_seattype` VALUES (859, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 24, 4, NULL);
INSERT INTO `f_seattype` VALUES (860, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 24, 5, NULL);
INSERT INTO `f_seattype` VALUES (861, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 24, 6, NULL);
INSERT INTO `f_seattype` VALUES (862, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 25, 6, NULL);
INSERT INTO `f_seattype` VALUES (863, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 25, 5, NULL);
INSERT INTO `f_seattype` VALUES (864, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 25, 4, NULL);
INSERT INTO `f_seattype` VALUES (865, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 25, 3, NULL);
INSERT INTO `f_seattype` VALUES (866, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 25, 2, NULL);
INSERT INTO `f_seattype` VALUES (867, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 25, 1, NULL);
INSERT INTO `f_seattype` VALUES (868, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 25, 0, NULL);
INSERT INTO `f_seattype` VALUES (869, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 26, 0, NULL);
INSERT INTO `f_seattype` VALUES (870, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 26, 1, NULL);
INSERT INTO `f_seattype` VALUES (871, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 26, 2, NULL);
INSERT INTO `f_seattype` VALUES (872, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 26, 3, NULL);
INSERT INTO `f_seattype` VALUES (873, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 26, 4, NULL);
INSERT INTO `f_seattype` VALUES (874, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 26, 5, NULL);
INSERT INTO `f_seattype` VALUES (875, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 26, 6, NULL);
INSERT INTO `f_seattype` VALUES (876, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 27, 6, NULL);
INSERT INTO `f_seattype` VALUES (877, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 27, 5, NULL);
INSERT INTO `f_seattype` VALUES (878, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 27, 4, NULL);
INSERT INTO `f_seattype` VALUES (879, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 27, 3, NULL);
INSERT INTO `f_seattype` VALUES (880, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 27, 2, NULL);
INSERT INTO `f_seattype` VALUES (881, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 27, 1, NULL);
INSERT INTO `f_seattype` VALUES (882, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 27, 0, NULL);
INSERT INTO `f_seattype` VALUES (883, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 28, 0, NULL);
INSERT INTO `f_seattype` VALUES (884, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 28, 1, NULL);
INSERT INTO `f_seattype` VALUES (885, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 28, 2, NULL);
INSERT INTO `f_seattype` VALUES (886, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 28, 3, NULL);
INSERT INTO `f_seattype` VALUES (887, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 28, 4, NULL);
INSERT INTO `f_seattype` VALUES (888, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 28, 5, NULL);
INSERT INTO `f_seattype` VALUES (889, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 28, 6, NULL);
INSERT INTO `f_seattype` VALUES (890, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 29, 6, NULL);
INSERT INTO `f_seattype` VALUES (891, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 29, 5, NULL);
INSERT INTO `f_seattype` VALUES (892, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 29, 4, NULL);
INSERT INTO `f_seattype` VALUES (893, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 29, 3, NULL);
INSERT INTO `f_seattype` VALUES (894, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 29, 2, NULL);
INSERT INTO `f_seattype` VALUES (895, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 29, 1, NULL);
INSERT INTO `f_seattype` VALUES (896, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 29, 0, NULL);
INSERT INTO `f_seattype` VALUES (897, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 30, 0, NULL);
INSERT INTO `f_seattype` VALUES (898, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 30, 1, NULL);
INSERT INTO `f_seattype` VALUES (899, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 30, 2, NULL);
INSERT INTO `f_seattype` VALUES (900, 4, 1, 2, 1, 1, 1, 1, 0, 1, 1, 30, 3, NULL);
INSERT INTO `f_seattype` VALUES (901, 4, 0, 2, 1, 0, 0, 1, 0, 1, 1, 30, 4, NULL);
INSERT INTO `f_seattype` VALUES (902, 4, 0, 2, 1, 1, 1, 1, 1, 1, 1, 30, 5, NULL);
INSERT INTO `f_seattype` VALUES (903, 4, 0, 2, 0, 1, 1, 1, 1, 1, 1, 30, 6, NULL);

-- ----------------------------
-- Table structure for f_userinfo
-- ----------------------------
DROP TABLE IF EXISTS `f_userinfo`;
CREATE TABLE `f_userinfo`  (
  `userinfo_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `u_username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `u_password` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '密码',
  `u_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `u_sex` int(6) NULL DEFAULT 0 COMMENT '性别：男 0，女 1',
  `u_age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `u_demand` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '需求',
  `u_vip` int(11) NULL DEFAULT 0 COMMENT '是否为vip用户 默认1  是 0  , 不是 1 ',
  `u_creatime` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`userinfo_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of f_userinfo
-- ----------------------------
INSERT INTO `f_userinfo` VALUES (1, 'zs', '123456', '张三', 1, 35, NULL, 1, '2019-06-10 16:58:59');
INSERT INTO `f_userinfo` VALUES (2, 'ls', '123456', '李四', 1, 46, NULL, 1, NULL);
INSERT INTO `f_userinfo` VALUES (3, 'ww', '123456', '王五', 1, 24, NULL, 0, '2019-06-05 08:20:29');
INSERT INTO `f_userinfo` VALUES (4, 'zl', '123456', '赵六', 1, 30, NULL, 0, NULL);
INSERT INTO `f_userinfo` VALUES (5, 'sq', '123456', '孙七', 0, 18, NULL, 0, NULL);
INSERT INTO `f_userinfo` VALUES (6, 'zb', '123456', '周八', 1, 35, NULL, 1, NULL);
INSERT INTO `f_userinfo` VALUES (7, 'wj', '123456', '吴九', 0, 40, NULL, 0, NULL);
INSERT INTO `f_userinfo` VALUES (8, 'ZZZ', '123456', '张五六', 1, 30, NULL, 1, '2019-06-10 16:43:23');
INSERT INTO `f_userinfo` VALUES (9, 'YYY', '123456', '张久亮', 1, 30, NULL, 1, '2019-06-10 16:59:37');
INSERT INTO `f_userinfo` VALUES (10, 'zss', '123456', '111', 1, 11, NULL, 1, '2019-09-12 09:28:20');

-- ----------------------------
-- Table structure for y_f_person_demand
-- ----------------------------
DROP TABLE IF EXISTS `y_f_person_demand`;
CREATE TABLE `y_f_person_demand`  (
  `y_demand_id` int(11) NOT NULL AUTO_INCREMENT,
  `userinfo_id` int(11) NOT NULL COMMENT '用户id',
  `demand_renshu` int(11) NULL DEFAULT NULL COMMENT '人数',
  `demand_women` int(11) NULL DEFAULT NULL COMMENT '年轻女性',
  `demand_men` int(11) NULL DEFAULT NULL COMMENT '年轻男性',
  `demand_nobaby` int(11) NULL DEFAULT NULL COMMENT '四周无婴儿',
  `demand_window` int(11) NULL DEFAULT NULL COMMENT '靠窗：0，不靠窗：1',
  `demand_aisle` int(11) NULL DEFAULT NULL COMMENT '靠过道：0，不：1',
  `demand_front` int(11) NULL DEFAULT NULL COMMENT '靠前：0，不：',
  `demand_exit` int(11) NULL DEFAULT NULL COMMENT '紧急出口：0，不：1',
  `demand_spacious` int(11) NULL DEFAULT NULL COMMENT '腿部宽敞：0，不：1',
  `demand_gate` int(11) NULL DEFAULT NULL COMMENT '登机口：0，不：1',
  `demand_baby` int(11) NULL DEFAULT NULL COMMENT '婴儿座位：0，不：1',
  PRIMARY KEY (`y_demand_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
