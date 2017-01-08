

create database manage default character set utf8 default collate utf8_general_ci;

create table t_menu (
  id int(11) unsigned not null auto_increment comment '主键',
  url_value varchar(500) not null default '' comment '菜单url',
  url_name varchar(50) not null default '' comment '菜单名称',
  create_time datetime not null comment '创建时间',
  update_time datetime not null comment '更新时间',
  primary key (id)
) engine=innodb auto_increment=4 default charset=utf8;

insert into t_menu (id, url_value, url_name, create_time, update_time)
values
	(1,'aaa','角色列表','2017-01-01 10:10:10','2017-01-01 10:10:10'),
	(2,'bbb','菜单列表','2017-01-01 10:10:10','2017-01-01 10:10:10'),
	(3,'ccc','用户列表','2017-01-01 10:10:10','2017-01-01 10:10:10');

s
create table t_role (
  id bigint(20) unsigned not null auto_increment comment '主键,自增长',
  role_name varchar(50) not null default '' comment '角色名称',
  create_time datetime not null comment '创建时间',
  update_time datetime not null comment '更新时间',
  primary key (id)
) engine=innodb auto_increment=3 default charset=utf8;


insert into t_role (id, role_name, create_time, update_time)
values
	(1,'管理员','2017-01-01 10:10:10','2017-01-01 10:10:10'),
	(2,'研发','2017-01-01 10:10:10','2017-01-01 10:10:10');


create table t_user (
  id bigint(20) unsigned not null auto_increment comment '主键',
  user_name varchar(50) not null default '' comment '角色名称',
  password varchar(100) not null default '' comment '密码',
  create_time datetime not null comment '创建时间',
  update_time datetime not null comment '更新时间',
  role_id bigint(20) not null comment '角色id',
  primary key (id)
) engine=innodb auto_increment=2 default charset=utf8;

insert into t_user (id, user_name, password, create_time, update_time, role_id)
values
	(1,'chl_smile','7c4a8d09ca3762af61e59520943dc26494f8941b','2017-01-01 10:10:10','2017-01-01 10:10:10',1);