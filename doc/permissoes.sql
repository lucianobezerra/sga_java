drop table permissoes;
create table permissoes(
  id int(11) not null  AUTO_INCREMENT,
  user_id int not null,
  window  varchar(255) not null, 
  PRIMARY KEY (id)
);

alter table permissoes add unique (user_id, window);