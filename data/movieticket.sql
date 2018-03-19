/*
Navicat MySQL Data Transfer

Source Server         : 本机MySQL
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : monkey

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-27 17:35:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `movieId` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `content` text COLLATE utf8_bin,
  `rating` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES ('1', 'ddd', '1', 0x73646673646673, null);

-- ----------------------------
-- Table structure for coupons
-- ----------------------------
DROP TABLE IF EXISTS `coupons`;
CREATE TABLE `coupons` (
  `id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `discount` smallint(2) DEFAULT NULL,
  `condition` smallint(3) DEFAULT NULL,
  `username` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `expiredTime` date DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of coupons
-- ----------------------------
INSERT INTO `coupons` VALUES ('1', null, null, 'ddd', null, null);

-- ----------------------------
-- Table structure for favorites
-- ----------------------------
DROP TABLE IF EXISTS `favorites`;
CREATE TABLE `favorites` (
  `id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `movieId` varchar(32) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of favorites
-- ----------------------------

-- ----------------------------
-- Table structure for movies
-- ----------------------------
DROP TABLE IF EXISTS `movies`;
CREATE TABLE `movies` (
  `id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `description` text COLLATE utf8_bin,
  `playingTime` date DEFAULT NULL,
  `duration` smallint(6) DEFAULT NULL,
  `movieType` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `playingType` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `expired` tinyint(1) DEFAULT NULL,
  `rating` float DEFAULT NULL,
  `ratingNum` smallint(6) DEFAULT NULL,
  `poster` varchar(40) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of movies
-- ----------------------------
INSERT INTO `movies` VALUES ('1', 'qweqwe', 0x647376736476736466736466, '2017-12-27', null, 'ds', 'df', null, null, null, 'ddd');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `screenId` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `seat` blob,
  `username` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `createTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` tinyint(1) DEFAULT NULL,
  `couponId` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `totalPrice` float DEFAULT NULL,
  `payPrice` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for recommends
-- ----------------------------
DROP TABLE IF EXISTS `recommends`;
CREATE TABLE `recommends` (
  `movieId` varchar(32) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`movieId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of recommends
-- ----------------------------

-- ----------------------------
-- Table structure for screens
-- ----------------------------
DROP TABLE IF EXISTS `screens`;
CREATE TABLE `screens` (
  `id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `movieId` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `price` float DEFAULT NULL,
  `ticketNum` smallint(6) DEFAULT NULL,
  `hallNum` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `playingType` varchar(10) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of screens
-- ----------------------------
INSERT INTO `screens` VALUES ('1', '1', '2017-12-27 17:34:55', '12', '1', '1', null);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `payPassword` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `nickname` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `money` float DEFAULT NULL,
  `description` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `avatar` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `isAdmin` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'mxy', 'mxy', 'ddd', null, null, null, null);
