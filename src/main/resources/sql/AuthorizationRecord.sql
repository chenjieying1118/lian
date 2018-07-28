-- auto Generated on 2018-07-27 18:45:32 
-- DROP TABLE IF EXISTS authorization_record; 
CREATE TABLE authorization_record(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	apply_id INT (11) NOT NULL DEFAULT -1 COMMENT 'applyId',
	result INT (11) NOT NULL DEFAULT -1 COMMENT 'result',
	solve_time DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'solveTime',
	person_identification INT (11) NOT NULL DEFAULT -1 COMMENT 'personIdentification',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'authorization_record';
