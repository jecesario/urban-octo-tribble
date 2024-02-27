package com.jecesario.generationawsfinalproject.domain.services;

import com.jecesario.generationawsfinalproject.rest.vo.UserEditRequest;
import com.jecesario.generationawsfinalproject.rest.vo.UserRequest;
import com.jecesario.generationawsfinalproject.rest.vo.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse create(UserRequest userRequest);

    List<UserResponse> list();

    UserResponse findById(Long id);

    void delete(Long id);

    UserResponse edit(UserEditRequest userEditRequest, Long id);

}