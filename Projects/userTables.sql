create table tb_cliente (
    cpf varchar2(14) PRIMARY KEY,
    nome varchar2(40),
    endereco varchar2(50),
    cidade varchar2(20),
    uf char(2),
    ddd varchar2(4),
    telefone varchar2(15),
    cep varchar2(10),
    limiteCredito number(6,2) not null,
    limiteDisponivel number(6,2) not null
);

create table tb_vendedor (
    cpf number(14) PRIMARY KEY,
    nome varchar2(40),
    endereco varchar2(50),
    cidade varchar2(20),
    uf char(2),
    ddd varchar2(4),
    telefone varchar2(15),
    cep varchar2(10),
    salarioBase number(6,2),
    taxaComissao number(4,2)
);


