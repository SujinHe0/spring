<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 검색조건 시작 -->
<form name="searchFrm">
	부서: 
<my:select2 />
<%-- 	<my:select /> --%>
	이름:<input name="firstName" value="${empVO.firstName}">
	<button>검색</button>
	<input type="hidden" name="page" value="1">
</form>
<!-- 검색조건 종료 -->

<!-- 목록 시작 -->
<table class="table table-striped">
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
			<td><a href="./empSelect?id=${emp.employeeId}">${emp.firstName}</a></td>
			<td>${emp.lastName}</td>
		</tr>
	</c:forEach>
</table>
<!-- 목록 끝 -->


<!-- 페이징 시작 -->

<my:paging paging="${paging}" jsFunc="gopage"></my:paging>
<%-- ${paging}<br />
	<c:forEach begin="${paging.startPage }" end="${paging.endPage }" var="i">
		<a href="#" onclick="javascript:gopage(${i})">${i}</a>
	</c:forEach> --%>
<!-- 페이징 끝 -->
</body>
<script>
function  gopage(i) {
	searchFrm.page.value = i;
	searchFrm.submit();
}
</script>
</html>