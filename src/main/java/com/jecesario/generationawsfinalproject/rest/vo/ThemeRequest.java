package com.jecesario.generationawsfinalproject.rest.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class ThemeRequest {

    @Schema(name = "description", defaultValue = "Theme 1", description = "Description of a Theme")
    @Length(min = 3, max = 50, message = "The field 'description' must be between 3 and 50 characters.")
    @NotBlank(message = "The field 'description' is required.")
    private String description;

}
