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
# Check Insertion
select * from ord;

# Using default values
insert into ord(id, quantity) values(2, 3);
# Check Insertion
select * from ord;

# Insert specific columns
insert into ord(id) values (3);
# Check Insertion
select * from ord;

# Insert with select output
insert into ord(id, quantity) select id+3, quantity from ord where id = 1;
# Check Insertion
select * from ord;

# Update row
update ord
set quantity = 1
where id = 3;
# Check Insertion
select * from ord;

# Test Rollback
# Create a savepoint
start transaction;

# Delete rows
delete from ord where id = 2;
# Check Deletion
select * from ord;

# Rollback
rollback;
# Check Rollback
select * from ord;

# Test Commit
# Create a savepoint
start transaction;

# Delete rows
delete from ord where id = 2;
# Check Deletion
select * from ord;

# Rollback
commit;
# Check Rollback
select * from ord;

# Drop tables
drop table ord_data;
drop table ord;

# Check deletion
show tables;
