<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	$(function() {
		let result = '${result}';
		debugger
		if (result) {
			//alert("처리 완료")
			$(".modal-body").html(result) //모달바디에 내용집어넣기	
			$("#exampleModal").modal('show')
		}
	})
</script>
<body>
	<div>결과: ${result }</div>
	<h3>사원리스트</h3>
	<a href="${pageContext.request.contextPath }/emp/insert">사원 등록으로 이동</a>
	<hr>

	<table>
		<tr>
			<th>사원번호</th>
			<th>이름</th>
			<th>부서</th>
			<th>이메일</th>
			<th>직무</th>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr>
				<td><a href="./select?id=${emp.employeeId }">${emp.employeeId }</a></td>
				<td><a
					href="${pageContex.requerst.contextPath }/emp/select?id=${emp.firstName}">${emp.firstName }${emp.lastName }</a></td>
				<td>${emp.departmentId }</td>
				<td>${emp.email }</td>
				<td>${emp.jobId }</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<%-- 	<ul>
		<c:forEach items="${emps}" var="emp">
			<li>사번: ${emp.employeeId }</li>
			<li>이름: ${emp.firstName } ${emp.lastName }</li>
			<li>부서: ${emp.departmentId }</li>
			<li>입사일: ${emp.hireDate }</li>
			<li>직무: ${emp.jobId }</li>
		</c:forEach>
	</ul> --%>
	<!-- Modal -->
	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>