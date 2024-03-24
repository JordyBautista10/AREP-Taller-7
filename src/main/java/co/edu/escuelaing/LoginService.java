package co.edu.escuelaing;

import spark.Session;

import java.util.Objects;

import static spark.Spark.port;
import static spark.Spark.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
                return SecureUrlReader.secureUrlRead("https://ec2-54-209-88-253.compute-1.amazonaws.com:5001/page.html");
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