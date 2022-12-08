<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>사원조회</h3>
	<div>사번: ${emp.employee_id}</div>
	<div>이름: ${emp.first_name}</div>
	<div>입사일자: ${emp.hire_date}</div>
	<div>급여: ${emp.salary}</div>
</body>
</html>