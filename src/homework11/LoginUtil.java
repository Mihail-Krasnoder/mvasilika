package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoginUtil {
    private static Map<String, String> loginData = new HashMap<>();
    static {
        loginData.put("login1_", "password1_");
        loginData.put("login2_", "password2_");
        loginData.put("login3_", "password3_");
        loginData.put("login4_", "password4_");
        loginData.put("login5_", "password5_");
    }
    static boolean isUserAuthentic(String login, String password, String confirmPassword) {
        isLoginValid(login);
        isPasswordValid(password, confirmPassword);
            try {
                Set<String> keys = loginData.keySet();
                ArrayList<String> values = new ArrayList<>(loginData.values());
                for (String a : values) {
                    password.equals(a);
                    for (String b : keys) {
                        login.equals(b);
                        if (password == a && login == b) {
                            return true;
                        }
                    }
                }
            }
            catch (RuntimeException e) {
                System.out.println("Пароль или логин введен неверно!");
            }
            return false;
    }


    private static void isPasswordValid(String password,String confirmPassword){
        boolean onlyLatinAlphabet = password.matches("^[a-zA-Z][a-zA-Z\\s]+[0-9]+[\\w]");
        if(!onlyLatinAlphabet||password.length()>20|| !password.equals(confirmPassword)){
            throw new RuntimeException("WrongPasswordException");
        }
    }
    private static void isLoginValid(String login){
        boolean onlyLatinAlphabet = login.matches("^[a-zA-Z][a-zA-Z\\s]+[0-9]+[\\w]");
        if(!onlyLatinAlphabet||login.length()>20){
            throw new RuntimeException("WrongLoginException");
        }
    }
}
