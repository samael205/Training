
var sportsPerson = 
{
	firstName : 'Roger',
	lastName : 'Federer',

	fullName : function()
	{
		return (this.firstName + " " + this.lastName);
	}
};


window.onload = function()
{							
	document.getElementById('fullname').innerHTML = sportsPerson.fullName();
}
