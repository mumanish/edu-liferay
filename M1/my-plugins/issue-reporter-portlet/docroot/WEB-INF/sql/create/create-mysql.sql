drop database if exists lportal;
create database lportal character set utf8;
use lportal;



create index IX_51DE3887 on Reporter_Issue (companyId);
create index IX_F5F1983B on Reporter_Issue (userId);


