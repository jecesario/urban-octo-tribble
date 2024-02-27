package com.jecesario.generationawsfinalproject.rest.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserEditRequest {

    @Schema(name = "name", defaultValue = "Morankibe", description = "Name of an user")
    @Length(min = 3, max = 50, message = "The field 'name' must be between 3 and 50 characters.")
    private String name;

    @Schema(name = "email", defaultValue = "kimorango@gmail.com", description = "Email of an user")
    @Pattern(regexp = "^[a-z0-9!#$%&'*+=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$", message = "The 'email' field must be a valid email.")
    private String email;

    @Schema(name = "photo", defaultValue = "default.png", description = "Photo of an user")
    private String photo;

}
