
$(document).ready(function(){

	var isAdded = false;

	$('#myButton').click(function(){

		if(isAdded)
		{
			$('body').removeClass('background');
			$('#myButton').html('Add CSS Class');
		}
		else
		{
			$('body').addClass('background');
			$('#myButton').html('Remove CSS Class');
		}

		isAdded = !isAdded;

	});

});

