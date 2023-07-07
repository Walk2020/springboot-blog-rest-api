package com.springboot.blog;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot Bolg App REST APIs",
				description = "Spring Boot Bolg App REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Yang",
						email = "zhyants@gmail.com",
						url = "https://www.linkedin.com/in/yang-zhang-cs/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/yang-zhang-cs/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Bolg App Documentation",
				url = "https://github.com/Walk2020/springboot-blog-rest-api"
		)
)
public class SpringbootBlogRestApiApplication {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}

}
