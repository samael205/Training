# Select Database employees
use employees;

# UPPER
select distinct(UPPER(CONCAT(first_name, ' ', last_name))) from employees;

# LOWER
select distinct(LOWER(CONCAT(first_name, ' ', last_name))) from employees;

# INITCAP
select distinct(INITCAP(CONCAT(first_name, ' ', last_name))) from employees;

# CONCAT
select CONCAT('Hello', ' ', 'World') from dual;

# SUBSTR
select SUBSTR('Hello World', 1, 4) from dual;

# LENGTH
select LENGTH('Hello World') from dual;

# INSTR
select INSTR('HelloWorld', 'W') from dual;
select INSTR('HelloWorld', 'F') from dual;

# LPAD
select LPAD(24000, 10, '$') from dual;

# RPAD
select RPAD(24000, 10, '$') from dual;

# REPLACE
select REPLACE('ball', 'b', 'c') from dual;

# TRIM
select TRIM('My' from 'MySQL') from dual;

# ABS
select ABS(-1) from dual;
select ABS(0) from dual;
select ABS(1) from dual;

# CEIL
select CEIL(1.8) from dual;
select CEIL(2) from dual;

# EXP
select EXP(0) from dual;
select EXP(1) from dual;

# POWER
select POW(2, 0) from dual;
select POW(2, 2) from dual;
select POW(2, 0.5) from dual;

# SIGN
select SIGN(2) from dual;
select SIGN(0) from dual;
select SIGN(-2) from dual;

# Timestamp
select current_timestamp() from dual;

# User
select user() from dual;

# Round
select ROUND(3.875) from dual;
select ROUND(3.875, 1) from dual;

# MOD
select MOD(1600, 300) from dual;

# SYSDATE
select SYSDATE() from dual;
