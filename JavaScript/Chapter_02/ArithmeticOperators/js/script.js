
window.onload = function()
{
	document.getElementById("add").innerHTML = '4 + 3 = ' + (4 + 3);
	
	document.getElementById("sub").innerHTML = '4 - 3 = ' + (4 - 3);

	document.getElementById("mul").innerHTML = '4 * 3 = ' + (4 * 3);
	
	document.getElementById("div").innerHTML = '4 / 3 = ' + (4 / 3);
	
	document.getElementById("mod").innerHTML = '4 % 3 = ' + (4 % 3);
	
	var val = 4;
	val++;
	document.getElementById("inc").innerHTML = 'var val = 4++; val++; val : ' + (val);
	
	var val = 4;
	val--;
	document.getElementById("dec").innerHTML = 'var val = 4--; val--; val : ' + (val);
}
