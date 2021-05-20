--------------------------------------------------------
--  ������ ������ - �����-5��-20-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------

  CREATE TABLE "USER_LOGIN"."MEMBER" 
   (	"ID" VARCHAR2(20 BYTE), 
	"PWD" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOGIN_TABLESPACE" ;
REM INSERTING into USER_LOGIN.MEMBER
SET DEFINE OFF;
Insert into USER_LOGIN.MEMBER (ID,PWD) values ('user1','user1');
Insert into USER_LOGIN.MEMBER (ID,PWD) values ('user2','user2');
Insert into USER_LOGIN.MEMBER (ID,PWD) values ('user3','user3');
Insert into USER_LOGIN.MEMBER (ID,PWD) values ('user4','user4');
--------------------------------------------------------
--  DDL for Index SYS_C009985
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER_LOGIN"."SYS_C009985" ON "USER_LOGIN"."MEMBER" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOGIN_TABLESPACE" ;
--------------------------------------------------------
--  DDL for Index SYS_C009985
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER_LOGIN"."SYS_C009985" ON "USER_LOGIN"."MEMBER" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOGIN_TABLESPACE" ;
--------------------------------------------------------
--  Constraints for Table MEMBER
--------------------------------------------------------

  ALTER TABLE "USER_LOGIN"."MEMBER" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "LOGIN_TABLESPACE"  ENABLE;