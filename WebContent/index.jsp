<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/cutPage/jquery-1.7.js"></script>
<script type="text/javascript">
	$(function() {
		cut(1);
	});
	//分页方法，pn为页码
	function cut(pn) {
		//向服务器发送post请求，第一个参数为请求路径，第二个参数为表单数据，第三个参数为回调函数处理响应信息
		$.post("/cutPage/mm/findByItem", "pageNo="+pn+"&"+$("#f1").serialize(), function(info) {
			var str = "";
			for(var i = 0;i<info.list.length;i++){
				var obj = info.list[i]
				str+="<tr><td>"+obj.eName+"</td><td>"+obj.birthday+"</td><td>"+obj.money+"</td></tr>";
			}
			$("#data").html(str);
			var pageStr = "";
			
			for(var i=1;i<=info.totalPage;i++){
				pageStr+="<a href='javascript:cut("+i+")'>"+i+"</a>   ";
			}
			
			$("#cutPageDiv").html(pageStr);
		},"json");
	}
	
</script>
</head>
<body>
	<table border="1" width="60%" cellspacing="0">
		<thead>
			<tr>
				<th>姓名</th>
				<th>生日</th>
				<th>工资</th>
			</tr>
		</thead>
		<tbody id="data">

		</tbody>
	</table>
	<div id="cutPageDiv">
	</div>
	<form action="" id="f1">
		姓名：<input type="text" name="eName"><br> 
		起始日期：<input type="text" name="startDate"><br> 
		结束日期：<input type="text" name="endDate"><br> 
		<input type="button" value="查询" onclick="cut(1)">
	</form>
</body>
</html>