
$(document).ready(function(){

	var isHidden = false;

	$('#myButton').click(function(){

		if(isHidden)
		{
			$('#content').show();
			$('#myButton').html('Hide');
		}
		else
		{
			$('#content').hide();
			$('#myButton').html('Show');
		}

		isHidden = !isHidden;

	});

});
