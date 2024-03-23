function loadGetMsg() {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            window.location.href = this.responseText;
        }
    };
    xhttp.open("GET", "https://localhost:5000/index.html", true);
    xhttp.send();
}