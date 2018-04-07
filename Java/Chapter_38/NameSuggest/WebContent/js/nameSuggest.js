var request;

function update()
{
	var firstName = document.getElementById('firstname').value;
	var lastName = document.getElementById('lastname').value;
	
	if(firstName.length + lastName.length >= 2)
	{
		// Create XMLHttpRequest Object
		// For Firefox/ Safari/ Opera/ Google Chrome
		if (window.XMLHttpRequest) 
		{
			request = new XMLHttpRequest();
		}
		// for IE
		else if (window.ActiveXObject)
		{
			request = new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		// concatenate the names as parameter values to url
		var url = "NameSuggest?firstname=" + firstName + "&lastname=" + lastName;
		
		// check server request state and invoke getResponse()
		
		request.onreadystatechange = getResponse;
		
		request.open("GET", url, true);// send request to server
		request.send(null);
	}
	else
	{
		document.getElementById('name_suggest').innerHTML = "";
	}
}

// function to get the response and display in the specific area

function getResponse()
{
	// if request is complete
	if (request.readyState == 4)
	{
		// if target page is found
		if (request.status == 200)
		{
			// write the response text in the div area
			document.getElementById("name_suggest").innerHTML = request.responseText;
		}
	}
}
