
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
										color: 'red',
										fontName: 'Calibri',
										fontSize: 15,
										bold: true,
										italic: false
									}
				},
		vAxis:
				{
					minValue: 0
				},
		legend:
				{
					position: 'top',
					alignment: 'center',
					position: 'top',
					textStyle:
								{
									color: 'darkblue',
									fontName: 'Calibri',
									fontSize: 15,
									bold: true,
									italic: false
								}
				}
	};

	var chart = new google.visualization.AreaChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
