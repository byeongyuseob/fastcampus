package ch07;

public class UserInfo {
    public String userId;
    public String userPassword;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo() {
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
