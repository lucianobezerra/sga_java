drop table usuarios;
create table usuarios(
  id int(11) not null  AUTO_INCREMENT,
  login varchar(255) not null,
  senha varchar(255) not null,
  nome varchar(255) not null,
  email varchar(255) not null,
  nivel int(1) not null default 1,
  ativo boolean not null default true,
  user_id int(11) not null,
  created_at timestamp default CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

alter table usuarios add unique (login);