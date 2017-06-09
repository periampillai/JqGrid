<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jqgrid/4.6.0/js/i18n/grid.locale-en.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jqgrid/4.6.0/js/jquery.jqGrid.min.js"></script> -->


	<script type='text/javascript' src='http://code.jquery.com/jquery-1.6.2.js'></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.js"></script>
    <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/themes/base/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="http://trirand.com/blog/jqgrid/themes/ui.jqgrid.css">
    <script type='text/javascript' src="http://trirand.com/blog/jqgrid/js/i18n/grid.locale-en.js"></script>
    <script type='text/javascript' src="http://trirand.com/blog/jqgrid/js/jquery.jqGrid.min.js"></script>


<script type="text/javascript">
jQuery(document).ready(function () 
		{
    jQuery("#list").jqGrid({
        url: "jsonData",
        datatype: "json",
        jsonReader: {repeatitems: false, id: "ref"},
        colNames:['First Name'],/* ,'Last Name', 'Address' */
        colModel:[
            {name:'name',index:'name', width:100}/* ,
            {name:'lastName',index:'lastName', width:100},
            {name:'address',index:'address', width:500} */
        ],
        rowNum:20,
        rowList:[20,60,100],
        height:460,
        pager: "#pager",
        viewrecords: true,
        caption: "Json Example"
    });
     
    /* $("#pcSelect").change(function(){
        var postcode = $("#pcSelect").val();
        jQuery("#projectTable").jqGrid(
                "setGridParam",{
                    url:"LoadJsonDataServlet?type="+ postcode,
                    page:1})
                .trigger("reloadGrid");
    }); */
});
</script>
</head>
<body>
			<h1>welcome</h1>
			
			<table id="list"><tr><td></td></tr></table> 
    <div id="pager"></div> 
    
</body>
</html>