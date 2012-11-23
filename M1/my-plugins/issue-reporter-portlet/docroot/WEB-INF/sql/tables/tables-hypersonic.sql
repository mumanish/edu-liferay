create table Reporter_Issue (
	issueId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	summary varchar(75) null,
	requester varchar(75) null,
	priority varchar(75) null,
	description varchar(75) null,
	assignee varchar(75) null,
	statusx varchar(75) null,
	status int,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate timestamp null
);
