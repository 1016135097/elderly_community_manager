DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `system_user`;
DROP TABLE IF EXISTS `residence`;
DROP TABLE IF EXISTS `retire`;
DROP TABLE IF EXISTS `medical_and_life`;
DROP TABLE IF EXISTS `children`;
DROP TABLE IF EXISTS `illness`;
DROP TABLE IF EXISTS `work_flow`;
DROP TABLE IF EXISTS `work_flow_item`;
DROP TABLE IF EXISTS `household`;

-- 用户表
CREATE TABLE `user` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(20) NULL COMMENT '用户名',
`sex` int(2) NULL COMMENT '性别',
`age` int(4) NULL COMMENT '年龄',
`address` varchar(200) NULL COMMENT '地址',
`mobile` varchar(20) NULL COMMENT '手机号',
`emergency_contact` varchar(20) NULL COMMENT '紧急联系人',
`retire_type` int(2) NULL DEFAULT 0 COMMENT '是否为孤寡老人',
`medical_type` int(2) NULL DEFAULT 0 COMMENT '是否有医疗保险',
`type` int(2) NULL DEFAULT 0 COMMENT '类型：',
`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
 UNIQUE(`id_number`),
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 系统用户表
CREATE TABLE `system_user` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(20) NULL COMMENT '用户名',
`user_name` varchar(20) NULL COMMENT '姓名',
`sex` int(2) NULL COMMENT '性别',
`age` int(4) NULL COMMENT '年龄',
`mobile` varchar(20) NULL COMMENT '手机号',
`id_number` varchar(20) NULL COMMENT '身份证号',
`email` varchar(50) NULL COMMENT '邮箱',
`password` varchar(50) NULL COMMENT '密码',
`type` int(3) NULL COMMENT '用户类型',
`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
 UNIQUE(`id_number`),
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户表';


-- 退休情况表
CREATE TABLE `retire` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`user_id` bigint(20) NOT NULL COMMENT '用户id',
`age` int(4) NULL COMMENT '退休年龄',
`type` int(3) NULL  COMMENT '退休类型',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退休情况表';


-- 子女表
CREATE TABLE `children` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`user_id` bigint(20) NULL COMMENT '用户id',
`name` varchar(20) NULL COMMENT '姓名',
`age` int(4) NULL COMMENT '年龄',
`mobile` varchar(20) NULL COMMENT '手机号',
`address` varchar(255) NULL COMMENT '住址',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子女表';

-- 疾病情况表
CREATE TABLE `illness` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`user_id` bigint(20) NULL COMMENT '用户id',
`isillness` int(2) NULL COMMENT '是否有疾病',
`name` varchar(20) NULL COMMENT '疾病名称',
`state` varchar(20) NULL COMMENT '疾病状态',
`hospital` varchar(50) NULL COMMENT '主治医院',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='疾病情况表';

-- 工作流程表
CREATE TABLE `workflow` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`user_id` bigint(20) NULL COMMENT '用户id',
`name` varchar(20) NULL COMMENT '名称',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工作流程表';

-- 流程项
CREATE TABLE `work_flow_item` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`flow_id` bigint(20) NULL COMMENT '流程id',
`name` varchar(20) NULL COMMENT '名称',
`desc` varchar(255) NULL COMMENT '描述',
`start_time` datetime NOT NULL COMMENT '开始时间',
`end_time` datetime NOT NULL COMMENT '结束时间',
`type` int(3) NULL COMMENT '状态',
`important` int(3) NULL COMMENT '重要程度',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流程项';
