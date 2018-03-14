# Select Database employees
use employees;

# AVG
select AVG(salary) from salaries;

# COUNT
select COUNT(salary) from salaries;
select COUNT(*) from salaries;

# MAX
select MAX(salary) from salaries;

# MIN
select MIN(salary) from salaries;

# STDDEV
select STDDEV(salary) from salaries;

# SUM
select SUM(salary) from salaries;

# VARIANCE
select VARIANCE(salary) from salaries;

# GROUP BY
select emp_no, SUM(salary) from salaries group by emp_no;

# HAVING
select emp_no, SUM(salary) from salaries group by emp_no having emp_no BETWEEN 10001 AND 10005;
