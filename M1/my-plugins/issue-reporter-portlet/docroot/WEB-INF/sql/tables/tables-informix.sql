create table Reporter_Issue (
	issueId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	summary varchar(75),
	requester varchar(75),
	priority varchar(75),
	description varchar(75),
	assignee varchar(75),
	statusx varchar(75),
	status int,
	statusByUserId int8,
	statusByUserName varchar(75),
	statusDate datetime YEAR TO FRACTION
)
extent size 16 next size 16
lock mode row;
