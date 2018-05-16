
var output = "";

var string = "red,green,blue";

var colors = string.split(',');

for(var counter = 0; counter < colors.length; counter++)
{
	output += colors[counter] + "<br>"
}

document.getElementById('output').innerHTML = output;
