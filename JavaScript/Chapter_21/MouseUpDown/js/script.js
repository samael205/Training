
var content;

window.onload = function()
{
	content = document.getElementById('Contents');
}

function mouseDown()
{
	content.innerHTML = 'Release mouse.';
}

function mouseUp()
{
	content.innerHTML = 'Click here.';
}