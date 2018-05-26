
var myButtonElement;

window.onload = function()
{
	myButtonElement = document.getElementById('myButton');

	myButtonElement.addEventListener('click', myFunction);
}

function myFunction()			
{
	document.write('Mouse button was clicked.');
}
