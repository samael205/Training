
google.charts.load('current', {packages: ['corechart']});
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
		title: 'Company Performance',
		subtitle: 'Sales, Expenses, and Profit: 2014-2017',
		animation:
		{
			startup: true,
			duration: 1000,
			easing: 'out'
		}
	};

	var chart = new google.visualization.ColumnChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
