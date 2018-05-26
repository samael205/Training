
function changeBackgroundColor()
{
	var bodyElement = document.getElementsByTagName('body')[0];

	var red = Math.round(256 * Math.random());
	var green = Math.round(256 * Math.random());
	var blue = Math.round(256 * Math.random());

	bodyElement.setAttribute('style', 'background-color: rgb(' + red + ', ' + green + ', ' + blue + ');');
}
