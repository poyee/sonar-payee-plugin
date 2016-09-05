function displayJson(json) {
    document.getElementById("build_number").innerHTML = "#" + json.number;
    switch(json.result) {
        case "ABORTED":
            document.getElementById("status").setAttribute("src", "/static/poyee/build-aborted-lightgrey.svg");
            break;
        case "FAILURE":
            document.getElementById("status").setAttribute("src", "/static/poyee/build-failing-red.svg");
            break;
        case "SUCCESS":
            document.getElementById("status").setAttribute("src", "/static/poyee/build-passing-brightgreen.svg");
            break;
        case "UNSTABLE":
            document.getElementById("status").setAttribute("src", "/static/poyee/build-unstable-yellow.svg");
            break;
        default:
            document.getElementById("status").setAttribute("src", "/static/poyee/build-unknown-lightgrey.svg");
            break;

        }
}