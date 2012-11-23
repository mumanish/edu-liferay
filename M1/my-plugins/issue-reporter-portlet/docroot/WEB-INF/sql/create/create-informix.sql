database sysmaster;
drop database lportal;
create database lportal WITH LOG;

create procedure 'lportal'.isnull(test_string varchar)
returning boolean;
IF test_string IS NULL THEN
	RETURN 't';
ELSE
	RETURN 'f';
END IF
end procedure;




create index IX_51DE3887 on Reporter_Issue (companyId);
create index IX_F5F1983B on Reporter_Issue (userId);


