
google.charts.load('current', {packages: ['bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = new google.visualization.arrayToDataTable([

		['Move', 'Percentage'],
		['King\'s pawn (e4)', 44],
		['Queen\'s pawn (d4)', 31],
		['Knight to King 3 (Nf3)', 12],
		['Queen\'s bishop pawn (c4)', 10],
		['Other', 3]

	]);

	var options =
	{
		legend:
		{
			position: 'none'
		},
		chart:
		{
			title: 'Chess Opening Moves',
			subtitle: 'Popularity by Percentage'
		},
		axes:
		{
			x:
			{
				0:
				{
					side: 'top',
					label: 'White to Move'
				}
			}
		}
	}

	var chart = new google.charts.Bar(document.getElementById('chartDiv'));

	chart.draw(data, google.charts.Bar.convertOptions(options));
}
