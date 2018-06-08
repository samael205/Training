
$(document).ready(function(){

	$('#text').click(function(){

		$('#content').text('This is sentence 1 of paragraph 1.');

	});

	$('#html').click(function(){

		$('#content').html('This is <b>sentence 1</b> of <i>paragraph 1</i>.');

	});

});
