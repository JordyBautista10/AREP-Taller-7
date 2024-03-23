function loadGetMsg() {
    let usr = document.getElementById("usr").value;
    let pss = document.getElementById("pss").value;
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if (this.responseText == "logging incorrecto") {
                document.getElementById("prestressing").innerHTML = this.responseText;
            } else {
                document.documentElement.innerHTML = this.responseText;
            }
        }
    };
    xhttp.open("GET", "https://localhost:5000/sing?usr=" + usr + "&pss=" + pss, true);
    xhttp.send();
}