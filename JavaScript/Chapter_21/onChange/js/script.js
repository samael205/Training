
function changeBackgroundColor()
{
	var value = document.getElementById('colorSelector').value;

	document.getElementById('body').setAttribute('style', 'background-color: ' + value + ";");
}

window.onload = function()
{
	changeBackgroundColor();
}
