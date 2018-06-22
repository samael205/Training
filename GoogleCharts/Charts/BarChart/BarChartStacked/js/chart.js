
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Players', 'A', 'B', 'C', 'D', 'E'],
		['Match 1', 10, 30, 15, 5, 2],
		['Match 2', 35, 18, 2, 10, 5],
		['Match 3', 28, 27, 4, 12, 6],
		['Match 4', 3, 29, 10, 9, 3],
		['Match 5', 53, 18, 15, 2, 12],

	]);

	var options = 
	{
		title: 'Team Runs History',
		width: 600,
		height: 400,
		bar: {groupWidth: '75%'},
		legend: {position: 'top'},
		isStacked: true
	};

	var chart = new google.visualization.BarChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
