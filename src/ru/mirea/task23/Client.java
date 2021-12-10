package ru.mirea.task23;

public class Client {
    String login,password;
    double money;

    @Override
    public String toString() {
        return "Client{" +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Client(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
