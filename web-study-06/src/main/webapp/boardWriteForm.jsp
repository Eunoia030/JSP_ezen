<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.cen{
		text-align: center;
	}
	
	.row{
		font-weight: bold;
		background-color: #eee;
		text-align: center;
	}
	
	table{ margin: 0 auto;}
</style>
</head>
<body>

	<h2 class="cen">게시판 글쓰기</h2>
	<form method="post" action="boardWrite.jsp">
		<table border="1">
			<tr>
				<td class="row">작성자</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td class="row">비밀번호</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td class="row">이메일</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td class="row">글 제목</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td class="row">글 내용</td>
				<td>
					<textarea rows="5" cols="30" name="content"></textarea>
				</td>
			</tr>
			<tr class="cen row">
				<td colspan="2">
					<input type="submit" value="등록">
					<input type="submit" value="다시작성">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>