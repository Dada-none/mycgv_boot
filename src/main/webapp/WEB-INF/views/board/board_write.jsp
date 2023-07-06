<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/css/mycgv_jsp.css">
<script src="http://localhost:9000/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:9000/js/mycgv_jsp_jquery.js"></script>
</head>
<body>
	<!-- header -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<section class="board">
			<h1 class="title">게시판</h1>
			<form name="writeForm" action="board_write_proc.do" method="post" enctype="multipart/form-data">
				<table>
					<tr>
						<th class="test">제목</th>
						<td>
							<input type="text" name="btitle" id="btitle"
								placeholder="*제목은 반드시 입력해주세요" >
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td>
							<textarea rows="5" cols="30" name="bcontent"></textarea>
						</td>
					</tr>
					<tr>
						<th>작성자</th>
						<td>
							<input type="text" name="id" value="hong" disabled>
							<input type= "hidden" name="id" value="hong"> 
							<!-- 위에 disabled된 애는 form을 통해 값이 안넘어가  -->
							<!-- 그래서 밑에 hidden으로 값을 가리고 그 줄의 value값을 넘겨 -->
						</td>
					</tr>
					<tr>
						<th>파일업로드</th>
						<td>
							<input type="file" name="file1">
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="button" class="btn_style" id = "btnBoardWrite">등록완료</button>
							<button type="reset" class="btn_style">다시쓰기</button>
							<a href="board_list.do">
								<button type="button" class="btn_style">리스트</button></a>
							<a href="http://localhost:9000/index.do">
								<button type="button" class="btn_style">홈으로</button></a>
						</td>				
					</tr>
				</table>
			</form>
		</section>
	</div>
	
	<!-- footer -->
	<!-- <iframe src="http://localhost:9000/footer.jsp"
			scrolling="no" width="100%" height="500px" frameborder=0></iframe> -->	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
















