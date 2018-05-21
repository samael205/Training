
array = ["red", "green", "blue"];

output = "";

for(var counter = 0; counter < array.length; counter++)
{
	output += array[counter] + "<br>"
}

document.getElementById('output').innerHTML = output;
