<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>


<div>
    <form id="boardForm" name="boardForm" method="post" action="">
        <table>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>날짜</th>
                    <th>조회수</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="result" items="${list }" varStatus="status">
                <c:url value='/board/viewContent.do' var="fn_view"> <c:param name="code" value="${result.code}"  /></c:url>
                
                    <tr>
                        <td><c:out value="${result.code }"/></td>
<%--                         <td><a href='#' onClick='fn_view(${result.code})'><c:out value="${result.title }"/></a></td> --%>
						<td><a href="${fn_view}">     <c:out value="${result.title }"/></a></td>
                        <td><c:out value="${result.writer }"/></td>
                        <td><c:out value="${result.reg_datetime }"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <div>            
            <a href='#' onClick='fn_write()'>글쓰기</a>            
        </div>
    </form>
</div>
<script type="text/javascript">

$(document).ready(function(){
	fn
	
});


function fn_list(){
    var form = document.getElementById("boardForm");
    var url = "<c:url value='/board/boardList.do'/>";
    form.action = url;    
    form.submit(); 
}


//글쓰기
function fn_write(){
    
    var form = document.getElementById("boardForm");
    form.action = "<c:url value='/board/writeForm.do'/>";
    form.submit();
}
 
</script>


</body>
</html>
