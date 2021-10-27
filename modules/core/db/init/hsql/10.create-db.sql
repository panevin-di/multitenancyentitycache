-- begin MULTITENANCYENTITYCACHE_TEST_CHILD
create table MULTITENANCYENTITYCACHE_TEST_CHILD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    TENANT_ID varchar(255),
    --
    TEST varchar(255),
    --
    primary key (ID)
)^
-- end MULTITENANCYENTITYCACHE_TEST_CHILD
-- begin MULTITENANCYENTITYCACHE_TEST_PARENT
create table MULTITENANCYENTITYCACHE_TEST_PARENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    TENANT_ID varchar(255),
    --
    CHILD_ID varchar(36),
    CHILD2_ID varchar(36),
    --
    primary key (ID)
)^
-- end MULTITENANCYENTITYCACHE_TEST_PARENT
-- begin MULTITENANCYENTITYCACHE_TEST_CHILD2
create table MULTITENANCYENTITYCACHE_TEST_CHILD2 (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    TENANT_ID varchar(255),
    --
    TEST varchar(255),
    --
    primary key (ID)
)^
-- end MULTITENANCYENTITYCACHE_TEST_CHILD2
