package co.edu.escuelaing;

import java.util.Objects;

import static spark.Spark.port;
import static spark.Spark.*;

public class LoginService {
    public static void main(String[] args) {

        UsersDataBase.addUser("Jordy", "123456");
        UsersDataBase.addUser("Santiago", "654321");

        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystores/ecikeystore.p12", "123456", null, null);

        port(getPort());

        staticFileLocation("public/login");

        get("/sing", (req, res) -> {
            String usr  = req.queryParams("usr");
            String pss  = req.queryParams("pss");
            boolean response = (Objects.equals(UsersDataBase.getPassword(usr), UsersDataBase.encryptSHA256(pss)));
            System.out.println( "----------------->: " + usr + ", " + pss + " -> " + UsersDataBase.getPassword(usr) + " -> " +  UsersDataBase.encryptSHA256(pss));
            if (response) {
                return SecureUrlReader.secureUrlRead("https://localhost:5001/page.html");
            } else {
                return "login failed";
            }
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }

}