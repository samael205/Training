
date = new Date();

day = date.getDay();
output = "";

switch(day)
{
	case 0 :
				output = "Sunday";
				break;

	case 1 :
				output = "Monday";
				break;

	case 2 :
				output = "Tuesday";
				break;

	case 3 :
				output = "Wednesday";
				break;

	case 4 :
				output = "Thursday";
				break;

	case 5 :
				output = "Friday";
				break;

	case 6 :
				output = "Saturday";
				break;
}

document.getElementById('output').innerHTML = "Today is a " + output + "."
