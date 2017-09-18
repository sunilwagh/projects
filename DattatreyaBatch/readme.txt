http://websystique.com/springbatch/spring-batch-multiresourceitemreader-hibernateitemwriter-example/

 CREATE TABLE KUNDALI (
    id int not null,
    name varchar(255) not null,
    dob DATE NOT NULL,
    degrees number not null
);

ALTER TABLE KUNDALI
  ADD (
    CONSTRAINT books_pk PRIMARY KEY (id)
  );