create table Reporter_Issue (
	issueId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	summary VARCHAR(75) null,
	requester VARCHAR(75) null,
	priority VARCHAR(75) null,
	description VARCHAR(75) null,
	assignee VARCHAR(75) null,
	statusx VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);