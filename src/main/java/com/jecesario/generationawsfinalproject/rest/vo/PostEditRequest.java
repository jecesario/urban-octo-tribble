package com.jecesario.generationawsfinalproject.rest.vo;

import com.jecesario.generationawsfinalproject.domain.models.Theme;
import com.jecesario.generationawsfinalproject.domain.models.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class PostEditRequest {

    @Schema(name = "title", defaultValue = "My First Post", description = "Title of a post")
    @Length(min = 3, max = 50, message = "The field 'title' must be between 3 and 50 characters.")
    private String title;

    @Schema(name = "text", defaultValue = "Loren Ipsum", description = "Text of a post")
    @Length(min = 10, max = 255, message = "The field 'text' must be between 3 and 50 characters.")
    private String text;

    @NotBlank(message = "The field 'user' is required.")
    private User user;

    @NotBlank(message = "The field 'theme' is required.")
    private Theme theme;
}
