
google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = new google.visualization.DataTable();

	data.addColumn('timeofday', 'Time of Day');
	data.addColumn('number', 'Motivation Level');
	data.addColumn('number', 'Energy Level');

	data.addRows([

		[{v: [8, 0, 0], f:'8 am'}, 1, 0.25],
		[{v: [9, 0, 0], f:'9 am'}, 2, 0.5],
		[{v: [10, 0, 0], f:'10 am'}, 3, 0.75],
		[{v: [11, 0, 0], f:'11 am'}, 4, 1],
		[{v: [12, 0, 0], f:'12 pm'}, 5, 1.25],
		[{v: [13, 0, 0], f:'1 pm'}, 6, 1.50],
		[{v: [14, 0, 0], f:'2 pm'}, 7, 1.75],
		[{v: [15, 0, 0], f:'3 pm'}, 8, 2],
		[{v: [16, 0, 0], f:'4 pm'}, 9, 2.25],
		[{v: [17, 0, 0], f:'5 pm'}, 10, 2.5],

	]);

	var options = 
	{
		chart:
		{
			title: 'Motivation and Energy level throughout the day',
			subtitle: 'Based on a scale of 1 to 10',
		},
		series:
		{
			0: {axis: 'MotivationLevels'},
			1: {axis: 'EnergyLevels'}
		},
		axes:
		{
			y:
			{
				MotivationLevels: {label: 'Motivation Level (1-10)'},
				EnergyLevels: {label: 'Energy Level (1-100)'}
			}
		},
		hAxis:
		{
			title: 'Time of Day',
			format: 'h:mm a',
			viewWindow:
			{
				min: [7, 30, 0],
				max: [17, 30, 0]
			}
		},
		vAxis:
		{
			title: 'Rating (scale of 1-10)'
		}
	};

	var chart = new google.charts.Bar(document.getElementById('chartDiv'));

	chart.draw(data, google.charts.Bar.convertOptions(options));
}
