<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view FORM</title>
</head>
<body>
<div>
    <form id="viewForm" name="viewForm" method="post">
        <div>
            <h2>글쓰기</h2>
            <div>
                <table>
                    <tr>
                        <th>제목</th>
                        <td><input style="width: 500px" type="text" id="title" name="title" value="${result.title }"/></td>
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td><textarea style="width: 500px" rows="10" cols="10" id="content" name="content"><c:out value="${result.content }"/></textarea></td>
                    </tr>
                    <tr>
                        <th>작성자</th>
                        <td><input style="width: 500px" type="text" id="writer" name="writer" value="${result.writer }"/></td>
                    </tr>
                </table>
                <div>
                    <a href='#' onClick='bUpdate()'>수정</a>
                    <a href='#' onClick='cancel()'>목록</a>
                    <a href='#' onClick='bRelay()'>답변</a>                    
                </div>
            </div>
        </div>
        <input type='hidden' id='code' name='code' value='${result.code }' />
    </form>
<script>

//목록
function cancel(){
    
    var form = document.getElementById("viewForm");
    form.action = "<c:url value='/board/boardList.do'/>";
    form.submit();
    
}
 
//수정
function bUpdate(){
    
    var form = document.getElementById("viewForm");
    
    form.action = "<c:url value='/board/updateboard.do'/>";
    form.submit();
}
 
//답변
function bRelay(){
    
    var form = document.getElementById("viewForm");
    form.action = "<c:url value='/board/relayForm.do'/>";
    form.submit();
    
}
</script>
</div>
</body>
</html>