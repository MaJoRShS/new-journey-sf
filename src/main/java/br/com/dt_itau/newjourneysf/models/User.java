package br.com.dt_itau.newjourneysf.models;

import br.com.dt_itau.newjourneysf.entities.UserEntity;

public class User {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    public UserEntity toEntity(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(this.id);
        userEntity.setName(this.name);
        userEntity.setEmail(this.email);
        userEntity.setPhone(this.phone);
        userEntity.setPassword(this.password);

        return userEntity;
    }
}
