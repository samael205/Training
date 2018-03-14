# Select Database employees
use test;

# Create table ord
create table ord(
	ID INT, 
    quantity INT, 
    ord_date datetime default current_timestamp()
);

# See table structure
describe ord;

# Insert Values
insert into ord values(1, 2, SYSDATE());
insert into ord values(2, 1, SYSDATE());
insert into ord values(3, 3, SYSDATE());
insert into ord values(4, 2, SYSDATE());
# Check Insertion
select * from ord;

# Add column
alter table ord
add(
	customer_id INT
);

# See table structure
describe ord;

# Check Insertion
select * from ord;

# Modify column
alter table ord drop customer_id;

# See table structure
describe ord;

# Check Insertion
select * from ord;

# Clear tables
drop table ord;

# Check tables
show tables;