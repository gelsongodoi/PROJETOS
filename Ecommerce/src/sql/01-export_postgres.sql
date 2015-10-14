
CREATE TABLE admin (
    id integer NOT NULL,
    senha character varying(20),
    usuario character varying(20)
);

CREATE TABLE categoria (
    id integer NOT NULL,
    cat_nome character varying(30)
);

CREATE SEQUENCE eco_categoria_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


SELECT pg_catalog.setval('eco_categoria_seq', 1, false);


CREATE TABLE end_entrega (
    id integer NOT NULL,
    bairro character varying(50),
    cep character varying(9),
    cidade character varying(50),
    endereco character varying(200),
    estado character varying(2),
    usuario_id character varying(255)
);


CREATE TABLE itens_pedido (
    ped_id integer NOT NULL,
    prod_id integer NOT NULL,
    preco numeric(10,0),
    qtd numeric(22,0),
    subtotal double precision
);


CREATE TABLE pedido (
    id integer NOT NULL,
    cc_a_exp numeric(22,0),
    cc_m_exp numeric(22,0),
    cc_nome character varying(50),
    cc_numero character varying(20),
    cc_tipo numeric(22,0),
    data_ped timestamp without time zone,
    usuario_id character varying(255)
);


CREATE TABLE produto (
    id integer NOT NULL,
    desc_gd character varying(400),
    desc_peq character varying(400),
    desconto double precision,
    imagem character varying(100),
    preco numeric(22,0),
    prod_nome character varying(40),
    cat_id integer
);


CREATE TABLE usuario (
    id character varying(255) NOT NULL,
    bairro character varying(50),
    cep character varying(9),
    cidade character varying(50),
    email character varying(100),
    endereco character varying(200),
    estado character varying(2),
    nome character varying(50),
    senha character varying(20)
);

ALTER TABLE ONLY admin
    ADD CONSTRAINT admin_pkey PRIMARY KEY (id);

ALTER TABLE ONLY categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id);

ALTER TABLE ONLY end_entrega
    ADD CONSTRAINT end_entrega_pkey PRIMARY KEY (id);

ALTER TABLE ONLY itens_pedido
    ADD CONSTRAINT itens_pedido_pkey PRIMARY KEY (ped_id, prod_id);

ALTER TABLE ONLY pedido
    ADD CONSTRAINT pedido_pkey PRIMARY KEY (id);

ALTER TABLE ONLY produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (id);

ALTER TABLE ONLY usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id);

ALTER TABLE ONLY produto
    ADD CONSTRAINT fk18595ad9f7a92c36 FOREIGN KEY (cat_id) REFERENCES categoria(id);

ALTER TABLE ONLY end_entrega
    ADD CONSTRAINT fk4aafca145c799799 FOREIGN KEY (usuario_id) REFERENCES usuario(id);

ALTER TABLE ONLY pedido
    ADD CONSTRAINT fk8c700b455c799799 FOREIGN KEY (usuario_id) REFERENCES usuario(id);

ALTER TABLE ONLY itens_pedido
    ADD CONSTRAINT fked39b3c55f185d11 FOREIGN KEY (ped_id) REFERENCES pedido(id);

ALTER TABLE ONLY itens_pedido
    ADD CONSTRAINT fked39b3c5b187669b FOREIGN KEY (prod_id) REFERENCES produto(id);

