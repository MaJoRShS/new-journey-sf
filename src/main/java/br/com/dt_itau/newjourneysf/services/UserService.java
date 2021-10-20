package br.com.dt_itau.newjourneysf.services;

import br.com.dt_itau.newjourneysf.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsersAll();
    User getUsersById(Long id);
    User insert(User obj);
    void delete(Long id);
    User update(Long id, User obj);


}
