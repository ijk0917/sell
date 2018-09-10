create table product_category(
	category_id int not null auto_increment,
	category_name varchar(64) not null comment '类目名字',
	category_type int not null comment '类目编号',
	create_time timestamp NOT null default CURRENT_TIMESTAMP  comment '创建时间',
	update_time timestamp NOT null default CURRENT_TIMESTAMP  on update CURRENT_TIMESTAMP  comment '修改时间',
	primary key (category_id),
  unique key uqe_category_type (category_type)
)comment '类目标';