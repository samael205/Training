
google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawChart);

function drawChart()
{

	var data = google.visualization.arrayToDataTable([

		["Quarks", "Leptons", "Gauge Bosons", "Scalar Bosons"],
		[2/3, -1, 0, 0],
		[2/3, -1, 0, null],
		[2/3, -1, 0, null],
		[-1/3, 0, 1, null],
		[-1/3, 0, -1, null],
		[-1/3, 0, null, null],
		[-1/3, 0, null, null]

	]);

	var options =
	{
		title: "Charges of subatomic particles",
		legend: { position: "top", maxLines: 2 },
		colors: ["#5C3292", "#1A8763", "#871B47", "#999999"],
		interpolateNulls: false,
		legend:
		{
			alignment: "start",
			position: "right",
			textStyle:
			{
				color: "darkblue",
				fontName: "calibri",
				fontSize: 12,
				bold: true,
				italic: false
			}
		}
	};
	
	var chart = new google.visualization.Histogram(document.getElementById("chartDiv"));
	chart.draw(data, options);

}
