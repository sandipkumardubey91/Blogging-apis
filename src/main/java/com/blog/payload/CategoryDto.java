package com.blog.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
	@NotBlank
	@Size(min = 4, max = 50, message="Minimum size = 4 characters and Maximum = 50 characters")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 4, max = 1000,message="Minimum size = 4 characters and Maximum = 1000 characters")
	private String categoryDescription;
}
