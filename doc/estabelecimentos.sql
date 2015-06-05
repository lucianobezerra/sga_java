drop table estabelecimentos;
CREATE TABLE estabelecimentos (
  id int(11) NOT NULL,
  cnes char(7) NOT NULL,
  razao varchar(100) NOT NULL,
  fantasia varchar(100) NOT NULL,
  valormedio decimal(12,2) DEFAULT NULL,
  valorteto decimal(12,2) DEFAULT NULL,
  emiteaih tinyint(1) NOT NULL DEFAULT '0',
  emiteapac tinyint(1) NOT NULL DEFAULT '0',
  ativo tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (id),
  UNIQUE KEY ix_cnes (cnes)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
