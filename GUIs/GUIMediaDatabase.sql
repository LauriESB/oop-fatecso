create table tb_aluno(
 ra number(6),
 nome varchar2(80),
 notaP1 number(6,2),
 notaP2 number(6,2)
); 

alter table tb_aluno add constraint PK_Aluno_RA PRIMARY KEY(ra);