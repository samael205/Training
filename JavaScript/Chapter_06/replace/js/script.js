
var string = "Red, green, Blue, Green, Yellow, Green";
document.getElementById('output1').innerHTML = string.replace("Green", "White");

var string = "Red, green, Blue, Green, Yellow, Green";
document.getElementById('output2').innerHTML = string.replace(/GREEN/i, "White");

var string = "Red, green, Blue, Green, Yellow, Green";
document.getElementById('output3').innerHTML = string.replace(/GREEN/ig, "White");
