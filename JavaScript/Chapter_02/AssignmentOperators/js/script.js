
window.onload = function()
{

	var value = 4;
	document.getElementById("asg").innerHTML = 'var value = 4; value : ' + value;

	var value = 4;
	value += 3;
	document.getElementById("add").innerHTML = 'var value = 4; value += 3; value : ' + value;

	var value = 4;
	value -= 3;
	document.getElementById("sub").innerHTML = 'var value = 4; value -= 3; value : ' + value;

	var value = 4;
	value *= 3;
	document.getElementById("mul").innerHTML = 'var value = 4; value *= 3; value : ' + value;

	var value = 4;
	value /= 3;
	document.getElementById("div").innerHTML = 'var value = 4; value /= 3; value : ' + value;

	var value = 4;
	value %= 3;
	document.getElementById("mod").innerHTML = 'var value = 4; value %= 3; value : ' + value;
}
