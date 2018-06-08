
var isInverted = false;

$(document).ready(function(){

	$('#invert').click(function(){

		if(isInverted)
		{
			$('#name').attr('style', 'background-color: white; color: black;');	
		}
		else
		{
			$('#name').attr('style', 'background-color: black; color: white;');	
		}
		
		isInverted = !isInverted;

	});

});
