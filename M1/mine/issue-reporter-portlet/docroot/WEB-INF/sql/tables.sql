create table IR_IRIssue (
	issueId LONG not null primary key,
	summary VARCHAR(75) null,
	requester VARCHAR(75) null,
	priority VARCHAR(75) null
);