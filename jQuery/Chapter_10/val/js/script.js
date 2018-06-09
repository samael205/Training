
$(document).ready(function(){

	$('#display').click(function(){

		var word = prompt('Enter a word', 'word');

		if(word != null)
		{
			$('#word').val(word);
		}

	});

});
