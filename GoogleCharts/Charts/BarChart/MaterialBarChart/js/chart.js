
google.charts.load('current', {'packages':['bar']});
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
		title: 'Team Runs Contributions',
		subtitle: 'Runs scored by each player in first five matches.',
		bars: 'vertical'
	};

	var chart = new google.charts.Bar(document.getElementById('chartDiv'));

	chart.draw(data, google.charts.Bar.convertOptions(options));
}
