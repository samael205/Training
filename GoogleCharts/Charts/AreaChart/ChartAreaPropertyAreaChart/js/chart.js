
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
					minValue: 0
				},
		chartArea:
				{
					backgroundColor: '#EEE',
					left: 300,
					top: 50,
					width: '50%',
					height: '50%'
				}
	};

	var chart = new google.visualization.AreaChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
