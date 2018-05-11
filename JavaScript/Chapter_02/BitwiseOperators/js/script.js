
window.onload = function()
{

	document.getElementById('and').innerHTML = '5 & 1 : ' + (5 & 1);

	document.getElementById('or').innerHTML = '5 | 1 : ' + (5 | 1);

	document.getElementById('not').innerHTML = '~5 : ' + (~5);

	document.getElementById('xor').innerHTML = '5 ^ 1 : ' + (5 ^ 1);

	document.getElementById('leftshift').innerHTML = '5 << 1 : ' + (5 << 1);

	document.getElementById('rightshift').innerHTML = '5 >> 1 : ' + (5 >> 1);

	document.getElementById('trightshift').innerHTML = '5 >>> 1 : ' + (5 >>> 1);

}
