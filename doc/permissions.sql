drop table permissions;
CREATE TABLE permissions (
  id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) NOT NULL,
  user_access_id int(11) NOT NULL,
  window_id int(11) NOT NULL,
  created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY user_id (user_id,window_id),
  KEY fk_permission_window_idx (window_id),
  CONSTRAINT fk_permission_user FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_permission_window FOREIGN KEY (window_id) REFERENCES windows (id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;