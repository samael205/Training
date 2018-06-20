
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Year', 'Player A', 'Player B', 'Player C'],
		['2013', 20, 7, 12],
		['2014', 25, 15, 11],
		['2015', 26, 12, 10],
		['2016', 19, 28, 14],
		['2017', 21, 26, 18]

	]);

	var options = 
	{
		title: 'Team Goal Scoreres',
		hAxis: 
				{
					title: 'Year',
					titleTextStyle:
									{
										color: '#333'
									}
				},
		vAxis:
				{
					minValue: 0,
					ticks: [0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0]
				},
		isStacked: 'relative'
	};

	var chart = new google.visualization.AreaChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
