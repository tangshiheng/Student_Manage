<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="libai.stu_man.entity.Student" %>
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
<script type="text/javascript">
	function doDelete(stuNo) {
		var flag = confirm("是否确定删除？"+stuNo);
		if(flag){
			window.location.href = "Delete?stuNo="+stuNo;
		}
	}
</script>
</head>
<body>
	<div class="container">
	<table  class="table table-hover">
	<tr><td>
	<a href="PageList?currentPage=1">分页显示所有学生信息</a>
	<td>
	<a href="StuList">显示所有学生信息</a>
	</td>
	</td></tr>
	</table>
	<table class="table table-hover">
		<form action="QueryByOption" method="post">
		<tr>
			<td colspan="8">
			按姓名查询：<input type="text" name="sName"/>
			按性别查询：<select name = "sSex">
				<option value="">--请选择--
				<option value="男">男
				<option value="女">女
			</select>
			<input type="submit" value="查询"/>
			<a href="addStu.jsp">添加</a> </td>
		</tr>
		</form>
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>出生日期</td>
			<td>专业</td>
			<td>总学分</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${stuList }" var="stu">
		<tr>
			<td>${stu.stuNo }</td>
			<td>${stu.stuName }</td>
			<td>${stu.stuSex }</td>
			<td>${stu.stuBirthday }</td>
			<td>${stu.stuMajor }</td>
			<td>${stu.stuTotalCredit }</td>
			<td>${stu.stuRemark }</td>
			<td><a href="Update?stuNo=${stu.stuNo }">修改</a>|<a href="#" onclick="doDelete(${stu.stuNo })">删除</a></td>
		</tr>
		</c:forEach>
		
	</table>
	</div>
</body>
</html>