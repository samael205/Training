
var colors = ["red", "green", "blue", "yellow"];

var output = "";

for(var value in colors)
{
	output += colors[value] + "<br>"
}

document.getElementById('output').innerHTML = output;
