
var colors = ["red", "green", "blue", "yellow"];

var output = "";

var counter = 0;

while(counter < colors.length)
{
	output += colors[counter] + "<br>";
	counter++;
}

document.getElementById('output').innerHTML = output;
