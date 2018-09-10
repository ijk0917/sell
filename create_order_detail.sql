create table order_detail(
	detail_id varchar(32) not null,
	order_id varchar(32) not null,
	product_id varchar(32) not null,
	product_name varchar(64) not null COMMENT '商品名称',
	product_price DECIMAL(8,2) not null COMMENT'商品价格',
	product_quantity int not null COMMENT '商品数量',
	product_icon varchar(512) COMMENT'商品小图',
	create_time timestamp NOT null default CURRENT_TIMESTAMP  comment '创建时间',
	update_time timestamp NOT null default CURRENT_TIMESTAMP  on update CURRENT_TIMESTAMP  comment '修改时间',
	primary key (detail_id),
	key idx_order_id (order_id)
)comment '订单详情表'