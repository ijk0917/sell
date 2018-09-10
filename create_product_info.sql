CREATE TABLE product_info(
	product_id varchar(32) not null,
	product_name varchar(64) not null comment '商品名称',
	product_price DECIMAL(8,2) not null comment '单价',
	product_stock int(11) not null comment '库存',
	product_description VARCHAR(64) COMMENT '描述',
	product_icon varchar(512) COMMENT '小图',
	product_status tinyint(3) not null COMMENT '商品状态',
	category_type int(11) not null comment '类目编号',
	create_time timestamp NOT null default CURRENT_TIMESTAMP  comment '创建时间',
	update_time timestamp NOT null default CURRENT_TIMESTAMP  on update CURRENT_TIMESTAMP  comment '修改时间',
	primary key (product_id)
)comment '商品表';