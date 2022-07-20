create index IX_381F494F on ES_ElectroType (groupId);
create index IX_EC0516EF on ES_ElectroType (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_70748D31 on ES_ElectroType (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_899B309E on ES_Electronics (groupId);

create index IX_D4A49B10 on ES_PositionType (groupId);
create index IX_FD492E4E on ES_PositionType (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3444F050 on ES_PositionType (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D5E0438 on ES_PurchaseType (groupId);
create index IX_CF8F9226 on ES_PurchaseType (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_26A28 on ES_PurchaseType (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_4F7CCF19 on ElectroType1 (groupId);
create index IX_B7007465 on ElectroType1 (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BA74D027 on ElectroType1 (uuid_[$COLUMN_LENGTH:75$], groupId);