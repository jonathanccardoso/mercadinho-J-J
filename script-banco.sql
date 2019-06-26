create database mercado;

create table cliente(
    cpf varchar (50),
    nome varchar (50) NOT NULL, 
    endereco varchar (50),
    divida decimal (5,2) NOT NULL,
    CONSTRAINT pk_cliente PRIMARY KEY(cpf)
);
create table venda(
    id_venda serial,
    valor_total decimal (5,2) NOT NULL,
    data_venda Date NOT NULL,
    debito boolean not null,
    cpf_cliente varchar (50),
    CONSTRAINT pk_venda PRIMARY KEY(id_venda),
    CONSTRAINT fk_Cliente_cpf_cliente FOREIGN KEY (cpf_cliente) REFERENCES Cliente (cpf)
);

create table produto(
    lote serial,
    nome varchar (50) NOT NULL,
    quantidade Integer NOT NULL, 
    preco decimal (10,2) NOT NULL,
    CONSTRAINT pk_produto PRIMARY KEY (lote)
);

create table item_venda(
    quantidade Integer NOT NULL, 
    fk_Venda_id_venda integer,
    fk_Produto_lote_produto integer, 
    CONSTRAINT pk_Venda_venda PRIMARY KEY (fk_Venda_id_venda, fk_Produto_lote_produto),
    CONSTRAINT Venda_Produto_fk_Venda_id_venda FOREIGN KEY (fk_Venda_id_venda) REFERENCES Venda (id_venda),
    CONSTRAINT Venda_Produto_fk_Produto_lote_produto FOREIGN KEY (fk_Produto_lote_produto) REFERENCES produto(lote)
);

/*

insert into cliente values ('270293748', 'joao', 'endereco', 30.00);
insert into venda values (1, 20.00, '1998-09-29', False, 270293748);
insert into produto values (1, 'produto nome', 2, 02.00);
insert into produto values (22, 'produto nome2', 2, 03.00);
insert into item_venda values (5, 1, 1);
update item_venda set quantidade = 10 where item_venda.fk_Venda_id_venda = 1 and item_venda.fk_Produto_lote_produto = 1
-- delete from item_venda where item_venda.fk_Venda_id_venda = 1 and item_venda.fk_Produto_lote_produto = 1

*/