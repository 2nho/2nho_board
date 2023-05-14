$(function() {
	if (title != '') {
		$("#title").val(title);
		$("#content").val(content);
	}

	$.ajax({
		url: related_list_url,
		type: "GET",
		/*data: JSON.stringify(request),*/
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(result) {
			$.each(result, function(index, item) {
				const listItem = $("<li>").addClass("item_related");
				const linkItem = $("<a>").addClass("link_related").attr("href", board_content_url+item.id); // 프로젝트 이름 포함 절대경로 + id
				const boxContent = $("<div>").addClass("box_content");
				const strong = $("<strong>").text(item.title);
				const spanInfo = $("<span>").addClass("info").text(item.date);
				boxContent.append(strong, spanInfo);
				linkItem.append(boxContent);
				listItem.append(linkItem);
				$(".list_related").append(listItem);
			});
		}

	});
});
