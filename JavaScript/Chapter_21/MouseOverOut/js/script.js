
var content;

window.onload = function()
{
	content = document.getElementById('Contents');
}

function mouseOver()
{
	content.innerHTML = 'Move mouse pointer out of this area.';
}

function mouseOut()
{
	content.innerHTML = 'Mouse pointer was in this area.';
}
