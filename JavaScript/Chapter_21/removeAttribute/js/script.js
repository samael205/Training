
var toggleStatus = (function(){

	var isDisabled = false;

	return function(){return isDisabled = (!isDisabled);}

})();

function toggleDisable()
{
	var isDisabled = toggleStatus();

	var inputField = document.getElementById('name');

	if(isDisabled)
	{
		inputField.setAttribute('disabled', 'disabled');
	}
	else
	{
		inputField.removeAttribute('disabled');
	}
}
