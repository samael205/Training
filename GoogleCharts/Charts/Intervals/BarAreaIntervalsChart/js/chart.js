
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

    var options =
    {
        title:'Bar/area interval chart',
        curveType:'function',
        intervals:
        {
        	'color':'series-color'
        },
        interval:
        {
            'i0':
            {
            	'color': '#4374E0',
            	'style':'bars',
            	'barWidth':0,
            	'lineWidth':4,
            	'pointSize':10,
            	'fillOpacity':1
            },
            'i1':
            {
            	'color': '#E49307',
            	'style':'bars',
            	'barWidth':0,
            	'lineWidth':4,
            	'pointSize':10,
            	'fillOpacity':1
            },
            'i2':
            {
            	'style':'area',
            	'curveType':'function',
            	'fillOpacity':0.3
            }
        },
        legend: 'none',
    };

	var chart_lines = new google.visualization.LineChart(document.getElementById('chart_lines'));
	chart_lines.draw(data, options);

}
