
google.charts.load("current", {"packages":["gauge"]});
google.charts.setOnLoadCallback(drawChart)

function drawChart()
{

	var data = google.visualization.arrayToDataTable([

		["Label", "Value"],
		["Gauge", 80],

	]);

	var options =
	{
		width: 500,
		height: 500,

		majorTicks: ["100", "120", "140", "160", "180", "200"],

		max: 100,
		min: 200
	};

	var chart = new google.visualization.Gauge(document.getElementById("chartDiv"));

	chart.draw(data, options);

	setInterval(function(){

		data.setValue(0, 1, 100 + Math.round(100 * Math.random()));
		chart.draw(data, options);

	}, 1000);

}
