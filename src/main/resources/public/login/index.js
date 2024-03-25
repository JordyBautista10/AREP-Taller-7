function loadGetMsg() {
    let usr = document.getElementById("usr").value;
    let pss = document.getElementById("pss").value;
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if (this.responseText == "login failed") {
                document.getElementById("prestressing").innerHTML = this.responseText;  // mostrar en el campo texto de login fallido
            } else {
                document.documentElement.innerHTML = this.responseText;         // Cargar la respeusta de la pagian
                // window.location.href = "https://localhost:5001/page.html";      // redireccionar a otra pagina
            }
        }
    };
    xhttp.open("GET", "https://localhost:5000/sing?usr=" + usr + "&pss=" + pss, true);
    xhttp.send();
}