function loadGetMsg() {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            window.location.href = this.responseText;
        }
    };
    xhttp.open("GET", "https://ec2-3-81-7-253.compute-1.amazonaws.com:5000/index.html", true);
    xhttp.send();
}