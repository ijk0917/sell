create table order_master(
	order_id varchar(32)not null,
	buyer_name varchar(32)not null COMMENT '买家名字',
	buyer_phone varchar(32)not null COMMENT '买家电话',
	buyer_address varchar(128) not null COMMENT '买家地址',
	buyer_openid varchar(64) not null COMMENT '买家微信openid',
	order_amount decimal(8,2) not null comment '订单总金额',
	order_status tinyint(3) not null default '0' comment '订单状态，默认0新下单',
	pay_status tinyint(3) not null default '0' COMMENT '支付状态，默认0未支付',
	create_time timestamp NOT null default CURRENT_TIMESTAMP  comment '创建时间',
	update_time timestamp NOT null default CURRENT_TIMESTAMP  on update CURRENT_TIMESTAMP  comment '修改时间',
	primary key (order_id),
	key idx_buyer_openid (buyer_openid)
)