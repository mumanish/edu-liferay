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
	description TEXT null,
	assignee VARCHAR(75) null,
	status VARCHAR(75) null
);