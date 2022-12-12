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
	<h3>사원정보 등록</h3>
	<form action="${pageContext.request.contextPath }/emp/insert"
		method="post">
		<ul>
			<li>first:<input name="firstName">
			<li>lastName<input name="lastName">
			<li>email:<input name="email">
			<li>hireDate:<input type="date" name="hireDate">
			<!-- 참조키 : select, radio, checkbox로 하기 -->
			<li>jobId:<select name="jobId">
				<c:forEach items="${jobs }" var="job">
					<option value="${job.jobId }"> ${job.jobTitle }</option>
				</c:forEach>
				</select>
			<li>departmentId<input name="departmentId">
				<button>등록</button>
		</ul>
	</form>
</body>
</html>