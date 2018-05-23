
date = new Date();

if(date.getHours() < 12)
{
	document.getElementById('output').innerHTML = "Good Morning!";
}
else
{
	document.getElementById('output').innerHTML = "Good Afternoon!";
}