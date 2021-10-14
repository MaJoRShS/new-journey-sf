package br.com.dt_itau.newjourneysf.controllers.presenters;

import br.com.dt_itau.newjourneysf.models.User;

public class UserPresenter {

    private String name;
    private String email;
    private String phone;
    private String password;

    public UserPresenter(User user) {
        if (user != null) {
            this.name = user.getName();
            this.email = user.getEmail();
            this.phone = user.getPhone();
            this.password = user.getPassword();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
