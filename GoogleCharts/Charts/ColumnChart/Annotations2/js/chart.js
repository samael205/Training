
google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = new google.visualization.arrayToDataTable([

		['Element', 'Density', {role: 'style'}],
		['Copper', 8.94, '#b87333'],
		['Silver', 18.49, 'silver'],
		['Gold', 19.38, 'gold'],
		['Platinum', 21.45, '#e5e4e2']

	]);

	var options = 
	{
		title: 'Density of Precious Metals, in g/cm^3',
		hAxis:
		{
			title: 'Metals'
		},
		legend:
		{
			position: 'none'
		},
		vAxis:
		{
			title: 'Density (g/cm^3)'
		}
	};

	var view = new google.visualization.DataView(data);
	view.setColumns([

		0,
		1,
		{
			calc: 'stringify',
			sourceColumn: 1, 
			type: 'string',
			role: 'annotation'
		},
		2

	]);

	var chart = new google.visualization.ColumnChart(document.getElementById('chartDiv'));

	chart.draw(view, options);
}
