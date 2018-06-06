
$(document).ready(function(){

	var isDiv1Hidden = false;
	var isDiv2Hidden = false;
	var isDiv3Hidden = false;

	$('#fadeButton1').click(function(){

		if(isDiv1Hidden)
		{
			$('#content1').fadeIn();
		}
		else
		{
			$('#content1').fadeOut();
		}

		isDiv1Hidden = !isDiv1Hidden;

	});

	$('#fadeButton2').click(function(){

		if(isDiv2Hidden)
		{
			$('#content2').fadeIn('slow');
		}
		else
		{
			$('#content2').fadeOut('slow');
		}

		isDiv2Hidden = !isDiv2Hidden;

	});

	$('#fadeButton3').click(function(){

		if(isDiv3Hidden)
		{
			$('#content3').fadeIn(3000);
		}
		else
		{
			$('#content3').fadeOut(3000);
		}

		isDiv3Hidden = !isDiv3Hidden;

	});

});

