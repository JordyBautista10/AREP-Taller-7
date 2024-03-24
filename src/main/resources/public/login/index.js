function loadGetMsg() {
    let usr = document.getElementById("usr").value;
    let pss = document.getElementById("pss").value;
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if (this.responseText == "login failed") {
                document.getElementById("prestressing").innerHTML = this.responseText;
            } else {
                // Redirect to Google
                document.documentElement.innerHTML = this.responseText;
                //window.location.href = "https://localhost:5001/page.html?pss=" + this.responseText;
            }
        }
    };
    xhttp.open("GET", "https://ec2-18-207-201-119.compute-1.amazonaws.com:5000/sing?usr=" + usr + "&pss=" + pss, true);
    xhttp.send();
}