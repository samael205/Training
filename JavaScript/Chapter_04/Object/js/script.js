
var sportsPerson = {name:'Roger Federer', sport:'Tennis', country:'switzerland'};


window.onload = function()
{							
	document.getElementById('name').innerHTML = sportsPerson.name;
	document.getElementById('sport').innerHTML = sportsPerson.sport;
	document.getElementById('country').innerHTML = sportsPerson.country;
}
