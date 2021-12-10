package ru.mirea.task20.Task;

public class User {
    String name,login,password;
    String zone;

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public User(String name, String login, String password, String zone) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.zone=zone;
    }
    public boolean checkLogin(String login)
    {
        return this.login.equals(login);
    }
    public boolean checkPassword(String password)
    {
        return this.password.equals(password);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
