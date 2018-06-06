
$(document).ready(function(){

	var isHidden = false;

	$('.myButton').click(function(){

		if(isHidden)
		{
			$('.myButton').html('Hide');
			$('p').show();
		}
		else
		{
			$('.myButton').html('Unhide');
			$('p').hide();
		}

		isHidden = !isHidden;

	});
	
});
