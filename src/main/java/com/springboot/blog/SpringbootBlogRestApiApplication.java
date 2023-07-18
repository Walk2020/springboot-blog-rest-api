package com.springboot.blog;

import com.springboot.blog.entity.Role;
import com.springboot.blog.repository.RoleRepository;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//http://localhost:8080/swagger-ui/index.html
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
public class SpringbootBlogRestApiApplication implements CommandLineRunner {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}


	// the following lines will be executed first when the application starts
	// to insert some data into database
	@Autowired
	private RoleRepository roleRepository;
	@Override
	public void run(String... args) throws Exception {

		Role adminRole = new Role();
		adminRole.setName("ROLE_ADMIN");
		roleRepository.save(adminRole);

		Role userRole = new Role();
		userRole.setName("ROLE_USER");
		roleRepository.save(userRole);

	}
}
