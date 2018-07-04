
google.charts.load('current', {packages: ['bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = new google.visualization.arrayToDataTable([

		['Year', 'Sales', 'Expenses', 'Profit'],
		['2014', 1000, 400, 200],
		['2015', 1170, 460, 250],
		['2016', 660, 1120, 300],
		['2017', 1030, 540, 350]

	]);

	var options =
	{
		chart:
		{
			title: 'Company Performance',
			subtitle: 'Sales, Expenses, and Profit: 2014-2017'
		},		
		fontName: 'Calibri',
		fontSize: 16
	};

	var chart = new google.charts.Bar(document.getElementById('chartDiv'));

	chart.draw(data, google.charts.Bar.convertOptions(options));
}
