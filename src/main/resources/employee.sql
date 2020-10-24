-- 创建员工表
CREATE TABLE IF NOT EXISTS `tbl_employee` (
   id INT(11) PRIMARY KEY auto_increment,
	last_name VARCHAR(255),
	gender char(1),
	email VARCHAR(255)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

-- 准备数据
insert into tbl_employee(last_name, gender, email) values('tom', 0, 'tom@gmail.com');