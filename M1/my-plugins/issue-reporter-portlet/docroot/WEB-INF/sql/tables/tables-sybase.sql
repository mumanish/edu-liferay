create table Reporter_Issue (
	issueId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	summary varchar(75) null,
	requester varchar(75) null,
	priority varchar(75) null,
	description varchar(75) null,
	assignee varchar(75) null,
	statusx varchar(75) null,
	status int,
	statusByUserId decimal(20,0),
	statusByUserName varchar(75) null,
	statusDate datetime null
)
go
