package com.lotto.lotto.controller.response;

public class AccountResponse {
    private String userName;
    private String password;
    private int salary;

    public  AccountResponse() {}

    public AccountResponse(String userName, String password, int salary) {
        this.userName = userName;
        this.password = password;
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
