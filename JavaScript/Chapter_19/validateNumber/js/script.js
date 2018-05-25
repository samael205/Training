
validate = function()
{
	var number = document.getElementById('number').value;

	if(isNaN(number) || number < 1 || number > 10)
	{
		alert("Number in the range 1-10 is required.");
		return false;
	}

	return true;
}
