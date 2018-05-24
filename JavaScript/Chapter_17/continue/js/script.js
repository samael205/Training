
var colors = ["red", "green", "blue", "yellow"];

var output = "";

for(var counter = 0; counter < colors.length; counter++)
{
	if(counter == 2)
	{
		continue;
	}

	output += colors[counter] + "<br>";
}

document.getElementById('output').innerHTML = output;
