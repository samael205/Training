# Select Database employees
use employees;

# Basic Select Example
select * from employees;

# Specific column select
select emp_no, first_name, last_name from employees;

# Arithmetic Operations on Columns
select emp_no, salary, salary*1.2 from salaries;

# Column alias
select emp_no AS 'Employee Number', salary AS 'Salary', salary*1.2 AS 'Revised Salary' from salaries;

# Concatenation
select emp_no AS 'Employee Number', CONCAT(first_name, ' ', last_name) AS 'Name' from employees;

# Distinct Values
select DISTINCT(last_name) AS 'Last Names' from employees;

# Describe table
describe employees;
