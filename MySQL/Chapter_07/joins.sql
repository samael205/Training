# Select Database employees
use employees;

# NATURAL JOIN
select emp_no, CONCAT(first_name, ' ', last_name) AS 'Name', dept_no from employees NATURAL JOIN dept_emp;

# JOIN
select emp_no, CONCAT(first_name, ' ', last_name) AS 'Name', dept_no from employees JOIN dept_emp USING(emp_no);

# Table Alias
select e.emp_no, CONCAT(e.first_name, ' ', e.last_name) AS 'Name', d.dept_no from employees e JOIN dept_emp d USING(emp_no);

# ON Clause
select e.emp_no, CONCAT(e.first_name, ' ', e.last_name) AS 'Name', d.dept_no from employees e JOIN dept_emp d ON (e.emp_no = d.emp_no);

select * from departments;

# Three Way Joins
select e.emp_no, CONCAT(e.first_name, ' ', e.last_name) AS 'Name', d.dept_name from employees e JOIN dept_emp de ON (e.emp_no = de.emp_no) JOIN departments d ON (de.dept_no = d.dept_no);

# And clause
select e.emp_no, CONCAT(e.first_name, ' ', e.last_name) AS 'Name', d.dept_name from employees e JOIN dept_emp de ON (e.emp_no = de.emp_no) JOIN departments d ON (de.dept_no = d.dept_no) AND e.emp_no BETWEEN 10001 AND 10005;

# Where clause
select e.emp_no, CONCAT(e.first_name, ' ', e.last_name) AS 'Name', d.dept_name from employees e JOIN dept_emp de ON (e.emp_no = de.emp_no) JOIN departments d ON (de.dept_no = d.dept_no) WHERE e.emp_no < 10006;

