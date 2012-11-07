create index IX_A33D93A1 on Tessa_Tessa (companyId);
create index IX_64A88E63 on Tessa_Tessa (groupId);
create index IX_7F6AEB26 on Tessa_Tessa (tessaText);
create index IX_5C445DAD on Tessa_Tessa (uuid_);
create unique index IX_967B299D on Tessa_Tessa (uuid_, groupId);