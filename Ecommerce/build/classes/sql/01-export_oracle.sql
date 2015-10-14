--------------------------------------------------------
--  File created - Sábado-Dezembro-12-2009   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence ADMIN_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ADMIN_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence CATEGORIAS_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "CATEGORIAS_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PEDIDOS_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PEDIDOS_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PRODUTOS_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PRODUTOS_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence USUARIOS_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "USUARIOS_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table ADMIN
--------------------------------------------------------

  CREATE TABLE "ADMIN" 
   (	"ID" NUMBER(*,0), 
	"USUARIO" VARCHAR2(20), 
	"SENHA" VARCHAR2(20)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CATEGORIAS
--------------------------------------------------------

  CREATE TABLE "CATEGORIAS" 
   (	"ID" NUMBER(*,0), 
	"CAT_NOME" VARCHAR2(30)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table END_ENTREGA
--------------------------------------------------------

  CREATE TABLE "END_ENTREGA" 
   (	"USUARIO_ID" NUMBER(*,0), 
	"ENDERECO" VARCHAR2(200), 
	"BAIRRO" VARCHAR2(50), 
	"CIDADE" VARCHAR2(50), 
	"ESTADO" VARCHAR2(2), 
	"CEP" VARCHAR2(9), 
	"ID" NUMBER
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ITENS_PEDIDO
--------------------------------------------------------

  CREATE TABLE "ITENS_PEDIDO" 
   (	"PED_ID" NUMBER(*,0), 
	"PROD_ID" NUMBER(*,0), 
	"QTD" NUMBER(*,0), 
	"PRECO" NUMBER(10,2), 
	"SUBTOTAL" FLOAT(126)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PEDIDOS
--------------------------------------------------------

  CREATE TABLE "PEDIDOS" 
   (	"ID" NUMBER(*,0), 
	"USUARIO_ID" NUMBER(*,0), 
	"CC_NOME" VARCHAR2(50), 
	"CC_TIPO" NUMBER(*,0), 
	"CC_NUMERO" VARCHAR2(20), 
	"CC_M_EXP" NUMBER(*,0), 
	"CC_A_EXP" NUMBER(*,0), 
	"DATA_PED" TIMESTAMP (6)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUTOS
--------------------------------------------------------

  CREATE TABLE "PRODUTOS" 
   (	"ID" NUMBER(*,0), 
	"PROD_NOME" VARCHAR2(40), 
	"CAT_ID" NUMBER(*,0), 
	"PRECO" NUMBER(*,0), 
	"DESC_PEQ" VARCHAR2(400), 
	"DESC_GD" VARCHAR2(400), 
	"IMAGEM" VARCHAR2(100), 
	"DESCONTO" FLOAT(126)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USUARIOS
--------------------------------------------------------

  CREATE TABLE "USUARIOS" 
   (	"ID" NUMBER(*,0), 
	"NOME" VARCHAR2(50), 
	"EMAIL" VARCHAR2(100), 
	"SENHA" VARCHAR2(20), 
	"ENDERECO" VARCHAR2(200), 
	"BAIRRO" VARCHAR2(50), 
	"CIDADE" VARCHAR2(50), 
	"ESTADO" VARCHAR2(2), 
	"CEP" VARCHAR2(9), 
	"END_ENTREGA" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;

---------------------------------------------------
--   DATA FOR TABLE CATEGORIAS
--   FILTER = none used
---------------------------------------------------
REM INSERTING into CATEGORIAS
Insert into CATEGORIAS (ID,CAT_NOME) values (1,'Vestuário');
Insert into CATEGORIAS (ID,CAT_NOME) values (2,'Informática');
Insert into CATEGORIAS (ID,CAT_NOME) values (3,'Bebidas');

---------------------------------------------------
--   END DATA FOR TABLE CATEGORIAS
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE PEDIDOS
--   FILTER = none used
---------------------------------------------------
REM INSERTING into PEDIDOS

---------------------------------------------------
--   END DATA FOR TABLE PEDIDOS
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE ITENS_PEDIDO
--   FILTER = none used
---------------------------------------------------
REM INSERTING into ITENS_PEDIDO

---------------------------------------------------
--   END DATA FOR TABLE ITENS_PEDIDO
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE ADMIN
--   FILTER = none used
---------------------------------------------------
REM INSERTING into ADMIN

---------------------------------------------------
--   END DATA FOR TABLE ADMIN
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE USUARIOS
--   FILTER = none used
---------------------------------------------------
REM INSERTING into USUARIOS

---------------------------------------------------
--   END DATA FOR TABLE USUARIOS
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE END_ENTREGA
--   FILTER = none used
---------------------------------------------------
REM INSERTING into END_ENTREGA

---------------------------------------------------
--   END DATA FOR TABLE END_ENTREGA
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE PRODUTOS
--   FILTER = none used
---------------------------------------------------
REM INSERTING into PRODUTOS
Insert into PRODUTOS (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (28,'Bohemia',3,4,'Cerveja Bohemia','Descrição Grande','bohemia.jpg',50);
Insert into PRODUTOS (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (1,'Camisa Polo',1,100,'Camisa Polo','Camisa Polo Grande','eclipse13102006021049.jpg',null);
Insert into PRODUTOS (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (2,'Johny Walker',3,40,'Johny Walker','Wisky Grande','d_netbeans6_p.jpg',null);
Insert into PRODUTOS (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (3,'Netbook Acer',2,990,'Netbook','Netbook Acer','ImpressoraR290Epson.jpg',5);
Insert into PRODUTOS (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (4,'Rum',3,30,'Rum','Garrafa Rum','livroNetBeans.jpg',null);
Insert into PRODUTOS (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (5,'Apple Macbook',2,3500,'Apple','Macbook','Core2Duo.jpg',5);

---------------------------------------------------
--   END DATA FOR TABLE PRODUTOS
---------------------------------------------------
--------------------------------------------------------
--  Constraints for Table ADMIN
--------------------------------------------------------

  ALTER TABLE "ADMIN" ADD CONSTRAINT "ADMIN_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ADMIN" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CATEGORIAS
--------------------------------------------------------

  ALTER TABLE "CATEGORIAS" ADD CONSTRAINT "CATEGORIAS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "CATEGORIAS" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table END_ENTREGA
--------------------------------------------------------

  ALTER TABLE "END_ENTREGA" ADD CONSTRAINT "END_ENTREGA_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "END_ENTREGA" MODIFY ("ID" NOT NULL ENABLE);

--------------------------------------------------------
--  Constraints for Table PEDIDOS
--------------------------------------------------------

  ALTER TABLE "PEDIDOS" ADD CONSTRAINT "PEDIDOS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "PEDIDOS" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PRODUTOS
--------------------------------------------------------

  ALTER TABLE "PRODUTOS" ADD CONSTRAINT "PRODUTOS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "PRODUTOS" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table USUARIOS
--------------------------------------------------------

  ALTER TABLE "USUARIOS" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIOS" ADD CONSTRAINT "USUARIOS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  DDL for Index ADMIN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ADMIN_PK" ON "ADMIN" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CATEGORIAS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "CATEGORIAS_PK" ON "CATEGORIAS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index END_ENTREGA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "END_ENTREGA_PK" ON "END_ENTREGA" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PEDIDOS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PEDIDOS_PK" ON "PEDIDOS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PRODUTOS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PRODUTOS_PK" ON "PRODUTOS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index USUARIOS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "USUARIOS_PK" ON "USUARIOS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;


--------------------------------------------------------
--  Ref Constraints for Table END_ENTREGA
--------------------------------------------------------

  ALTER TABLE "END_ENTREGA" ADD CONSTRAINT "FK_USUARIO" FOREIGN KEY ("USUARIO_ID")
	  REFERENCES "USUARIOS" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ITENS_PEDIDO
--------------------------------------------------------

  ALTER TABLE "ITENS_PEDIDO" ADD CONSTRAINT "FK_PEDIDO" FOREIGN KEY ("PED_ID")
	  REFERENCES "PEDIDOS" ("ID") ENABLE;
 
  ALTER TABLE "ITENS_PEDIDO" ADD CONSTRAINT "FK_PRODUTO" FOREIGN KEY ("PROD_ID")
	  REFERENCES "PRODUTOS" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PEDIDOS
--------------------------------------------------------

  ALTER TABLE "PEDIDOS" ADD CONSTRAINT "FK_USUARIOS" FOREIGN KEY ("USUARIO_ID")
	  REFERENCES "USUARIOS" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PRODUTOS
--------------------------------------------------------

  ALTER TABLE "PRODUTOS" ADD CONSTRAINT "FK_CATEGORIAS" FOREIGN KEY ("CAT_ID")
	  REFERENCES "CATEGORIAS" ("ID") ENABLE;

--------------------------------------------------------
--  DDL for Trigger ADMIN_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ADMIN_TRG" 
 BEFORE INSERT ON ADMIN 
FOR EACH ROW 
BEGIN
  SELECT ADMIN_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "ADMIN_TRG" DISABLE;
--------------------------------------------------------
--  DDL for Trigger CATEGORIAS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "CATEGORIAS_TRG" 
 BEFORE INSERT ON CATEGORIAS 
FOR EACH ROW 
BEGIN
  SELECT CATEGORIAS_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "CATEGORIAS_TRG" DISABLE;
--------------------------------------------------------
--  DDL for Trigger PEDIDOS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PEDIDOS_TRG" 
 BEFORE INSERT ON PEDIDOS 
FOR EACH ROW 
BEGIN
  SELECT PEDIDOS_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "PEDIDOS_TRG" DISABLE;
--------------------------------------------------------
--  DDL for Trigger PRODUTOS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PRODUTOS_TRG" 
 BEFORE INSERT ON PRODUTOS 
FOR EACH ROW 
BEGIN
  SELECT PRODUTOS_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "PRODUTOS_TRG" DISABLE;
--------------------------------------------------------
--  DDL for Trigger USUARIOS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "USUARIOS_TRG" 
 BEFORE INSERT ON USUARIOS 
FOR EACH ROW 
BEGIN
  SELECT USUARIOS_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "USUARIOS_TRG" DISABLE;
