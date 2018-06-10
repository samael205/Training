
$(document).ready(function(){

	var isAdded = false;

	$('#myButton').click(function(){

		if(isAdded)
		{
			$('#myButton').html('Add CSS Class');
		}
		else
		{
			$('#myButton').html('Remove CSS Class');
		}

		$('body').toggleClass('background');
		isAdded = !isAdded;

	});

});

