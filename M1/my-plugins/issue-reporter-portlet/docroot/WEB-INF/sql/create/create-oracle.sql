drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
connect &1/&2;
set define off;



create index IX_51DE3887 on Reporter_Issue (companyId);
create index IX_F5F1983B on Reporter_Issue (userId);



quit