/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.14 : Database - purchasingdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`purchasingdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `purchasingdb`;

/*Table structure for table `pur_bus_order` */

DROP TABLE IF EXISTS `pur_bus_order`;

CREATE TABLE `pur_bus_order` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `processInstance_id` varchar(255) DEFAULT NULL,
  `endtime` date DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userId` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pur_bus_order` */

insert  into `pur_bus_order`(`id`,`name`,`price`,`createtime`,`status`,`user_id`,`processInstance_id`,`endtime`,`content`) values ('7525365843f542dda244ddfe5e79dda3','test',12,'2016-05-14','2','1',NULL,NULL,'gdf'),('b93b2fd5c57e4c8db41a82c16cc3f28e','5月14日第一次采购',49999,'2016-05-14','5','1',NULL,NULL,'笔记本，台式机');

/*Table structure for table `pur_bus_order_audit` */

DROP TABLE IF EXISTS `pur_bus_order_audit`;

CREATE TABLE `pur_bus_order_audit` (
  `id` varchar(255) NOT NULL,
  `user_Id` varchar(255) DEFAULT NULL,
  `order_id` varchar(255) DEFAULT NULL,
  `audit_info` varchar(255) DEFAULT NULL,
  `audit_type` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userId` (`user_Id`),
  KEY `orderId` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pur_bus_order_audit` */

insert  into `pur_bus_order_audit`(`id`,`user_Id`,`order_id`,`audit_info`,`audit_type`,`status`,`createtime`) values ('49fafdd172784be39e98bf9527074172','3','b93b2fd5c57e4c8db41a82c16cc3f28e','还可以',NULL,'1',NULL),('8080195f90c1495c84d65a17b5293e13','2','b93b2fd5c57e4c8db41a82c16cc3f28e','挺好',NULL,'1',NULL);

/*Table structure for table `pur_sys_role` */

DROP TABLE IF EXISTS `pur_sys_role`;

CREATE TABLE `pur_sys_role` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pur_sys_role` */

/*Table structure for table `pur_sys_user` */

DROP TABLE IF EXISTS `pur_sys_user`;

CREATE TABLE `pur_sys_user` (
  `id` varchar(255) NOT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pur_sys_user` */

insert  into `pur_sys_user`(`id`,`userid`,`username`,`pwd`) values ('1','admin','admin','96e79218965eb72c92a549dd5a330112'),('2','jingli','部门经理','96e79218965eb72c92a549dd5a330112'),('3','zongjingli','总经理','96e79218965eb72c92a549dd5a330112');

/*Table structure for table `pur_sys_user_role` */

DROP TABLE IF EXISTS `pur_sys_user_role`;

CREATE TABLE `pur_sys_user_role` (
  `id` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userId` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pur_sys_user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
