package com.algaworks.brewer.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Beer {
	
	@NotBlank(message = "SKU is required")
	private String sku;
	
	@NotBlank(message = "Name is required")
	@Size(min = 1, max = 50, message = "Name size must less than 50 characters")
	private String name;
	
	@NotBlank(message = "Description is required")
	@Size(min = 1, max = 250,
		message = "Description size must greater than 1 and less than 250 characters")
	private String description;
}
