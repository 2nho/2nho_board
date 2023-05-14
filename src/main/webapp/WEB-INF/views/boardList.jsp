<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판목록</title>
<link rel="shortcut icon" href="#">
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="<c:url value='/css/style.bundle.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/css/common.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/datatables/datatables.bundle.css' />" rel="stylesheet" type="text/css" />
<script src="<c:url value='/global/plugins.bundle.js' />"></script>
<link href="<c:url value='/global/plugins.bundle.css'/>" rel="stylesheet" type="text/css" />
<script src="<c:url value='/js/board_list.js' />"></script>
<script src="<c:url value='/global/plugins.bundle.js' />"></script>
<script src="<c:url value='/datatables/datatables.bundle.js' />"></script>
<body>
	<div id="dt_wrapper" class="table-responsive">
		<table class="table table-custom" id="viewDatatable">
			<!--begin::Table head-->
			<thead>
				<!--begin::Table row-->
				<tr class="text-start text-muted fw-bolder fs-7 text-uppercase gs-0">
					<th>번호</th>
					<th>제목</th>
					<th>본문</th>
					<th>날짜</th>
				</tr>
				<!--end::Table row-->
			</thead>
			<!--end::Table head-->
			<!--begin::Table body-->
			<tbody class="text-gray-600 fw-bold">
				<tr class="text-start">
					<td colspan="4">데이터가 없습니다.</td>
				</tr>
			</tbody>
			<!--end::Table body-->
		</table>
	</div>
</body>
<script>
	/* c:url , ${pageContext.request.contextPath} 둘 중 하나 사용 가능  */
	const dt_languagefile_url = "<c:url value='/datatables/Korean.json' />";
	const board_content_url = "<c:url value='/board/content/' />";
	const board_list_url = "<c:url value='/api/board/list' />";
</script>
</html>