
google.charts.load("current", {"packages":["gauge"]});
google.charts.setOnLoadCallback(drawChart)

function drawChart()
{

	var data = google.visualization.arrayToDataTable([

		["Label", "Value"],
		["Memory", 80],
		["CPU", 55],
		["Network", 68]

	]);

	var options =
	{
		width: 400,
		height: 120,

		redColor: "#e22",
		redFrom: 90,
		redTo: 100,

		minorTicks: 5
	};

	var chart = new google.visualization.Gauge(document.getElementById("chartDiv"));

	chart.draw(data, options);

	setInterval(function(){

		data.setValue(0, 1, 40 + Math.round(60 * Math.random()));
		chart.draw(data, options);

	}, 1000);

	setInterval(function(){

		data.setValue(1, 1, 40 + Math.round(60 * Math.random()));
		chart.draw(data, options);

	}, 1200);

	setInterval(function(){

		data.setValue(2, 1, 40 + Math.round(60 * Math.random()));
		chart.draw(data, options);

	}, 1400);

}
