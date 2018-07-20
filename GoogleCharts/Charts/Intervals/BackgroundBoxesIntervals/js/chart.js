
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = new google.visualization.DataTable();

	data.addColumn('number', 'x');
	data.addColumn('number', 'values');
	data.addColumn({id:'i0', type:'number', role:'interval'});
	data.addColumn({id:'i1', type:'number', role:'interval'});
	data.addColumn({id:'i2', type:'number', role:'interval'});
	data.addColumn({id:'i2', type:'number', role:'interval'});
	data.addColumn({id:'i2', type:'number', role:'interval'});
	data.addColumn({id:'i2', type:'number', role:'interval'});

	data.addRows([
	
		[1, 100, 90, 110, 85, 96, 104, 120],
		[2, 120, 95, 130, 90, 113, 124, 140],
		[3, 130, 105, 140, 100, 117, 133, 139],
		[4, 90, 85, 95, 85, 88, 92, 95],
		[5, 70, 74, 63, 67, 69, 70, 72],
		[6, 30, 39, 22, 21, 28, 34, 40],
		[7, 80, 77, 83, 70, 77, 85, 90],
		[8, 100, 90, 110, 85, 95, 102, 110]

	]);

    // Focus is the error bars, but boxes are visible in the background.
    var options_boxes_background =
    {
        title:'Background boxes',
        curveType:'function',
        lineWidth: 4,
        series: [{'color': '#1A8763'}],
        intervals:
        {
        	'lineWidth':2,
        	'barWidth': 0.5
        },
        interval:
        {
            'i2':
            {
            	'style':'boxes',
            	'color':'grey',
            	'boxWidth': 2.5,
            	'lineWidth': 0,
            	'fillOpacity': 0.2
            }
        },
        legend: 'none',
    };

	var chart_lines = new google.visualization.LineChart(document.getElementById('chart_lines'));
	chart_lines.draw(data, options_boxes_background);

}