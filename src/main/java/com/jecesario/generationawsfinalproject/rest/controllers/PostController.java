package com.jecesario.generationawsfinalproject.rest.controllers;

import com.jecesario.generationawsfinalproject.rest.vo.PostEditRequest;
import com.jecesario.generationawsfinalproject.rest.vo.PostRequest;
import com.jecesario.generationawsfinalproject.rest.vo.PostResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PostController {

    @PostMapping
    ResponseEntity<PostResponse> create(@RequestBody @Valid PostRequest postRequest);

    @GetMapping
    ResponseEntity<List<PostResponse>> list();

    @GetMapping("/{id}")
    ResponseEntity<PostResponse> findById(@PathVariable Long id);

    @PutMapping("/{id}")
    ResponseEntity<PostResponse> edit(@RequestBody @Valid PostEditRequest postEditRequest, @PathVariable Long id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);

}
