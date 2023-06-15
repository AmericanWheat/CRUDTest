CREATE SEQUENCE peo_idx_seq;

CREATE TABLE people (
	idx NUMBER PRIMARY KEY,
	name varchar2(100) NOT NULL,
	age NUMBER DEFAULT 0
);

SELECT * FROM people;

INSERT INTO people VALUES (peo_idx_seq.nextval,'한사람', 18);
INSERT INTO people VALUES (peo_idx_seq.nextval,'두사람', 22);
INSERT INTO people VALUES (peo_idx_seq.nextval,'세사람', 15);
INSERT INTO people VALUES (peo_idx_seq.nextval,'네사람', 27);
INSERT INTO people VALUES (peo_idx_seq.nextval,'오사람', 31);
INSERT INTO people VALUES (peo_idx_seq.nextval,'육사람', 33);