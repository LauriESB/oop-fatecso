create table tb_department (
  abrev varchar2(10),
  name varchar2(40)
);

create table tb_project (
  id number(10),
  description varchar2(30),
  beginDate varchar2(10),
  finishDate varchar2(10)
);


-- Primary Keys definition

alter table tb_department add constraint PK_DepartmentAbrev PRIMARY KEY(abrev);
alter table tb_project add constraint PK_ProjectID PRIMARY KEY(id);
