
var content;

window.onload = function()
{
	content = document.getElementById('content');
}

function modify()
{
	content.innerHTML = window.innerWidth + ' X ' + window.innerHeight;
}
