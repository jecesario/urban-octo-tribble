package com.jecesario.generationawsfinalproject.rest.controllers.impl;

import com.jecesario.generationawsfinalproject.domain.services.PostService;
import com.jecesario.generationawsfinalproject.domain.services.ThemeService;
import com.jecesario.generationawsfinalproject.rest.controllers.PostController;
import com.jecesario.generationawsfinalproject.rest.controllers.ThemeController;
import com.jecesario.generationawsfinalproject.rest.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostControllerImpl implements PostController {

    private final PostService postService;

    public PostControllerImpl(PostService postService) {
        this.postService = postService;
    }

    @Override
    public ResponseEntity<PostResponse> create(PostRequest postRequest) {
        var postResponse = this.postService.create(postRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(postResponse);
    }

    @Override
    public ResponseEntity<List<PostResponse>> list() {
        var postResponseList = this.postService.list();
        return ResponseEntity.ok(postResponseList);
    }

    @Override
    public ResponseEntity<PostResponse> findById(Long id) {
        var postResponse = this.postService.findById(id);
        return ResponseEntity.ok(postResponse);
    }

    @Override
    public ResponseEntity<PostResponse> edit(PostEditRequest postEditRequest, Long id) {
        var postResponse = this.postService.edit(postEditRequest, id);
        return ResponseEntity.ok(postResponse);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        this.postService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
