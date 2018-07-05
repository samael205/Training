
google.charts.load('current', {packages: ['bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = new google.visualization.arrayToDataTable([

		['Galaxy', 'Distance', 'Brightness'],
		['Canis Major Dwarf', 8000, 23.3],
		['Sagittarius Dwarf', 24000, 4.5],
		['Ursa Major II Dwarf', 30000, 14.3],
		['Lg. Magellanic Cloud', 50000, 0.9],
		['Bootes I', 60000, 13.1]

	]);

	var options =
	{
		chart:
		{
			title: 'Nearby Galaxies',
			subtitle: 'Distance on the left, Brightness on the right'
		},
		series:
		{
			0: {axis: 'distance'},
			1: {axis: 'brightness'}
		},
		axes:
		{
			y:
			{
				distance:
				{
					label: 'parsecs'
				},
				brightness:
				{
					side: 'right',
					label: 'apparent magnitude'
				}
			}
		},
		vAxis:
		{
			format: '0.00'
		}
	};

	var chart = new google.charts.Bar(document.getElementById('chartDiv'));

	chart.draw(data, google.charts.Bar.convertOptions(options));
}
