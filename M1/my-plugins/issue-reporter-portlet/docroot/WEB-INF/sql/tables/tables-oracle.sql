create table Reporter_Issue (
	issueId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName varchar2(300) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	summary varchar2(300) null,
	requester varchar2(300) null,
	priority varchar2(300) null,
	description varchar2(300) null,
	assignee varchar2(300) null,
	statusx varchar2(300) null,
	status number(30,0),
	statusByUserId number(30,0),
	statusByUserName varchar2(300) null,
	statusDate timestamp null
);
