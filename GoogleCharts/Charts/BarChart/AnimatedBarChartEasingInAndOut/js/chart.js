
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Player A', 'Runs'],
		['Match 1', 25],
		['Match 2', 15],
		['Match 3', 35],
		['Match 4', 10],
		['Match 5', 12],
		['Match 6', 27],
		['Match 7', 95],
		['Match 8', 18],
		['Match 9', 45],
		['Match 10', 52]

	]);

	var options = 
	{
		title: 'Player A Runs History',
		width: 600,
		height: 400,
		bar: {groupWidth: '95%'},
		legend: {position: 'none'},
		animation:{startup: true, duration:1000, easing: 'inAndOut'}
	};

	var chart = new google.visualization.BarChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
