
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Year', 'Player A', 'Player B', 'Player C', 'Player D', 'Player E', 'Player F'],
		['2001', 2, 10, 12, 17, 7, 25],
		['2002', 5, 15, 15, 19, 6, 24],
		['2003', 3, 12, 19, 18, 7, 28],
		['2004', 7, 12, 27, 16, 9, 35],
		['2005', 3, 17, 28, 17, 3, 32],
		['2006', 6, 12, 35, 19, 2, 30],
		['2007', 3, 13, 28, 14, 6, 35],
		['2008', 1, 15, 26, 16, 4, 32],
		['2009', 2, 22, 32, 20, 2, 28],
		['2010', 5, 17, 17, 13, 7, 40],
		['2011', 0, 12, 18, 16, 8, 43],
		['2012', 4, 10, 15, 17, 9, 35],
		['2013', 3, 11, 12, 19, 3, 32],
		['2014', 4, 15, 10, 12, 5, 30],
		['2015', 2, 12, 11, 15, 2, 41],
		['2016', 5, 10, 19, 17, 6, 32],
		['2017', 2, 11, 16, 20, 8, 35],

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
					ticks: [0, 10, 20, 30, 40, 50]
				},
		pointSize: 5,
		series:
				{
					0: { pointShape: 'circle' },
	                1: { pointShape: 'triangle' },
	                2: { pointShape: 'square' },
	                3: { pointShape: 'diamond' },
	                4: { pointShape: 'star' },
	                5: { pointShape: 'polygon' }
				},
		areaOpacity: 0.1
	};

	var chart = new google.visualization.AreaChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
