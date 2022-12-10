<%@ tag language="java" pageEncoding="UTF-8"%>
<select name="departmentId">
	<option value="">선택
	<option value="10">Administration
	<option value="20">Marketing
	<option value="50">Shipping
	<option value="60">IT
	<option value="80">Sales
</select>
<script> 
	searchFrm.departmentId.value = '${empVO.departmentId}'
</script>
