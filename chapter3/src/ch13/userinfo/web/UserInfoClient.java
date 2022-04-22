package ch13.userinfo.web;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DB-TYPE");

        UserInfo user = new UserInfo();
        user.setUserId("1750777");
        user.setPassword("1234");
        user.setUserName("Byeon");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }else if (dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }else{
            System.out.println("DB error");
            return;
        }

        userInfoDao.insertUserInfo(user);
        userInfoDao.updateUserInfo(user);
        userInfoDao.deleteUserInfo(user);
    }
}

