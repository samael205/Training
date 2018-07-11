
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

		redFrom: 90,
		redTo: 100,

		yellowFrom: 75,
		yellowTo: 90,

		minorTicks: 5,

		animation:
		{
			easing: "out",
			duration: 1000
		}
	};

	var chart = new google.visualization.Gauge(document.getElementById("chartDiv"));

	chart.draw(data, options);

	setInterval(function(){

		data.setValue(0, 1, 40 + Math.round(60 * Math.random()));
		chart.draw(data, options);

	}, 3000);

	setInterval(function(){

		data.setValue(1, 1, 40 + Math.round(60 * Math.random()));
		chart.draw(data, options);

	}, 3000);

	setInterval(function(){

		data.setValue(2, 1, 40 + Math.round(60 * Math.random()));
		chart.draw(data, options);

	}, 3000);

}

