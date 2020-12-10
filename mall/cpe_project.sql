/*
Navicat MySQL Data Transfer

Source Server         : 47.107.227.121
Source Server Version : 50562
Source Host           : 47.107.227.121:3306
Source Database       : cpe_project

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-12-11 00:07:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for db_admin_user
-- ----------------------------
DROP TABLE IF EXISTS `db_admin_user`;
CREATE TABLE `db_admin_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin` varchar(20) NOT NULL COMMENT '管理员名称',
  `password` varchar(200) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_admin_user_id_uindex` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='管理用户信息表';

-- ----------------------------
-- Records of db_admin_user
-- ----------------------------
INSERT INTO `db_admin_user` VALUES ('1', 'administrator', '58873bed47cee9c9941de53a7cc42bf7');
INSERT INTO `db_admin_user` VALUES ('2', 'admin', 'def0e4568a393af9aca7bfa3d54c5147');

-- ----------------------------
-- Table structure for db_article_info
-- ----------------------------
DROP TABLE IF EXISTS `db_article_info`;
CREATE TABLE `db_article_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '一级标题',
  `title_two` varchar(255) DEFAULT NULL COMMENT '一级副标题',
  `title_img` varchar(255) DEFAULT NULL COMMENT '文章列表图片',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `sort` int(8) DEFAULT '1000',
  `status` int(2) DEFAULT '0' COMMENT '是否删除 0 未删除  1 已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_article_info_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_article_info
-- ----------------------------
INSERT INTO `db_article_info` VALUES ('8', '脐带精华提取物高能抗衰精华液', 'UMBILICAL CORD ESSENCE ANTI-AGING NUTRITIOUS FACIAL ESSENCE', '/sys/uploadImg/downLoadBanner/20200928232058004_783839.png', '2020-09-27 21:25:25', '1000', '0');
INSERT INTO `db_article_info` VALUES ('9', '脐带精华提取物高能抗衰精华液', '', '/sys/uploadImg/downLoadBanner/20200928232341161_113540.png', '2020-09-28 22:51:43', '1000', '0');
INSERT INTO `db_article_info` VALUES ('10', '额娃儿额外', '', '/sys/uploadImg/downLoadBanner/20200928231127154_151381.png', '2020-09-28 23:13:11', '1000', '0');
INSERT INTO `db_article_info` VALUES ('11', '脐带精华提取物高能抗衰精华液', '', '/sys/uploadImg/downLoadBanner/20200928232310025_665561.png', '2020-09-28 23:18:42', '1000', '0');

-- ----------------------------
-- Table structure for db_article_section
-- ----------------------------
DROP TABLE IF EXISTS `db_article_section`;
CREATE TABLE `db_article_section` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(2) DEFAULT NULL COMMENT '类型:1 1级标题, 2 2级标题 3 段落, 4 图片',
  `content` varchar(1000) DEFAULT NULL COMMENT '段落内容,或者是图片地址',
  `sort` int(4) DEFAULT '0' COMMENT '排序',
  `status` int(2) DEFAULT '0' COMMENT '是否删除 0 未删除 1 已删除',
  `article_info_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_article_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_article_section
-- ----------------------------
INSERT INTO `db_article_section` VALUES ('36', '1', '阿发表示得到打单发的法师的发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发', '102', '0', '8');
INSERT INTO `db_article_section` VALUES ('37', '2', 'USAFJJFIEAHSDFA', '101', '0', '8');
INSERT INTO `db_article_section` VALUES ('38', '3', '阿发表示得到打单发的法师的发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发', '100', '0', '8');
INSERT INTO `db_article_section` VALUES ('39', '3', '阿发表示得到打单发的法师的发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发', '99', '0', '8');
INSERT INTO `db_article_section` VALUES ('40', '3', '阿发表示得到打单发的法师的发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发', '98', '0', '8');
INSERT INTO `db_article_section` VALUES ('41', '4', '/sys/uploadImg/downLoadBanner/20200927212727803_310971.png', '97', '0', '8');
INSERT INTO `db_article_section` VALUES ('42', '3', '阿发表示得到打单发的法师的发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发', '96', '0', '8');
INSERT INTO `db_article_section` VALUES ('43', '1', '阿发表示得到打单发的法师的发大大是大非阿斯蒂芬阿斯蒂芬阿斯蒂芬阿萨德法师的发as发送到发', '12', '0', '9');

-- ----------------------------
-- Table structure for db_banner
-- ----------------------------
DROP TABLE IF EXISTS `db_banner`;
CREATE TABLE `db_banner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `banner_name` varchar(255) DEFAULT NULL,
  `banner_img` varchar(500) DEFAULT NULL,
  `sort` int(4) DEFAULT NULL,
  `status` int(2) DEFAULT '0' COMMENT '是否删除; 0 未删除, 1 已删除',
  `type` int(2) DEFAULT '1' COMMENT '是否为banner  0 表示不是banner, 1表示是banner',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_banner_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_banner
-- ----------------------------
INSERT INTO `db_banner` VALUES ('11', 'banner1', '/sys/uploadImg/downLoadBanner/20200927201409057_272617.png', '100', '0', '1');
INSERT INTO `db_banner` VALUES ('12', 'banner2', '/sys/uploadImg/downLoadBanner/20200927201517163_405679.png', '108', '0', '1');
INSERT INTO `db_banner` VALUES ('13', 'banner3', '/sys/uploadImg/downLoadBanner/20200928214026331_397990.png', '101', '0', '1');

-- ----------------------------
-- Table structure for db_product_dict
-- ----------------------------
DROP TABLE IF EXISTS `db_product_dict`;
CREATE TABLE `db_product_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `type` int(2) DEFAULT '0' COMMENT '1;产品系列\n2.产品种类',
  `status` int(2) DEFAULT '0' COMMENT '0 正常 1表示删除',
  `sort` int(4) DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_product_dict_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_product_dict
-- ----------------------------
INSERT INTO `db_product_dict` VALUES ('8', 'CPE外泌体系列', '1', '0', '1');
INSERT INTO `db_product_dict` VALUES ('9', 'CPE外敷', '1', '0', '2');
INSERT INTO `db_product_dict` VALUES ('10', '精华液', '2', '0', '101');
INSERT INTO `db_product_dict` VALUES ('11', '面膜', '1', '1', '103');
INSERT INTO `db_product_dict` VALUES ('12', '面膜', '2', '0', '103');

-- ----------------------------
-- Table structure for db_product_img
-- ----------------------------
DROP TABLE IF EXISTS `db_product_img`;
CREATE TABLE `db_product_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imgurl` varchar(255) DEFAULT NULL,
  `product_info_id` int(11) DEFAULT NULL,
  `sort` int(2) DEFAULT NULL,
  `status` int(2) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_product_img_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_product_img
-- ----------------------------
INSERT INTO `db_product_img` VALUES ('13', '/sys/uploadImg/downLoadBanner/20201009204147625_993112.png', '11', '100', '0');
INSERT INTO `db_product_img` VALUES ('14', '/sys/uploadImg/downLoadBanner/20201009204203126_640871.png', '11', '99', '0');
INSERT INTO `db_product_img` VALUES ('15', '/sys/uploadImg/downLoadBanner/20201009204216090_352774.png', '11', '98', '0');

-- ----------------------------
-- Table structure for db_product_info
-- ----------------------------
DROP TABLE IF EXISTS `db_product_info`;
CREATE TABLE `db_product_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `title_two` varchar(255) DEFAULT NULL,
  `money` int(11) DEFAULT '0',
  `volume` int(11) DEFAULT '0',
  `title_img` varchar(255) DEFAULT NULL,
  `type_category` int(11) DEFAULT NULL,
  `status` int(2) DEFAULT '0',
  `sort` int(2) DEFAULT '0',
  `type_series` int(11) DEFAULT NULL,
  `tmall` varchar(255) DEFAULT NULL,
  `jd` varchar(255) DEFAULT NULL,
  `type` int(2) DEFAULT '0' COMMENT '是否到首页  0 不在 1在',
  `norms` varchar(255) DEFAULT NULL COMMENT '规格: 代替价格和钱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_product_info_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_product_info
-- ----------------------------
INSERT INTO `db_product_info` VALUES ('10', '脐带精华提取物高能抗衰精华液', 'UMBILICAL CORD ESSENCE ANTI-AGING NUTRITIOUS FACIAL ESSENCE', null, null, '/sys/uploadImg/downLoadBanner/20201007235322091_247742.png', '12', '0', '100', '9', 'https://www.baidu.com/', 'https://www.baidu.com/', '1', '$35 / 46ml');
INSERT INTO `db_product_info` VALUES ('11', '脐带精华提取物高能抗衰精华液', 'UMBILICAL CORD ESSENCE ANTI-AGING NUTRITIOUS FACIAL ESSENCE', null, null, '/sys/uploadImg/downLoadBanner/20201007235308742_284725.png', '10', '0', '101', '9', 'https://www.baidu.com/', '', '1', '$35 / 46ml');
INSERT INTO `db_product_info` VALUES ('12', '脐带精华提取物高能抗衰精华液', 'UMBILICAL CORD ESSENCE ANTI-AGING NUTRITIOUS FACIAL ESSENCE', null, null, '/sys/uploadImg/downLoadBanner/20201007235335761_662562.png', '12', '0', '100', '9', 'https://www.baidu.com/', 'https://www.baidu.com/', '1', '$35 / 46ml');
INSERT INTO `db_product_info` VALUES ('13', '脐带精华提取物高能抗衰精华液', 'UMBILICAL CORD ESSENCE ANTI-AGING NUTRITIOUS FACIAL ESSENCE', null, null, '/sys/uploadImg/downLoadBanner/20201007235348183_990883.png', '10', '0', '100', '8', 'https://www.baidu.com/', 'https://www.baidu.com/', '1', '$35 / 46ml');
INSERT INTO `db_product_info` VALUES ('14', '脐带精华提取物高能抗衰精华液', 'UMBILICAL CORD ESSENCE ANTI-AGING<br> NUTRITIOUS FACIAL ESSENCE', null, null, '/sys/uploadImg/downLoadBanner/20201007235400927_454297.png', '12', '0', '100', '9', 'https://www.baidu.com/', 'https://www.baidu.com/', '1', '$35 / 46ml');
INSERT INTO `db_product_info` VALUES ('15', '脐带精华提取物高能抗衰精华液', '', null, null, '/sys/uploadImg/downLoadBanner/20201009204556701_265603.png', '12', '0', '101', '9', '', '', '1', '$35 / 46ml');

-- ----------------------------
-- Table structure for db_user
-- ----------------------------
DROP TABLE IF EXISTS `db_user`;
CREATE TABLE `db_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `birthday` timestamp NULL DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `status` int(2) DEFAULT '0' COMMENT '是否删除  0 未删除, 1 已删除',
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_user_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_user
-- ----------------------------
INSERT INTO `db_user` VALUES ('3', '', '2020-12-22 00:00:00', '', '', '0', '2020-12-08 22:16:12');
INSERT INTO `db_user` VALUES ('4', 'yongsheng yang', '2020-12-08 00:00:00', '18616959965', '1095737364@qq.com', '0', '2020-12-08 22:49:03');
INSERT INTO `db_user` VALUES ('5', 'yongsheng yang', '2020-12-08 00:00:00', '18616959965', '1095737364@qq.com', '0', '2020-12-08 22:49:13');

-- ----------------------------
-- Table structure for db_wide_table
-- ----------------------------
DROP TABLE IF EXISTS `db_wide_table`;
CREATE TABLE `db_wide_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(4) DEFAULT NULL COMMENT '类型:  1 首页的banner 列表  ,   ',
  `title` varchar(255) DEFAULT NULL COMMENT '标题一',
  `title_two` varchar(255) DEFAULT NULL COMMENT '标题二',
  `button_text` varchar(255) DEFAULT NULL COMMENT '按钮文本',
  `button_href` varchar(255) DEFAULT NULL COMMENT '按钮链接',
  `img` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `color` varchar(255) DEFAULT NULL COMMENT '颜色',
  `sort` int(4) DEFAULT NULL COMMENT '排序',
  `status` int(2) DEFAULT '0' COMMENT '0 未删除  , 1 已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_wide_table_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_wide_table
-- ----------------------------
INSERT INTO `db_wide_table` VALUES ('1', '1', 'REVERSE AGING CELL REPAIR SERIES', '逆龄细胞修复系列', '了解更多', 'http://www.baidu.com', '/sys/uploadImg/downLoadBanner/20201007231552663_613448.png', 'black', '100', '0');
INSERT INTO `db_wide_table` VALUES ('2', '1', 'COLDEN REPAIR ESSENCE LYOPHI- LIZED SERUM', '焕肤修护金翎精华', '了解更多', 'http://www.baidu.com', '/sys/uploadImg/downLoadBanner/20201007233109723_654126.png', 'white', '100', '0');
INSERT INTO `db_wide_table` VALUES ('3', '2', null, null, null, null, '/sys/uploadImg/downLoadBanner/20201016220449742_607994.png', null, '100', '0');
INSERT INTO `db_wide_table` VALUES ('4', '2', null, null, null, null, '/sys/uploadImg/downLoadBanner/20201016220508364_764532.png', null, '91', '0');
INSERT INTO `db_wide_table` VALUES ('5', '3', null, null, null, null, '/sys/uploadImg/downLoadBanner/20201024111209221_110336.png', null, null, '1');
INSERT INTO `db_wide_table` VALUES ('6', '3', null, null, null, null, '/sys/uploadImg/downLoadBanner/20201024115053770_764437.mp4', null, null, '1');
INSERT INTO `db_wide_table` VALUES ('7', '3', null, null, null, null, '/sys/uploadImg/downLoadBanner/20201024120514222_436094.mp4', null, null, '1');
INSERT INTO `db_wide_table` VALUES ('8', '3', null, null, null, null, '/sys/uploadImg/downLoadBanner/20201025100043079_342225.mp4', null, null, '1');
INSERT INTO `db_wide_table` VALUES ('9', '3', null, null, null, null, '/sys/uploadImg/downLoadBannerVideo/20201025133457389_437639.mp4', null, null, '0');
INSERT INTO `db_wide_table` VALUES ('10', '1', '脐带精华提取物高能抗衰精华液', 'UMBILICAL CORD ESSENCE ANTI-AGING NUTRITIOUS FACIAL ESSENCE', '了解更多', 'https://www.baidu.com', '/sys/uploadImg/downLoadBanner/20201203225410523_525238.png', 'white', '3', '0');
INSERT INTO `db_wide_table` VALUES ('11', '1', 'COLDEN REPAIR ESSENCE LYOPHI- LIZED SERUM', '逆龄细胞修复系列', '了解更多', '', '/sys/uploadImg/downLoadBanner/20201203225558590_658210.png', 'white', '99', '0');
