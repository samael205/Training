
var array = 
[
	{name:"A", value:3},
	{name:"B", value:2},
	{name:"C", value:1},
];

var sortedArray = array.sort(function(a, b){return (a.value - b.value)});


var output = "[<br>";

for(var counter = 0; counter < sortedArray.length - 1; counter++)
{
	output += '{name:"' + sortedArray[counter].name + '", value:' + sortedArray[counter].value + '},<br>'
}
output += '{name:"' + sortedArray[sortedArray.length - 1].name + '", value:' + sortedArray[sortedArray.length - 1].value + '}<br>'

output += "]"

document.getElementById('output').innerHTML = output;
