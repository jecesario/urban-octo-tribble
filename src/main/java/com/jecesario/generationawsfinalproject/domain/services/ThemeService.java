package com.jecesario.generationawsfinalproject.domain.services;

import com.jecesario.generationawsfinalproject.rest.vo.ThemeRequest;
import com.jecesario.generationawsfinalproject.rest.vo.ThemeResponse;

import java.util.List;

public interface ThemeService {
    ThemeResponse create(ThemeRequest themeRequest);

    List<ThemeResponse> list();

    ThemeResponse findById(Long id);

    ThemeResponse edit(ThemeRequest themeRequest, Long id);

    void delete(Long id);
}