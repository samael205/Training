
google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Genre', 'Fantasy & Sci-Fi', 'Romance', 'Mystery/ Crime', 'General', 'Western', 'Literature', {role: 'annotation'}],
		['2010', 10, 24, 28, 32, 18, 5, ''],
		['2020', 16, 22, 23, 30, 16, 9, ''],
		['2030', 28, 19, 29, 38, 12, 13, '']

	]);

	var options = 
	{
		title: 'Movies of different Genres',
		legend:
		{
			position: 'top'
		},
		isStacked: 'percent'
	};

	var chart = new google.visualization.ColumnChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
