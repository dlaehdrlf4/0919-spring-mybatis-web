<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 페이지</title>
</head>
<body>
	${list}
	<table align="center" border="1" cellpadding="3px">
		<tr style="bacground:blue">
			<th width="80">아이템번호</th>
			<th width="200">아이템이름</th>
			<th width="120">가격</th>
			</tr>
			<c:forEach var="item" items="${list}">
				<tr>
					<td align="right">${item.itemid}</td>
					<td><a href ="detail?itemid=${item.itemid}">${item.itemname}</a></td>
					<td align="right">${item.price}</td>
					</tr>
					</c:forEach>
	</table>
</body>
</html>