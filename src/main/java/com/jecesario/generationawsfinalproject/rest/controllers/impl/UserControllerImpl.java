package com.jecesario.generationawsfinalproject.rest.controllers.impl;

import com.jecesario.generationawsfinalproject.domain.services.UserService;
import com.jecesario.generationawsfinalproject.rest.controllers.UserController;
import com.jecesario.generationawsfinalproject.rest.vo.UserEditRequest;
import com.jecesario.generationawsfinalproject.rest.vo.UserRequest;
import com.jecesario.generationawsfinalproject.rest.vo.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllerImpl implements UserController {

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserResponse> create(UserRequest userRequest) {
        var userResponse = this.userService.create(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }

    @Override
    public ResponseEntity<List<UserResponse>> list() {
        var userResponseList = this.userService.list();
        return ResponseEntity.ok(userResponseList);
    }

    @Override
    public ResponseEntity<UserResponse> findById(Long id) {
        var userResponse = this.userService.findById(id);
        return ResponseEntity.ok(userResponse);
    }

    @Override
    public ResponseEntity<UserResponse> edit(UserEditRequest userEditRequest, Long id) {
        var userResponse = this.userService.edit(userEditRequest, id);
        return ResponseEntity.ok(userResponse);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        this.userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
