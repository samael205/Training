
google.charts.load('current', {'packages':['bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Players', 'Runs', 'Wickets'],
		['Sachin Tendulkar', 18426, 154],
		['Virender Sehwag', 8273, 96],
		['Rahul Dravid', 10889, 4],
		['Sourav Ganguly', 11363, 100],
		['Kapil Dev', 3783, 253]					

	]);

	var options = 
	{					
		width: 800,
		chart:
				{
					title: 'Indian Cr-icket Players',
					subtitle: ''
				},
		bars: 'horizontal',
		series: 
				{
					0: {axis: 'Runs'},
					1: {axis: 'Wickets'}
				},
		axes:
				{
					x:
						{
							Runs: {side: 'top', label: 'Runs'},
							Wickets: {label: 'Wickets'}
						}
				},
		hAxis: {format: 'decimal'}
	};

	var chart = new google.charts.Bar(document.getElementById('chartDiv'));

	chart.draw(data, google.charts.Bar.convertOptions(options));
}
