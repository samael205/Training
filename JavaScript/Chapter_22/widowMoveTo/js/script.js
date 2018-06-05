
var win;

function openTab()
{
	win = window.open('', 'newWindow', "width=400, height=200");
	win.document.write("<p>This is 'myWindow'</p>");
}

function moveTab()
{
	win.moveTo(500, 200);
	win.focus();
}

function closeTab()
{
	win.close();
}
