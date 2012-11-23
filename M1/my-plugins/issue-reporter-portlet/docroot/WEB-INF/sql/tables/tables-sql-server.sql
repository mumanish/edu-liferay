create table Reporter_Issue (
	issueId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	summary nvarchar(75) null,
	requester nvarchar(75) null,
	priority nvarchar(75) null,
	description nvarchar(75) null,
	assignee nvarchar(75) null,
	statusx nvarchar(75) null,
	status int,
	statusByUserId bigint,
	statusByUserName nvarchar(75) null,
	statusDate datetime null
);
