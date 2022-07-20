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

create table ES_Electronics (
	mvccVersion LONG default 0 not null,
	electronicsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	electronicsName VARCHAR(75) null,
	electronicsPrice LONG,
	electronicsCount INTEGER,
	electronicsInStock BOOLEAN,
	electronicsArchive BOOLEAN,
	electronicsDescription VARCHAR(75) null,
	electroTypeId LONG
);

create table ES_PositionType (
	mvccVersion LONG default 0 not null,
	uuid_ VARCHAR(75) null,
	positionTypeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	positionTypeName VARCHAR(100) null
);

create table ES_PurchaseType (
	mvccVersion LONG default 0 not null,
	uuid_ VARCHAR(75) null,
	purchaseTypeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	purchaseTypeName VARCHAR(100) null
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