<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 본문</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="<c:url value='/css/style.bundle.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/css/common.css'/>" rel="stylesheet" type="text/css" />
<script src="<c:url value='/global/plugins.bundle.js' />"></script>
<link href="<c:url value='/global/plugins.bundle.css'/>" rel="stylesheet" type="text/css" />
<script src="<c:url value='/global/plugins.bundle.js' />"></script>
<script src="<c:url value='/js/board_content.js' />"></script>
</head>
<body>
	<div id="kt_content_container" class="container">
		<!--begin::Card-->
		<div class="card">
			<!--begin::Card body-->
			<div class="card-body">
				<ul class="guest_table2">
					<li>
						<div style="width: 100%">
							<h2>제목</h2>
							<span class="m-left2" style="display: flex; width: 100%"><input type="text" name="title" id="title" value="" class="form-control"></span>
						</div>
					</li>
					<li style="min-height: 300px;">
						<div style="width: 100%">
							<h2 style="height: 100%">내용</h2>
							<span class="m-left2" style="display: flex; width: 100%; height: 100%"><textarea name="content" id="content" cols="100" rows="10"></textarea></span>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<!--end::Card-->
		<div>
			<h4>연관 게시물</h4>
			<ul class="list_related">
			</ul>
		</div>
	</div>
</body>
<script type="text/javascript">
	const related_list_url = "<c:url value='/api/board/related-list/' />";
	const board_content_url = "<c:url value='/board/content/' />";
	const title = "${title}"; // 제목
	const content = "${content}"; // 본문내용
</script>
</html>