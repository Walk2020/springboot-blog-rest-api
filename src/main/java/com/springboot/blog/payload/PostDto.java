package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Schema(
        description = "PostDTO model information"
)
public class PostDto {
    private long id;

    //title should not be null or empty
    //title should have at least 2 characters
    @Schema(
            description = "Blog Post Title"
    )
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters.")
    private String title;

    @Schema(
            description = "Blog Post Description"
    )
    //title should not be null or empty
    //title should have at least 10 characters
    @NotEmpty
    @Size(min = 10, message = "Description should have least 10 characters.")
    private String description;

    @Schema(
            description = "Blog Post Content"
    )
    //title should not be null or empty
    @NotEmpty(message = "Content must not be empty.")
    private String content;

    private Set<CommentDto> comments;

    @Schema(
            description = "Blog Post Category"
    )
    private Long categoryId;
}
