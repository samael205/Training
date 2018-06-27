
google.charts.load('current', {packages:['calendar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var dataTable = new google.visualization.DataTable();

	dataTable.addColumn({type: 'date', id:'Date'});
	dataTable.addColumn({type: 'number', id:'Goal Difference'});

	dataTable.addRows([

		[new Date(2013, 9, 4), 2],
		[new Date(2013, 9, 5), 0],
		[new Date(2013, 9, 7), 4],
		[new Date(2013, 9, 8), -3],
		[new Date(2013, 9, 12), 3],
		[new Date(2013, 9, 13), 0],
		[new Date(2013, 9, 15), -1],
		[new Date(2013, 9, 16), 3],

	]);

	var chart = new google.visualization.Calendar(document.getElementById('chartDiv'));

	var options = 
	{
		title: 'Match Goal Difference',
		height: 350
	};

	chart.draw(dataTable, options);
}
