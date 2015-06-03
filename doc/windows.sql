drop table windows;
CREATE TABLE windows (
  id int(11) NOT NULL AUTO_INCREMENT,
  description varchar(255) NOT NULL,
  user_id int(11) NOT NULL,
  created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY description (description),
  KEY fk_window_user_idx (user_id),
  CONSTRAINT fk_window_user FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
