CREATE TABLE societydb.public.society_address_details (
	society_address_id int4 NOT NULL,
	society_id int8 NOT NULL,
	society_area varchar(50),
	society_road varchar(50),
	society_landmark varchar(50),
	society_nearest_station varchar(50),
	society_zip varchar(6) NOT NULL,
	PRIMARY KEY (society_address_id)
);
ALTER TABLE societydb.public.society_address_details
	ADD FOREIGN KEY (society_id) 
	REFERENCES society_primary_details (society_id);


