
$(document).ready(function(){

	var isDiv1Hidden = false;
	var isDiv2Hidden = false;

	$('#fadeButton1').click(function(){

		if(isDiv1Hidden)
		{
			$('#content1').fadeTo('slow', 1);
		}
		else
		{
			$('#content1').fadeTo('slow', 0.25);
		}

		isDiv1Hidden = !isDiv1Hidden;

	});

	$('#fadeButton2').click(function(){

		if(isDiv2Hidden)
		{
			$('#content2').fadeTo(3000, 1);
		}
		else
		{
			$('#content2').fadeTo(3000, 0.25);
		}

		isDiv2Hidden = !isDiv2Hidden;

	});

});

