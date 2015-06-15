drop table competencias;
CREATE TABLE competencias (
  id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) NOT NULL,
  mes int(11) NOT NULL,
  ano int(11) NOT NULL,
  ativo boolean not null default true,
  created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY UNIQUE_KEY_MES_ANO (mes,ano),
  KEY fk_competencias_user (user_id),
  CONSTRAINT fk_competencias_user FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
