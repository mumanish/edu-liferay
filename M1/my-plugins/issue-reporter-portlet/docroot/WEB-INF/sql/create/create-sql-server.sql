drop database lportal;
create database lportal;

go

use lportal;



create index IX_51DE3887 on Reporter_Issue (companyId);
create index IX_F5F1983B on Reporter_Issue (userId);


