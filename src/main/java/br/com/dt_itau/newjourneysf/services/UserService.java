package br.com.dt_itau.newjourneysf.services;

import br.com.dt_itau.newjourneysf.controllers.parameters.UserParameter;
import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsersAll();
    User getUsersById(Long id);
    UserParameter insert(UserParameter obj);
    void delete(Long id);
    UserParameter update(Long id, UserParameter obj);


}
