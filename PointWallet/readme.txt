ID        订单号 购买时间 购买商品      商品总价      订单详情
       orderNo  buyTime goodName goodPrice   
       
create database pointwallet;

use pointwallet;

DROP TABLE IF EXISTS good;

CREATE TABLE good (
	id int(11) NOT NULL AUTO_INCREMENT,
	product varchar(200) DEFAULT NULL,
	price float,
	pwc int,
	details varchar(300),
	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

truncate table good;

INSERT INTO good(product,price,pwc,details) VALUES ( '储值卡', 30 ,  100 , '' );
INSERT INTO good(product,price,pwc,details) VALUES ( '电子狗', 500 , 100 , '' );
INSERT INTO good(product,price,pwc,details) VALUES ( '家乐福会员卡', 100 ,  300 , '' );
INSERT INTO good(product,price,pwc,details) VALUES ( '充电器', 60 , 180 , '' );


DROP TABLE IF EXISTS orders;

CREATE TABLE orders (
	id int(11) NOT NULL AUTO_INCREMENT,
	orderNo varchar(100) DEFAULT NULL,
	buyTime datetime ,
	goodName varchar(200) ,
	userId varchar(100),
	detail varchar(200) ,
	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


2，接口说明
http://192.168.210.59:8089/pointwallet/good/buy/123 

{
 product: "prod1",
price: 200,
pwcNum:100
}




