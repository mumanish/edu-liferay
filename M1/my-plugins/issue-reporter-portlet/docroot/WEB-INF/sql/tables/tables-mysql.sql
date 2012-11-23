create table Reporter_Issue (
	issueId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	summary varchar(75) null,
	requester varchar(75) null,
	priority varchar(75) null,
	description varchar(75) null,
	assignee varchar(75) null,
	statusx varchar(75) null,
	status integer,
	statusByUserId bigint,
	statusByUserName varchar(75) null,
	statusDate datetime null
) engine InnoDB;
