
date = new Date();

hour = date.getHours();

if(hour < 12)
{
	document.getElementById('output').innerHTML = "Good Morning!";
}
else if(hour < 17)
{
	document.getElementById('output').innerHTML = "Good Afternoon!";
}
else if(hour < 20)
{
	document.getElementById('output').innerHTML = "Good Evening!";
}
else
{
	document.getElementById('output').innerHTML = "Good Night!";
}
