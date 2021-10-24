package br.com.dt_itau.newjourneysf.controllers;

import br.com.dt_itau.newjourneysf.controllers.parameters.UserParameter;
import br.com.dt_itau.newjourneysf.controllers.presenters.UserPresenter;
import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.models.User;
import br.com.dt_itau.newjourneysf.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


//    HELLO WORLD
//    @GetMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

//    IMPLEMENTATION DEFAULT USING ONLY MODEL
//    @GetMapping
//    public ResponseEntity<List<Category>> findAll() {
//        List<Category> list = categoryService.getCategoryAll();
//        return ResponseEntity.ok().body(list);
//    }
//
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Category> findById(@PathVariable Long id) {
//        Category obj = categoryService.getCategoryById(id);
//        return ResponseEntity.ok().body(obj);
//    }


//    IMPLEMENTATION USING Presenter
    @GetMapping
    public ResponseEntity<List<UserPresenter>> findAll() {
        var response = this.userService.getUsersAll();
        if (response == null || response.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(response.stream().map(UserPresenter::new)
                .collect(Collectors.toList()), HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<UserPresenter> findById(@PathVariable Long id) {
        var response = this.userService.getUsersById(id);
        return new ResponseEntity<>(new UserPresenter(response), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<UserParameter> insert(@RequestBody UserParameter obj){
        obj = userService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.toModel().getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<UserParameter> update(@PathVariable Long id, @RequestBody UserParameter obj){
        obj = userService.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
