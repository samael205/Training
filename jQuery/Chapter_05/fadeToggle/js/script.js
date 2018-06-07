
$(document).ready(function(){

	var isDiv1Hidden = false;
	var isDiv2Hidden = false;
	var isDiv3Hidden = false;

	$('#fadeButton1').click(function(){

		$('#content1').fadeToggle();
		isDiv1Hidden = !isDiv1Hidden;

	});

	$('#fadeButton2').click(function(){

		$('#content2').fadeToggle('slow');
		isDiv2Hidden = !isDiv2Hidden;

	});

	$('#fadeButton3').click(function(){

		$('#content3').fadeToggle(3000);
		isDiv3Hidden = !isDiv3Hidden;

	});

});

