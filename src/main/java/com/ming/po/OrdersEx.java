package com.ming.po;

/**
 * @author epochong
 * @date 2019/8/10 14:50
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class OrdersEx {

    private String username;

    private String sex;

    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrdersEx{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
