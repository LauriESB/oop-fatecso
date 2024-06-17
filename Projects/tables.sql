create table tb_cliente (
    cpf number(14) PRIMARY KEY,
    nome varchar2(40),
    endereco varchar2(50),
    cidade varchar2(20),
    uf char(2),
    telefone varchar2(15),
    cep varchar2(10),
    limiteCredito number(6,2),
    limiteDisponivel number(6,2)
);

create table tb_pedido (
    cpf number(14) PRIMARY KEY,
    nome varchar2(40),
    endereco varchar2(50),
    cidade varchar2(20),
    uf char(2),
    telefone varchar2(15),
    cep varchar2(10),
    limiteCredito number(6,2),
    limiteDisponivel number(6,2)
);



