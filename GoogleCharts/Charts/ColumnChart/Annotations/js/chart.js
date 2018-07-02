
google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = new google.visualization.arrayToDataTable([

		['Element', 'Density', {role: 'style'}, {role: 'annotation'}],
		['Copper', 8.94, '#b87333', 'Cu'],
		['Silver', 18.49, 'silver', 'Ag'],
		['Gold', 19.38, 'gold', 'Au'],
		['Platinum', 21.45, '#e5e4e2', 'Pt']

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

	var chart = new google.visualization.ColumnChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}

