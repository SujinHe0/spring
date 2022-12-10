<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>사원정보</h3>
	<div>사원번호: ${emp.employeeId }</div>
	<div>이름: ${emp.firstName }</div>
	<div>성: ${emp.lastName }</div>
	<div>이메일: ${emp.email }</div>
	<div>입사일: ${emp.hireDate }</div>
	<div>직무: ${emp.jobId }</div>
	<div>부서아이디: ${emp.departmentId }</div>
	<div>연봉: ${emp.salary }</div>
</body>

</html>