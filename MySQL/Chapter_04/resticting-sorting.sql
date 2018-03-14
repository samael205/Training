# Select Database employees
use employees;

# Basic where clause
select * from employees where hire_date >= '2000-01-01';

# Where clause compare string
select * from employees where last_name = 'Denis';

# Where clause with BETWEEN AND
select * from employees where emp_no BETWEEN 10050 AND 10100;

# Where clause with IN
select * from employees where emp_no IN(10001, 10002, 10003);

# Where clause with LIKE Example 1
select * from employees where last_name LIKE 'De%';

# Where clause with LIKE Example 2
select distinct(last_name) from employees where last_name LIKE 'D____';

# Using AND
select * from employees where birth_date >= '1960-01-01' AND birth_date <= '1960-12-31' AND gender = 'F';

# Using OR
select * from employees where emp_no = 10050 OR emp_no = 10060;

# Using NOT
select * from departments where dept_name NOT IN ('Development', 'Marketing', 'Finance', 'Production');

# Using ORDER BY
select * from employees where last_name = 'Denis' ORDER BY birth_date;

# Using ORDER BY in Descending Order
select * from employees where last_name = 'Denis' ORDER BY birth_date DESC;

# Using ORDER BY in Descending Order Using column number
select * from employees where last_name = 'Denis' ORDER BY 2 DESC;

# Using ORDER BY with multiple columns
select * from employees order by first_name, last_name;

# Prompt for value
select * from employees where last_name = &last_name;
