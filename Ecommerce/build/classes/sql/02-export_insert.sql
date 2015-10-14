-- REM INSERTING into CATEGORIAS
Insert into CATEGORIA (ID,CAT_NOME) values (1,'Vestuário');
Insert into CATEGORIA (ID,CAT_NOME) values (2,'Informática');
Insert into CATEGORIA (ID,CAT_NOME) values (3,'Bebidas');
Insert into CATEGORIA (ID,CAT_NOME) values (21,'Alimentos');

---------------------------------------------------
--   DATA FOR TABLE PRODUTOS
--   FILTER = none used
---------------------------------------------------
-- REM INSERTING into PRODUTOS
Insert into PRODUTO (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (28,'Bohemia',3,4,'5','10','bohemia.jpg',15);
Insert into PRODUTO (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (1,'Camisa Polo',1,101,'5','10','eclipse13102006021049.jpg',5,5);
Insert into PRODUTO (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (2,'Wisky Johny Walker',3,40,'5','10','d_netbeans6_p.jpg',0);
Insert into PRODUTO (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (3,'Netbook Acer',2,990,'5','10','ImpressoraR290Epson.jpg',5);
Insert into PRODUTO (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (4,'Rum',3,30,'5','10','livroNetBeans.jpg',null);
Insert into PRODUTO (ID,PROD_NOME,CAT_ID,PRECO,DESC_PEQ,DESC_GD,IMAGEM,DESCONTO) values (5,'Apple Macbook',2,3500,'5','10','Core2Duo.jpg',5);


