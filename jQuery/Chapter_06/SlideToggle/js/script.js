
$(document).ready(function(){

	var isDiv1Hidden = false;
	var isDiv2Hidden = false;
	var isDiv3Hidden = false;

	$('#fadeButton1').click(function(){

		$('#content1').slideToggle();
		isDiv1Hidden = !isDiv1Hidden;

	});

	$('#fadeButton2').click(function(){

		$('#content2').slideToggle('slow');
		isDiv2Hidden = !isDiv2Hidden;

	});

	$('#fadeButton3').click(function(){

		$('#content3').slideToggle(3000);
		isDiv3Hidden = !isDiv3Hidden;

	});

});

