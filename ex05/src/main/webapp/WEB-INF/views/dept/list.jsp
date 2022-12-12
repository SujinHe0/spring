<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 목록</title>
</head>
<body>
<button onclick="location.href='./insert'">부서 등록하기</button>
	<h3>부서 목록</h3>
	<table>
	<tr>
	<th>부서번호</th>
	<th>부서이름</th>
	<th>매니저ID</th>
	<th>지역ID</th>
	</tr>
	<c:forEach items="${depts }" var="dept">
		<tr>
		<td><a href="select?id=${dept.departmentId }"></a></td>
		<td>${dept.departmentName }</td>
		<td>${dept.managerId }</td>
		<td>${dept.locationId }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>