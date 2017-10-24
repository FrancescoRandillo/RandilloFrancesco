#delete the database phone if exist
drop database if exists Phone;
#create a database phone
create database if not exists Phone
	default character set latin1
    default collate latin1_general_ci;
#set this database as current
use Phone;
#alter the database phone changing the charset
alter database Phone
	default character set utf8
    default collate utf8_unicode_ci;
#create table country,if it already exists, delete it first
drop table if exists country;

create table if not exists country(
	code  varchar(2) not null,
    name varchar(32) not null,
    primary key (code)
);    
#create a table brand, if it already exists, delete it first
drop table if exists brand;

create table if not exists brand(
	id int(11) not null auto_increment,
    name varchar(32) not null,
    country varchar(2) not null,
    primary key(id),
    foreign key(country) references country(code)
);

#create table opsys, if it already exists, delete it first
drop table if exists opsys;

create table if not exists opsys(
	id int(11) not null auto_increment,
    description varchar(64) not null,
    company varchar(64) not null,
    openSource tinyint(1) not null,
    primary key (id)
);
#create table smartphone, if it already exists, delete it first
drop table if exists smartphone;

create table if not exists smartphone(
	id int(11) not null auto_increment,
    name varchar(64) not null,
    ram varchar(5) not null,
    cpu varchar (64) not null,
    displayPpi int (11) not null,
    displaySize varchar(12) not null,
    displayResolution varchar(64) not null,
    size varchar(64) not null,
    weight int(4) not null,
    notes varchar(1024) not null,
    brand int(11) not null,
    opSys int(11) not null,
    primary key(id),
    foreign key(brand) references brand(id),
    foreign key(opSys) references opsys(id)
);
