drop table janelas;
create table janelas(
  id int(11) not null  AUTO_INCREMENT,
  window  varchar(255) not null, 
  PRIMARY KEY (id)
);

alter table janelas add unique (window);