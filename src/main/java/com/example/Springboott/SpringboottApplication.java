package com.example.Springboott;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
 
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class SpringboottApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottApplication.class, args);
	}

        
        
        
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://app-portfolio-8bd8b.web.app").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
        
        
     
}
