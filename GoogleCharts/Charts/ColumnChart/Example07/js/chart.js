
google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = new google.visualization.DataTable();

	data.addColumn('timeofday', 'Time of Day');
	data.addColumn('number', 'Motivation Level');
	data.addColumn('number', 'Energy Level');

	data.addRows([

		[{v: [8, 0, 0], f:'8 am'}, 1, 0.75],
		[{v: [9, 0, 0], f:'9 am'}, 2, 1.5],
		[{v: [10, 0, 0], f:'10 am'}, 3, 2.25],
		[{v: [11, 0, 0], f:'11 am'}, 4, 3],
		[{v: [12, 0, 0], f:'12 pm'}, 5, 3.75],
		[{v: [13, 0, 0], f:'1 pm'}, 6, 4.50],
		[{v: [14, 0, 0], f:'2 pm'}, 7, 5.25],
		[{v: [15, 0, 0], f:'3 pm'}, 8, 6],
		[{v: [16, 0, 0], f:'4 pm'}, 9, 6.75],
		[{v: [17, 0, 0], f:'5 pm'}, 10, 7.5],

	]);

	var options = 
	{
		title: 'Motivation and Energy level throughout the day',
		colors: ['tomato', 'green'],
		focusTarget: 'category',
		trendlines:
		{
			0: {type: 'linear', linewidth: 5, opacity: 0.3},
			1: {type: 'polynomial', degree: 3, linewidth: 10, opacity: 0.3}
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

	var chart = new google.visualization.ColumnChart(document.getElementById('chartDiv'));

	chart.draw(data, options);
}
