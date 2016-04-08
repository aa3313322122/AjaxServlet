<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath()%>/js/jquery-1.8.2.js" type="text/javascript"></script>
</head>
<script type="text/javascript">
function addCart()
{
	var data = $('#order1').val();
	alert(data);
	$.post(
			"<%=request.getContextPath() %>/cart",
			{cart:data},
			function(data){
				alert(data);
			},"text"
			);
}
function addCart2()
{
	var data = $('#order2').val();
	alert(data);
	$.post(
			"<%=request.getContextPath() %>/cart",
			{cart:data},
			function(data){
				alert(data);
			},"text"
			);
}
</script>
<body>
<form>

<input type="text" readonly="readonly" name="order1" id="order1" value="order1"/>
<input type="button" id="aCart" value="add" onclick="addCart();" /></br>
<input type="text" readonly="readonly" name="order2" id="order2" value="order2"/>
<input type="button" id="aCart" value="add" onclick="addCart2();" />
</form>
<a href="<%=request.getContextPath() %>/carts">前往购物车</a>
</body>
</html>