package com.jecesario.generationawsfinalproject.domain.services;

import com.jecesario.generationawsfinalproject.rest.vo.*;

import java.util.List;

public interface PostService {
    PostResponse create(PostRequest postRequest);

    List<PostResponse> list();

    PostResponse findById(Long id);

    PostResponse edit(PostEditRequest postEditRequest, Long id);

    void delete(Long id);
}