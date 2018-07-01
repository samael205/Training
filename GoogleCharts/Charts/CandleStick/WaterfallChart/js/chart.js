
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Mon', 28, 28, 38, 38],
		['Tue', 38, 38, 55, 55],
		['Wed', 55, 55, 77, 77],
		['Thu', 77, 77, 66, 66],
		['Fri', 66, 66, 22, 22]

		// Use row 1 as data.
	], true);

	var options =
	{
		legend: 'none',
		bar: 
		{
			groupWidth: '100%'
		},
		candlestick:
		{
			fallingColor:
			{
				strokeWidth: 0,
				fill: '#a52714'
			},
			risingColor:
			{
				strokeWidth: 0,
				fill: '#0f9d58'
			}
		}
	};

	var chart = new google.visualization.CandlestickChart(document.getElementById('chartDiv'));
	chart.draw(data, options);
}

