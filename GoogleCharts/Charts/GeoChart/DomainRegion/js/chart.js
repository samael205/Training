
google.charts.load("current", 	{
									"packages": ["geochart"],
									"mapsApiKey": "AIzaSyD-9tSrke72PouQMnMX-a7eZSW0jkFMBWY"
								});

google.charts.setOnLoadCallback(drawMarkersMap);

function drawMarkersMap()
{

	var data = google.visualization.arrayToDataTable([

		["City", "Population", "Area"],
		["Bangalore", 12300000, 709],
		["Delhi", 19000000, 1484],
		["Mumbai", 18400000, 603.4],
		["Kolkata", 4500000, 205]

	]);

	var options =
	{
		region: "IN",
		domain: "IN",
		displayMode: "markers",
		colorAxis: {colors: ["green", "blue"]}
	};

	var chart = new google.visualization.GeoChart(document.getElementById("chartDiv"));

	chart.draw(data, options);

}
