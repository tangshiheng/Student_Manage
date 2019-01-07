<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="css/bootstrap.css" />
<!--导入jQuer文件-->
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<!--导入bootstrap核心js文件-->
<script type="text/javascript" src="js/bootstrap.js"></script>

<title>Insert title here</title>
</head>
<body>
	<!-- test update second-->
	<div class="container">
	<form action="UpdateStu" method="post">
		<input type="hidden" name="stuNo" value="${oldStu.stuNo}"/>
		<table class="table table-bordered">
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="stuName" value="${oldStu.stuName}"/></td>
			</tr>
			<tr>
			
				<td>性别</td>
				<td>男<input type="radio" name="stuSex" value="男" <c:if test="${oldStu.stuSex=='男'}">checked</c:if>/>|
					女<input type="radio" name="stuSex" value="女" <c:if test="${oldStu.stuSex=='女'}">checked</c:if>/></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="text" name="stuBirthday" value="${oldStu.stuBirthday}"/></td>
			</tr>
			<tr>
				<td>专业</td>
				<td><input type="text" name="stuMajor" value="${oldStu.stuMajor}"/></td>
			</tr>
			<tr>
				<td>总学分</td>
				<td><input type="text" name="stuTotalCredit" value="${oldStu.stuTotalCredit}"/></td>
			</tr>
			<tr>
				<td>备注</td>
				<td><input type="text" name="stuRemark" value="${oldStu.stuRemark}"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"/></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>
