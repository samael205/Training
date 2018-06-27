
google.charts.load('current', {packages:['calendar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var dataTable = new google.visualization.DataTable();

	dataTable.addColumn({type: 'date', id:'Date'});
	dataTable.addColumn({type: 'number', id:'Attendance'});

	dataTable.addRows([

		[new Date(2012, 3, 13), 37032],
		[new Date(2012, 3, 14), 24673],
		[new Date(2012, 3, 15), 32782],
		[new Date(2012, 3, 16), 17847],
		[new Date(2012, 3, 17), 34787],

		[new Date(2013, 9, 4), 15232],
		[new Date(2013, 9, 5), 38255],
		[new Date(2013, 9, 12), 12498],
		[new Date(2013, 9, 13), 26983],
		[new Date(2013, 9, 19), 21589],
		[new Date(2013, 9, 23), 25893],
		[new Date(2013, 9, 24), 31523],
		[new Date(2013, 9, 30), 38232]

	]);

	var chart = new google.visualization.Calendar(document.getElementById('chartDiv'));

	var options = 
	{
		title: 'Stadium Attendance',
		height: 350
	};

	chart.draw(dataTable, options);
}
