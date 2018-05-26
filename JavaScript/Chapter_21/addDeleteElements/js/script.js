
counter = 0;

function rowOperation(operation)
{

	var tableElement = document.getElementById('myTable');

	if(operation == "push")
	{
		var createRow = function()
		{
			var inputField = document.createElement('input');
			inputField.setAttribute('type', 'text');
			inputField.setAttribute('id', 'inputField_' + counter);

			var tableRow = document.createElement('tr');
			tableRow.setAttribute('id', 'tableRow_' + counter);

			var tableRowCell1 = document.createElement('td');
			tableRowCell1.innerHTML = counter;

			var tableRowCell2 = document.createElement('td');
			tableRowCell2.appendChild(inputField);

			tableRow.appendChild(tableRowCell1);
			tableRow.appendChild(tableRowCell2);

			tableElement.appendChild(tableRow);

			counter++;
		};

		createRow();
	}
	else if(operation == "pop")
	{
		if(counter == 0)
		{
			return null;
		}
		else
		{
			var deleteRow = function()
			{
				counter--;
				var deleteRow = document.getElementById('tableRow_' + counter);
				tableElement.removeChild(deleteRow);
			};

			deleteRow();
		}
	}
	else
	{
		return null;
	}
}

function pushRow()
{
	rowOperation('push');
}

function popRow()
{
	rowOperation('pop');
}
