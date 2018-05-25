
var jsonString = '{"persons": [{"firstName": "Roger", "lastName": "Federer", "country": "Switzerland", "sport": "Tennis"}, {"firstName": "Rafael", "lastName": "Nadal", "country": "Spain", "sport": "Tennis"}, {"firstName": "Miroslav", "lastName": "Klose", "country": "Germany", "sport": "Football"}]}';

var sportsPerson = JSON.parse(jsonString);

sportsPerson = sportsPerson["persons"];

tableID = document.getElementById('table');

output = "";

output += '<tr><th>Sports Person</th><th>Country</th><th>Sport</th></tr>';

for(var person in sportsPerson)
{
	output += '<tr><td>' + sportsPerson[person].firstName + ' ' + sportsPerson[person].lastName + '</td><td>' + sportsPerson[person].country + '</td><td>' + sportsPerson[person].sport + '</td></tr>';
}

tableID.innerHTML = output;
