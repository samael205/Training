
google.charts.load('current', {'packages':['bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		['Players', 'Runs'],
		['Sachin Tendulkar', 18426],
		['Sourav Ganguly', 11363],
		['Rahul Dravid', 10889],
		['Virender Sehwag', 8273],
		['Kapil Dev', 3783]					

	]);

	var options = 
	{
		title: 'Indian Cricket Players',			
		width: 900,
		legend: {position: 'none'},
		chart:
				{
					title: 'Indian Cricket Players',
					subtitle: 'Runs Scored'
				},
		bars: 'horizontal',
		axes:
				{
					0: {side: 'left', label: 'Runs'}
				},
		bar : 
				{
					groupWidth: '90%'
				},
		hAxis: {format: 'decimal'}
	};

	var chart = new google.charts.Bar(document.getElementById('chartDiv'));

	chart.draw(data, google.charts.Bar.convertOptions(options));
}
