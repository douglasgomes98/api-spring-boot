package com.example.api.resources;

import com.example.api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1l, "Douglas Matos Gomes", "douglasgomes.rr@gmail.com", "12345678");
        return ResponseEntity.ok().body(user);
    }
}
