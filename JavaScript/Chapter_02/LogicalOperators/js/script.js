
window.onload = function()
{

	document.getElementById('and1').innerHTML = 'true && true : ' + (true && true);

	document.getElementById('and2').innerHTML = 'true && false : ' + (true && false);

	document.getElementById('and3').innerHTML = 'false && true : ' + (false && true);

	document.getElementById('and4').innerHTML = 'false && false : ' + (false && false);

	document.getElementById('or1').innerHTML = 'true || true : ' + (true || true);

	document.getElementById('or2').innerHTML = 'true || false : ' + (true || false);

	document.getElementById('or3').innerHTML = 'false || true : ' + (false || true);

	document.getElementById('or4').innerHTML = 'false || false : ' + (false || false);

	document.getElementById('not1').innerHTML = '!true : ' + (!true);

	document.getElementById('not2').innerHTML = '!false : ' + (!false);

}
