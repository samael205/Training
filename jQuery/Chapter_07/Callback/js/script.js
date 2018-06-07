
$(document).ready(function(){

	var isDivHidden = false;

	$('#cancelButton').click(function(){

		$('#content').stop();

	});

	$('#fadeButton').click(function(){


		$('#content').slideToggle(3000, function(){

			alert('Slide Completed');

		});
			
		isDivHidden = !isDivHidden;

	});

});
