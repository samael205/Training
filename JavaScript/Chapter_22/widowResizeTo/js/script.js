
var win;

function openTab()
{
	win = window.open('', 'newWindow', "width=400, height=200");
	win.document.write("<p>This is 'myWindow'</p>");
}

function resizeTab()
{
	win.resizeTo(250, 250);
	win.focus();
}

function closeTab()
{
	win.close();
}
