
var increment = (function()
{
	var counter = 0;

	return function()
	{
		return counter+=1;
	};

})();

function update()
{
	document.getElementById('numberOutput').value = increment();
}
