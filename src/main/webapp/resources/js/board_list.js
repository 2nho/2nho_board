/*Jquery 사용*/
$(function(){
	boardList();
	
	// 게시판 목록 중 하나 클릭 시 해당 본문으로 이동
	$(document).on("dblclick", "#viewDatatable tbody tr", function () {
		location.href = board_content_url + $(this).attr("id"); //tr의 id속성의 값 = 게시물 ID
	});	
	
	// 게시판 글 목록 호출 함수 
	function boardList() {
	    dt = $("#viewDatatable").DataTable({
	       "language": {
	          "url": dt_languagefile_url
	       },
	       "ajax": {url:board_list_url},
	       "destroy": true,
	       "autoWidth":false,
	       "lengthChange": true,
	       "order": [[ 0, 'asc' ]],
	       "processing": true,
	      /* "serverSide": true,*/
	       "pageLength": 10,
	       "dom":'<"row"<"col-sm-10 text-right search_filter">><"row"<"col-sm-12 table-wrapper"t>><"row"<"col-sm-6" <"col-sm-2"l>><"col-sm-6"p>>',
	       columns:[
			   { data:null, searchable:false, orderable: false, sortable: false,
            			render: function (data, type, row, meta) {
                    		return meta.row + meta.settings._iDisplayStart + 1;
                 	}  
           	   },
	           { data:'title', defaultContent:'',searchable:'true','orderable':false,'sortable':false},
	           { data:'content', defaultContent:'',searchable:'true','orderable':false,'sortable':false},
	           { data:'date', defaultContent:'',searchable:'true','orderable':false,'sortable':false}
	        ],
	      createdRow: function( row, data, dataIndex ) { //id값을 tr의 속성 id값으로 저장
          		$(row).attr("id", data.id);
        }
	    }); 
	 } // end
});