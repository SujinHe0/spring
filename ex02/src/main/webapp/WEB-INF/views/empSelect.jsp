<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form>
	부서:<input name="departmentId" value="${empVO.departmentId}">
	이름:<input name="firstName" value="${empVO.firstName}">
	<button>검색</button>
</form>


<table border="1">
	<tr>
	<th>NO</th>
	<th>사원번호</th>
	<th>이름</th>
	<th>성</th>
	</tr>
	<c:forEach items="${emps}" var="emp" varStatus="st">
		<tr>
		<td>${st.count}</td>
			<td>${emp.employeeId}</td>
			<td>${emp.firstName}</td>
			<td>${emp.lastName}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>