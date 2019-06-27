 
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardList</title>
</head>
<body>

<h3> board List</h3>

<form name="boardForm" id="boardForm" method="post">
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		</thead>		
		<tbody>
			<c:forEach var="result" items="${list }" varStatus="status">
			<tr>
				<td><c:out value="${result.userNO }"/></td>
				<td><a href="#" onclick="viewContent($(result.userNO))">
					<c:out value="${result.title }"/></a></td>
				<td><c:out value="${result.writer }"/></td>
				<td><c:out value="${result.reg_datetime }"/></td>
			</tr>		
			</c:forEach>
		</tbody>
	</table>
	
	<div>
		<!-- <button id="bWrite" type="button" onclick="bWrite()" >글쓰기</button>-->
		 <a href = # onclick="bWrite()">글쓰기</a>
	</div>
</form>

<!-- script -->

<script>

//글쓰기
function bWrite() {
	var form = document.getElementById("boardForm");
	form.action = "<c:url value='/board/write.do'/>";
	form.submit();
}

//게시글 조회
function viewContent() {
	
	var form = document.getElementById("boardForm");
	var url = "<c:url value='/board/viewContent.do'/>";
	url = url + "?userNO="+userNO;
	
	form.action=url;
	from.submit();
}
</script>
</body>
</html>