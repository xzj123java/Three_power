package com.xa.UserInfo.vo;

import jdk.nashorn.internal.objects.annotations.Property;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class UserInfoVo implements Serializable {
    //属性为前端需要传的值 ;
    /*前端往后端传值VO*/
    //@NotBlank//不为空
    @Length(min = 2, max = 20, message = "名字不合法")
    String user_name;
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", message = "邮箱地址不合法")
    String user_email;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public UserInfoVo(String user_name, String user_email) {
        this.user_name = user_name;
        this.user_email = user_email;
    }

    public UserInfoVo() {
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                '}';
    }
}
