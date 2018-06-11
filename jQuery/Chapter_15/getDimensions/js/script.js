
$(document).ready(function(){

	function tableUpdate()
	{
		$('#rowWidth').html($('#content').width());
		$('#rowHeight').html($('#content').height());

		$('#rowInnerWidth').html($('#content').innerWidth());
		$('#rowInnerHeight').html($('#content').innerHeight());

		$('#rowOuterWidth').html($('#content').outerWidth());
		$('#rowOuterHeight').html($('#content').outerHeight());

		$('#rowOuterWidthTrue').html($('#content').outerWidth(true));
		$('#rowOuterHeightTrue').html($('#content').outerHeight(true));

		$('#rowDocumentWidth').html($(document).width());
		$('#rowDocumentHeight').html($(document).height());

		$('#rowWindowWidth').html($(window).width());
		$('#rowWindowHeight').html($(window).height());
	}


	tableUpdate();

	$(window).resize(function(){

		tableUpdate();

	});

});

