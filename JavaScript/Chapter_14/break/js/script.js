
date = new Date();

day = date.getHours();
output = "";

switch(day)
{
	case 0 :
	case 1 :
	case 2 :
	case 3 :
	case 4 :
	case 5 : 
	case 6 :
	case 7 :
	case 8 :
	case 9 :
	case 10 :
	case 11 :
				output = "Good Morning!";
				break;

	case 12 :
	case 13 :
	case 14 :
	case 15 :
	case 16 :
				output = "Good Afternoon!";
				break;

	case 17 :
	case 18 :
	case 19 :
				output = "Good Evening!";
				break;

	case 20 :
	case 21 :
	case 22 :
	case 23 :
				output = "Good Night!";
				break;

}

document.getElementById('output').innerHTML = output;
