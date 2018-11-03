CREATE SCHEMA `dmsdb` ;
-- 管理员表
CREATE TABLE `dmsdb`.`admin_info` (
  `aId` 		INT 			NOT NULL,												-- 管理员ID
  `aPassword` 	VARCHAR(45) 	default '123456',										-- 管理员密码
  `aName` 		VARCHAR(45) 	NOT NULL,												-- 管理员姓名
  `aSex` 		VARCHAR(45) 	default '男',											-- 管理员性别
  `aPhoNum`		VARCHAR(45) 	NULL,													-- 管理员手机
  `aAddr` 		VARCHAR(45) 	NULL,													-- 管理员地址
  `aLimit` 		INT 			default 0,												-- 管理员权限
  `aDate`		DATE 			NULL,													-- 管理员注册日期
  PRIMARY KEY (`aId`)

 );
 INSERT INTO `dmsdb`.`admin_info` VALUES(0,'123456','王浩','男', '15270496554', '南京东路235号', 0, '2018-07-10');