
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Mon', 20, 28, 38, 45],
		['Tue', 31, 38, 55, 66],
		['Wed', 50, 55, 77, 80],
		['Thu', 77, 77, 66, 50],
		['Fri', 68, 66, 22, 15]

		// Treat first row as data.
	], true);

	var options =
	{
		legend: 'none',
		vAxis:
		{
			textStyle:
			{
				color: 'darkblue',
				fontName: 'Calibri',
				fontSize: 20,
				bold: true,
				italic: false
			},
			title: 'Values',
			titleTextStyle:
			{
				color: 'tomato',
				fontName: 'Calibri',
				fontSize: 30,
				bold: true,
				italic: false
			},
			format:
			{
				format: 'decimal'
			},
			minValue: 0,
			maxValue: 200
		}
	};

	var chart = new google.visualization.CandlestickChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}		
