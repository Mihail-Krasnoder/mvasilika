package homework11;

import java.util.HashMap;
import java.util.Map;

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
        try {
            if (password != null||!password.equals(confirmPassword)) throw new WrongPasswordException();
            assert login != null;
            isLoginValid(login);
            isPasswordValid(password);
        } catch (WrongLoginException | WrongPasswordException exception) {
            return false;
        }
        return true;
    }
    private static void isLoginValid(String login) throws WrongLoginException {
        if (!(login.length() > 0 && login.length() < 20)
                || !login.matches("^[a-zA-Z0-9|_]+$")
                || !loginData.containsKey(login)) {
            throw new WrongLoginException("Login is incorrect");
        }
    }
    private static void isPasswordValid(String password) throws WrongPasswordException {
        if (!(password.length() < 20) || (!password.matches("^[a-zA-Z0-9|_]+$"))
        ) {
            throw new WrongPasswordException("Password is incorrect");
        }
    }
}
