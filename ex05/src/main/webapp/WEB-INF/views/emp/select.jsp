<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>사원조회</h3>
	<ul>
		<li>사번: ${emp.employeeId }</li>
		<li>이름: ${emp.firstName } ${emp.lastName }</li>
		<li>부서: ${emp.departmentId }</li>
		<li>입사일: ${emp.hireDate }</li>
		<li>직무: ${emp.jobId }</li>
	</ul>
	<button onclick="location.href='update?id=${emp.employeeId }'">사원정보 수정페이지로 이동</button>
	<button id="btn">사원수정</button>
	<form name="frm" method="post" action="delete">
		<input type="hidden" name="employeeId" value="${emp.employeeId }">
		<button id="btnDelete">사원 삭제</button>
	</form>
	<script type="text/javascript">
		btn.addEventListener("click", ev=> {
			location.assign('update?id=${emp.employeeId}')
		})
	</script>
</body>
</html>