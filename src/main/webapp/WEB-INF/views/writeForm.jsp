<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>writeForm</title>
</head>
<body>
<div>
    <form id="writeForm" name="writeForm" method="post">
        <div>
            <h2>글쓰기</h2>
            <div>
                <table>
                    <tr>
                        <th>제목</th>
                        <td><input style="width: 500px" height="35px" type="text" id="title" name="title" /></td>
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td><textarea style="width: 500px" rows="10" cols="10" id="content" name="content"></textarea></td>
                    </tr>
                    <tr>
                        <th>작성자</th>
                        <td><input style="width: 500px"  height="35px" type="text" id="writer" name="writer" /></td>
                    </tr>
                </table>
                <div>
                    <a href='#' onClick='writeBoard()'>글 등록</a>
                    <a href='#' onClick='cancel()'>목록</a>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- script -->
<script>

//글쓰기
function writeBoard(){
    
    var form = document.getElementById("writeForm");
    
    form.action = "<c:url value='/board/bWrite.do'/>";
    form.submit();
    
}
 
//목록
function cancel(){
    var form = document.getElementById("writeForm");
    form.action = "<c:url value='/board/boardList.do'/>";
    form.submit();
}

</script>


</body>
</html>