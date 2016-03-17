package com.cs.hit.learn.thinkinginjava.annotation.create;

import java.util.List;

/**
 * Created by Acceml on 2016/2/14.
 */
public class PassWordUtils {
    @UseCase(id=47,description = "must contain one numeric")
    public boolean validatePassWord(String password) {
        return password.matches("\\w*\\d\\w*");
    }
    @UseCase(id=48)
    public  String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
    @UseCase(id=49,description = "check contain")
    public boolean checkForNewPassword(List<String> prepassword,String password) {
        return !prepassword.contains(password);
    }
}
