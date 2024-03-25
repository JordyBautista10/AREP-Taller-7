package co.edu.escuelaing;

import static spark.Spark.*;

public class WebService {
    public static void main(String[] args) {


        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystores/ecikeystore.p12", "123456", null, null);

        port(getPort());
        staticFileLocation("public/page");

        // Si bien no tiene uso, es necesario para correr por comando esta clase de lo contrario termina la ejecucion
        get("/Hello", (req, res) -> "To invoke works");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5001;
    }

}