<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>사원정보 수정</h3>
		<form action="./update" method="post">
		<ul>
			<li>사원번호:<input name="employeeId" readonly="readonly" value
			="${emp.employeeId }">
			<li>firstName<input name="firstName" value="${emp.firstName }">
			<li>lastName<input name="lastName" value="${emp.lastName }">
			<li>email:<input name="email" value="${emp.email }">
			<li>hireDate:<input type="date" name="hireDate" value="${emp.hireDate }">
			<li>jobId:<input name="jobId" value="${emp.jobId }">
				<button>수정</button>
		</ul>
	</form>
	<script type="text/javascript">
		
	</script>
</body>
</html>