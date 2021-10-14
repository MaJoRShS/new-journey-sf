package br.com.dt_itau.newjourneysf.services.impl;

import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.models.User;
import br.com.dt_itau.newjourneysf.repositories.UserRepository;
import br.com.dt_itau.newjourneysf.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public User insert(@RequestBody User obj){
//        obj = userService.insert(obj);
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
//        return User.created(uri).body(obj);
        return null;
    }
//
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
//        userService.delete(id);
//        return User.noContent().build();
    }
//
//
    @PutMapping(value = "/{id}")
    public User update(@PathVariable Long id, @RequestBody User obj){
//        obj = service.update(id, obj);
//        return ResponseEntity.ok().body(obj);
        return  null;
    }
}

