
array = [];

array[0] = "Red";
array[1] = "Green";
array[2] = "Blue";

output = "";

for(var counter = 0; counter < array.length; counter++)
{
	output += array[counter] + "<br>"
}

document.getElementById('output').innerHTML = output;
