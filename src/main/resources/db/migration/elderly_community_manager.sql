DROP TABLE `user`;
DROP TABLE `system_user`;
DROP TABLE `residence`;
DROP TABLE `retire`;
DROP TABLE `medical_and_life`;
DROP TABLE `children`;
DROP TABLE `illness`;
DROP TABLE `work_flow`;
DROP TABLE `household`;

-- 用户表
CREATE TABLE `user` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(20) NULL COMMENT '用户名',
`sex` int(2) NULL COMMENT '性别',
`age` int(4) NULL COMMENT '年龄',
`mobile` varchar(20) NULL COMMENT '手机号',
`id_number` varchar(20) NOT NULL COMMENT '身份证号',
`emergency_contact` varchar(20) NULL COMMENT '紧急联系人',
`password` varchar(50) NULL COMMENT '密码',
`type` int(2) NULL DEFAULT 0 COMMENT '类型：',
`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
`id_number (`mobile`),
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 系统用户表
CREATE TABLE `system_user` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(20) NULL COMMENT '用户名',
`sex` int(2) NULL COMMENT '性别',
`age` int(4) NULL COMMENT '年龄',
`mobile` varchar(20) NULL COMMENT '手机号',
`id_number` varchar(20) NULL COMMENT '身份证号',
`email` varchar(50) NULL COMMENT '邮箱',
`password` varchar(50) NULL COMMENT '密码',
`type` int(2) NULL DEFAULT 0 COMMENT '类型：0，操作员。1.管理员',
`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 居住信息表
CREATE TABLE `residence` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(50) NULL COMMENT '名称',
`code` varchar(10) NULL COMMENT '代码',
`location` varchar(255) NULL COMMENT '位置',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='影院表';

-- 退休情况表
CREATE TABLE `retire` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`user_id` bigint(20) NOT NULL COMMENT '用户id',


`name` varchar(50) NULL COMMENT '名称',
`code` varchar(10) NULL COMMENT '代码',
`type` int(2) NULL DEFAULT 0 COMMENT '类型：1.普通。2.2D。3.3D。4.Imax3D',
`cinema_id` bigint(20) NULL COMMENT '影院id',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='大厅表';

-- 医疗保险表
CREATE TABLE `medical_and_life` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`user_id` bigint(20) NULL COMMENT '用户id',

PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='座位表';

-- 子女表
CREATE TABLE `children` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`user_id` bigint(20) NULL COMMENT '用户id
',
`code` varchar(10) NULL COMMENT '代码',
`type` int(2) NULL COMMENT '类型',
`year` timestamp NULL COMMENT '年代',
`start_time` timestamp NULL COMMENT '上映时间',
`end_time` timestamp NULL COMMENT '撤映时间',
`area` varchar(255) NULL COMMENT '地区',
`grade` numeric(5,0) NULL COMMENT '评分',
`duration` numeric(5,0) NULL COMMENT '时长',
`discounts` numeric(5,0) NULL COMMENT '优惠',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='电影表';

-- 疾病情况表
CREATE TABLE `illness` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`login_name` varchar(20) NULL COMMENT '登录名',
`user_name` varchar(20) NULL COMMENT '用户名',
`sex` int(2) NULL COMMENT '性别',
`mobile` varchar(20) NULL COMMENT '手机号',
`email` varchar(50) NULL COMMENT '邮箱',
`password` varchar(50) NULL COMMENT '密码',
`type` int(2) NULL DEFAULT 0 COMMENT '类型：0，普通用户。1.管理员',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 工作流程表
CREATE TABLE `work_flow` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`grade` numeric(5,0) NULL,
`content` text NULL,
`user_id` bigint(20) NULL,
`movie_id` bigint(20) NULL,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表';

-- 户籍情况表
CREATE TABLE `household` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`code` varchar(20) NULL COMMENT '序列号',
`price` decimal(4,3) NULL COMMENT '价格',
`move_id` bigint(20) NULL COMMENT '电影id',
`create_time` timestamp NULL,
`order_state` int(2) NULL COMMENT '订单状态。1，正常。0，退单',
`pay_state` int(2) NULL COMMENT '支付状态。0，未支付；1.已支付',
`disco_id` bigint(20) NULL COMMENT '优惠id',
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';
