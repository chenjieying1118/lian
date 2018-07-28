-- auto Generated on 2018-07-27 19:28:09 
-- DROP TABLE IF EXISTS company_apply_record; 
CREATE TABLE company_apply_record(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	company_identification VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'companyIdentification',
	person_identification VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'personIdentification',
	msg_type INT (11) NOT NULL DEFAULT -1 COMMENT 'msgType',
	apply_date DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'applyDate',
	status INT (11) NOT NULL DEFAULT -1 COMMENT 'status',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'company_apply_record';
