create table Reporter_Issue (
	issueId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
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
	statusByUserId bigint,
	statusByUserName varchar(75),
	statusDate timestamp
);
