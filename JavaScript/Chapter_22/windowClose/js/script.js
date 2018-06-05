
var win;

function openTab()
{
	win = window.open('', 'newWindow', "width=400, height=200");
	win.document.write("<p>This is 'myWindow'</p>");
}

function closeTab()
{
	win.close();
}
