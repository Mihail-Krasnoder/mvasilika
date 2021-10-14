package homework11;

import static homework11.LoginUtil.isUserAuthentic;

public class TestLoginUtil {
    public static void main(String[] args) {

        boolean user1 = isUserAuthentic("login1_", "password1_", "password1_");
        boolean user2 = isUserAuthentic("login2_", "password2_", "password2_");
        boolean user3 = isUserAuthentic("login1_", "pasword1_", "pasword1_");
        boolean user4 = isUserAuthentic("logn1_", "passwod1_", "passwod1_");
        boolean user5 = isUserAuthentic("login5_", "password5_", "password5_");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
    }
}
