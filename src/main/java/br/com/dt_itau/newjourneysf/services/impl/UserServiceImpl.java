package br.com.dt_itau.newjourneysf.services.impl;

import br.com.dt_itau.newjourneysf.controllers.parameters.UserParameter;
import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.models.User;
import br.com.dt_itau.newjourneysf.repositories.UserRepository;
import br.com.dt_itau.newjourneysf.services.UserService;
import br.com.dt_itau.newjourneysf.services.exceptions.NotFoundXeXe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUsersAll() {
        return this.userRepository.findAll().stream().map(UserEntity::toModel).collect(Collectors.toList());
    }

    @Override
    public User getUsersById(Long id) {
        var userById = userRepository.findById(id);
        userById.get();
        return userById.get().toModel();
    }

    @Override
    public UserParameter insert(UserParameter obj) {
        UserEntity userEntity = obj.toModel().toEntity();
        userRepository.save(userEntity);
        return obj;
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

    public UserParameter update(Long id, UserParameter obj) {
        try {
            UserEntity entity = userRepository.getOne(id);
            updataData(entity, obj.toModel());
            userRepository.save(entity);
            return obj;
        }catch (EntityNotFoundException e){
            throw new NotFoundXeXe(id);
        }
    }

    private void updataData(UserEntity entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }
}

