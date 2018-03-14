# Select Database employees
use test;

# Create table ord
create table ord(ID INT, quantity INT, ord_date datetime default current_timestamp());

# See table structure
describe ord;

# Delete the table
drop table ord;

# Create table with Primary Key Constraint
create table ord(
	ID INT, 
    quantity INT, 
    ord_date datetime default current_timestamp(),
	CONSTRAINT id_pk PRIMARY KEY(ID)
);

# See table structure
describe ord;

# Drop the table
drop table ord;

# Create table with Unique Constraint
create table ord(
	ID INT, 
    quantity INT, 
    ord_date datetime default current_timestamp(),
	CONSTRAINT id_unique UNIQUE(ID)
);

# See table structure
describe ord;

# Create table with Foreign key Constraint
create table ord_data(
	ID INT, 
    mode VARCHAR(25) NOT NULL,
    status	VARCHAR(2),
    customer_id INT,
    ord_date datetime NOT NULL,
	CONSTRAINT id_fk FOREIGN KEY (ID) references ord(ID)
);

# See table structure
describe ord_data;

# Drop tables
drop table ord_data;
drop table ord;

# Create table using sub query
create table ord(
	ID INT, 
    quantity INT, 
    ord_date datetime default current_timestamp(),
	CONSTRAINT id_unique UNIQUE(ID)
);

# See table structure
describe ord;

# Insert some values
insert into ord(id, quantity) values(1, 2);
insert into ord(id, quantity) values(2, 1);
insert into ord(id, quantity) values(3, 3);
insert into ord(id, quantity) values(4, 2);

# Check addition
select * from ord;

# Create new table
create table ord_data 
as
	select id, quantity
    from ord
    where id < 3;
    
# Check creation
select * from ord_data;

# Drop tables
drop table ord_data;
drop table ord;
