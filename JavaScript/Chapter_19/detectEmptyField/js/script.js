
validate = function()
{
	var name = document.getElementById('name').value;

	if(name == "")
	{
		alert("Name must be filled.");
		return false;
	}

	return true;
}
