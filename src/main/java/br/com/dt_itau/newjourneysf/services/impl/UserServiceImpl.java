package br.com.dt_itau.newjourneysf.services.impl;

import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.models.User;
import br.com.dt_itau.newjourneysf.repositories.UserRepository;
import br.com.dt_itau.newjourneysf.services.UserService;
import br.com.dt_itau.newjourneysf.services.exceptions.NotFoundXeXe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsersAll() {
        List<User> userList = this.userRepository.findAll().stream().map(r -> r.toModel()).collect(Collectors.toList());
        return userList;
    }

    public UserEntity getUsersById(Long id) {
        var userEntity = userRepository.findById(id);
        return userEntity.orElseThrow(() -> new NotFoundXeXe(id));
    }

    public User insert(User obj) {
//        return userRepository.save(obj);
        return null;
    }

    public void delete(Long id) {
//        try {
//            userRepository.deleteById(id);
//        }catch (EmptyResultDataAccessException e){
//            throw new ResourceNotFoundException(id);
//        }catch (DataIntegrityViolationException e){
//            throw new DatabaseException(e.getMessage());
//        }
    }

    public User update(Long id, User obj) {
//        try {
//            User entity = userRepository.getOne(id);
//            updataData(entity, obj);
//            return userRepository.save(entity);
//        }catch (EntityNotFoundException e){
//            throw new ResourceNotFoundException(id);
//        }
        return null;
    }

    private void updataData(User entity, User obj) {
//        entity.setName(obj.getName());
//        entity.setEmail(obj.getEmail());
//        entity.setPhone(obj.getPhone());

    }

}

