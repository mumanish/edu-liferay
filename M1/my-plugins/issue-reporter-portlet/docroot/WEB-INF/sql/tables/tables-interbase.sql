create table Reporter_Issue (
	issueId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	summary varchar(75),
	requester varchar(75),
	priority varchar(75),
	description varchar(75),
	assignee varchar(75),
	statusx varchar(75),
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);
