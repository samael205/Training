
var timeOutput;

window.onload = function()
{
	timeOutput = document.getElementById('time');
	window.setInterval(updateTime, 500);
}

function updateTime()
{
	timeOutput.value = new Date();
}
