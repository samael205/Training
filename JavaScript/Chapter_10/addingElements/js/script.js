
array = ["red", "green", "blue"];

array.push("yellow");

output = "";

for(var counter = 0; counter < array.length; counter++)
{
	output += array[counter] + "<br>"
}

document.getElementById('output').innerHTML = output;
