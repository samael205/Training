
var colors = ["red", "green", "blue", "yellow"];

var output = "";

myLabel:
{
	output += colors[0] + "<br>";
	output += colors[1] + "<br>";
	break myLabel;
	output += colors[2] + "<br>";
	output += colors[3] + "<br>";
	output += colors[4] + "<br>";
}

document.getElementById('output').innerHTML = output;
