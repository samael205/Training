
$(document).ready(function(){

	$('#para1').click(function(){

		alert('Box 1 was clicked.');

	});

	$('#para2').dblclick(function(){

		alert('Box 2 was double clicked.');

	});

	$('#para3').mouseenter(function(){

		$('#para3').html('Move Mouse Pointer Out Of This Box.');

	});

	$('#para3').mouseleave(function(){

		$('#para3').html('Move Mouse Pointer Into This Box.');

	});

	$('#para4').mousedown(function(){

		$('#para4').html('Mouse button was pressed in this area.');

	});

	$('#para4').mouseup(function(){

		$('#para4').html('Mouse button was released in this area.');

	});

	$('#para5').hover(

		function()
		{
			$('#para5').html('Mouse pointer is in this area.');
		},
		function()
		{
			$('#para5').html('Mouse pointer is not in this area.');
		}

	);

	$('#field').focus(function(){

		$(this).css("background-color", "teal");

	});

	$('#field').blur(function(){

		$(this).css("background-color", "white");

	});

	$('#para6').on({

		mouseenter : function()
		{
			$('#para6').html('Mouse pointer is in this area.');
		},

		mouseleave : function()
		{
			$('#para6').html('Mouse pointer is not in this area.');
		}

	});

});

