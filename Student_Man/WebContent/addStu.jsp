<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<br><br><br><br><br>
<div class="container">
	<form action="addStuServlet" method="post">
		<table class="table table-bordered ">
			<tr>
				<td class="text-center">学号：</td>
				<td><input type="text" name="stuNo"/></td>
			</tr>
			<tr>
				<td class="text-center">姓名：</td>
				<td><input type="text" name="stuName"/></td>
			</tr>
			<tr>
				<td class="text-center">性别</td>
				<td>男<input type="radio" checked="checked" name="stuSex" value="男"/>|
					女<input type="radio" name="stuSex" value="女"/></td>
			</tr>
			<tr>
				<td class="text-center">生日</td>
				<td><input type="text" name="stuBirthday"/></td>
			</tr>
			<tr>
				<td class="text-center">专业</td>
				<td><input type="text" name="stuMajor"/></td>
			</tr>
			<tr>
				<td class="text-center">总学分</td>
				<td><input type="text" name="stuTotalCredit"/></td>
			</tr>
			<tr>
				<td class="text-center">备注</td>
				<td><input type="text" name="stuRemark"/></td>
			</tr>
			<tr>
				<td colspan="2" class="text-center"><input type="submit" value="提交"/></td>
			</tr>
		</table>
	
	</form>
	</div>
</body>
</html>