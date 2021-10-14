package br.com.dt_itau.newjourneysf.services;
import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.models.User;

import java.util.List;

public interface UserService {

    public List<User> getUsersAll();
    public User getUsersById(Long id);
    public User insert(User obj);
    public void delete(Long id);
    public User update(Long id, User obj);


}
