CREATE TABLE societydb.public.society_bank_details (
	society_bank_id int4 NOT NULL,
	society_id int8 NOT NULL,
	bank_branch varchar(25),
	bank_account_number varchar(25),
	PRIMARY KEY (society_bank_id)
);
ALTER TABLE societydb.public.society_bank_details
	ADD FOREIGN KEY (society_id) 
	REFERENCES society_primary_details (society_id);


