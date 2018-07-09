
google.charts.load("current", {packages: ["corechart"]});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{
	var data = google.visualization.arrayToDataTable([

		["Month", "A", "B", "C", "D", "E", "Average"],
		["2004/01", 165, 938, 522, 998, 450, 614.6],
		["2004/02", 135, 1120, 599, 1268, 288, 682],
		["2004/03", 157, 1167, 587, 807, 397, 623],
		["2004/04", 139, 1110, 615, 968, 215, 609.4],
		["2004/05", 136, 691, 629, 1026, 366, 569.6]

	]);

	var options =
	{
		title: "Monthly Coffee Production by Country",
		vAxis:
		{
			title: "Cups"
		},
		hAxis:
		{
			title: "Month"
		},
		seriesType:	"bars",
		series:
		{
			5:
			{
				type: "line"
			}
		},
		fontName: 'Calibri',
		fontSize: 16
	};

	var chart = new google.visualization.ComboChart(document.getElementById("chartDiv"));

	chart.draw(data, options);
}

