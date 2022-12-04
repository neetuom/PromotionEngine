package com.online.marketplace;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 *   PromotionEngineApplication Class
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="PromotionAPI",version="3.0", description="Promotion API"))
public class PromotionEngineApplication {

	public static void main(String[] args) {

		SpringApplication.run(PromotionEngineApplication.class, args);
	}

}
