package com.jecesario.generationawsfinalproject.rest.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jecesario.generationawsfinalproject.domain.models.Theme;
import com.jecesario.generationawsfinalproject.domain.models.User;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class PostResponse {

    private Long id;
    private String title;
    private String text;
    private OffsetDateTime date;

    private UserResponse user;
    private ThemeResponse theme;
}
