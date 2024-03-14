package co.edu.escuelaing;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class UsersDataBase {

    private static final HashMap<String, String> DATABASE = new HashMap<>();

    public static void addUser(String name, String password) {
        DATABASE.put(name, encryptSHA256(password));
    }

    public static String getPassword(String name){
        return DATABASE.get(name);
    }


    public static String encryptSHA256(String key) {
        String encryptedKey = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(key.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hash);
            encryptedKey = number.toString(16);
            while (encryptedKey.length() < 64) {
                encryptedKey = "0" + encryptedKey;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return encryptedKey;
    }
}