create table tb_cliente (
    cpf varchar2(15) PRIMARY KEY,
    nome varchar2(40),
    endereco varchar2(60),
    cidade varchar2(50),
    uf char(2),
    ddd varchar2(4),
    telefone varchar2(15),
    cep varchar2(10),
    limiteCredito number(10,2) not null,
    limiteDisponivel number(10,2) not null
);

create table tb_vendedor (
    cpf varchar2(15) PRIMARY KEY,
    nome varchar2(40),
    endereco varchar2(60),
    cidade varchar2(50),
    uf char(2),
    ddd varchar2(4),
    telefone varchar2(15),
    cep varchar2(10),
    salarioBase number(10,2),
    taxaComissao number(10,2)
);

create table tb_pedido (
    numeroPedido varchar2(14) PRIMARY KEY,
    dataEmissao varchar2(16),
    valorPedido number(10,2),
    cpfCliente varchar2(15),
    cpfVendedor varchar2(15)
);

-- Criação de chaves estrangeiras da tabela pedido dando nome às constraints

alter table tb_pedido add constraint FK_CPF_Cliente FOREIGN KEY(cpfCliente) references tb_cliente(cpf);
alter table tb_pedido add constraint FK_CPF_Vendedor FOREIGN KEY(cpfVendedor) references tb_vendedor(cpf);