package ch07;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        user.userId = "user";
        user.userPassword = "password";
        user.userName = "name";
        user.userAddress = "address";
        user.phoneNumber = "phoneNumber";

        System.out.println(user.toString());

        UserInfo user2 = new UserInfo("userId", "userPassWord", "userName", "userAdrress", "phoneNumber");
        System.out.println(user2.toString());
    }
}
