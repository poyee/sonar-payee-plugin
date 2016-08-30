document.getElementById("build_number").innerHTML = '#';
var xmlhttp = new XMLHttpRequest();
var url = "<%= widget_properties['JenkinsHost'] %>/job/<%= widget_properties['JenkinsProjectName'] %>/lastBuild/api/json?tree=number"
xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
        	var myArr = JSON.parse(xmlhttp.responseText);
        	myFunction(myArr);
    }
};
xmlhttp.open("Get", url, true);	
xmlhttp.send();

function myFunction(arr)
{
	document.getElementById("build_number").innerHTML = '#' + arr.number;
}