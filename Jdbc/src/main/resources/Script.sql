CREATE SEQUENCE peo_idx_seq;

CREATE TABLE people (
	idx NUMBER PRIMARY KEY,
	name varchar2(100) NOT NULL,
	age NUMBER DEFAULT 0
);

SELECT * FROM people;

