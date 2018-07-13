
google.charts.load("current", 	{
									"packages": ["geochart"],
									"mapsApiKey": "AIzaSyD-9tSrke72PouQMnMX-a7eZSW0jkFMBWY"
								});

google.charts.setOnLoadCallback(drawRegionsMap);

function drawRegionsMap()
{

	var data = google.visualization.arrayToDataTable([

		["Country", "Popularity"],
		["Germany", 200],
		["United States", 300],
		["Brazil", 400],
		["Cannada", 500],
		["France", 600],
		["RU", 700]

	]);

	var options =
	{
		datalessRegionColor: "#eea"
	};

	var chart = new google.visualization.GeoChart(document.getElementById("chartDiv"));

	chart.draw(data, options);

}
