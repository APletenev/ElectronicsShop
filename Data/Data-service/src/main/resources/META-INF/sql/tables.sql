create table ES_ElectroType (
	mvccVersion LONG default 0 not null,
	uuid_ VARCHAR(75) null,
	electroTypeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	electroTypeName VARCHAR(100) null
);

create table ES_PositionType (
	mvccVersion LONG default 0 not null,
	uuid_ VARCHAR(75) null,
	positionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	positionName VARCHAR(100) null
);

create table ElectroType1 (
	mvccVersion LONG default 0 not null,
	uuid_ VARCHAR(75) null,
	electroTypeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	electroTypeName VARCHAR(100) null
);