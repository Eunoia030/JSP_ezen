<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
</head>
<body>
	<div id="wrap" align="center">
<h1>작성</h1>
<form enctype="multipart/form-data" method="post" name="frm"> 
   <table>
      <tr>
         <th> 제목 </th>
         <td><input type="text" name="mtitle" size="60"></td>
      </tr> 
      <tr>
        <th> 가격  </th>
        <td><input type="text" name="price"  size="60"> 원</td>
      </tr>
      <tr>
        <th> 감독</th>
        <td><input type="text" name="director" size="60"></td>
      </tr>
      <tr>
        <th> 배우</th>
        <td><input type="text" name="actor" size="60"></td>
      </tr>
      <tr>
         <th> 시놉스 </th> 
         <td><textarea cols="70" rows="10" name="synopsis"></textarea></td>
      </tr>
      <tr>
         <th>포스터</th>
         <td>
            <input type="file" name="poster" ><br>
        </td>
      </tr>  
   </table>
   <br>
   <input type="submit" value="전송"  onclick="return movieCheck()">
   <input type="reset" value="초기화">
   <input type="button" value="리스트" onclick="location.href='movieList.do'" >
</form>
</div>
</body>
</html>