
google.charts.load("current", {packages: ["gantt"]});
google.charts.setOnLoadCallback(drawChart);

function minutesToMilliseconds(minutes)
{
	return (minutes * 60 * 1000);
}

function drawChart()
{
	var data = new google.visualization.DataTable();

	data.addColumn("string", "Task ID");
	data.addColumn("string", "Task Name");
	data.addColumn("string", "Resource");
	data.addColumn("date", "Start Date");
	data.addColumn("date", "End Date");
	data.addColumn("number", "Duration");
	data.addColumn("number", "Percent Complete");
	data.addColumn("string", "Dependencies");

	data.addRows([

		["toTrain", "Walk to train stop", "walk", null, null, minutesToMilliseconds(5), 100, null],
		["music", "Listen to music", "music", null, null, minutesToMilliseconds(70), 100, null],
		["wait", "Wait for train", "wait", null, null, minutesToMilliseconds(10), 100, "toTrain"],
		["train", "Train ride", "train", null, null, minutesToMilliseconds(45), 75, "wait"],
		["toWork", "Walk to work", "walk", null, null, minutesToMilliseconds(10), 0, "train"],
		["work", "Sit down at desk", null, null, null, minutesToMilliseconds(2), 0, "toWork"]

	]);

	var options =
	{

	}

	var chart = new google.visualization.Gantt(document.getElementById("chartDiv"));
	chart.draw(data, options);
}
