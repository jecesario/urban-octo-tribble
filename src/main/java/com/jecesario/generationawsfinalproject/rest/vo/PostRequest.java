package com.jecesario.generationawsfinalproject.rest.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class PostRequest {

    @Schema(name = "title", defaultValue = "My First Post", description = "Title of a post")
    @Length(min = 3, max = 50, message = "The field 'title' must be between 3 and 50 characters.")
    @NotBlank(message = "The field 'title' is required.")
    private String title;

    @Schema(name = "text", defaultValue = "Loren Ipsum", description = "Text of a post")
    @Length(min = 10, max = 255, message = "The field 'text' must be between 3 and 50 characters.")
    @NotBlank(message = "The field 'text' is required.")
    private String text;

    @NotNull(message = "The field 'user' is required.")
    private Long userId;

    @NotNull(message = "The field 'theme' is required.")
    private Long themeId;
}
