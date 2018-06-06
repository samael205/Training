
$(document).ready(function(){

	var isHidden = false;

	$('#myButton').click(function(){

		if(isHidden)
		{
			$('#myButton').html('Hide');
		}
		else
		{
			$('#myButton').html('Show');
		}

		$('#content').toggle();

		isHidden = !isHidden;

	});

});
