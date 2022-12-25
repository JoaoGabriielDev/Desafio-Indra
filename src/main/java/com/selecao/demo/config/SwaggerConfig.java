package com.selecao.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket ApiDesafioIndra() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.selecao.demo")).paths(PathSelectors.regex("/.*"))
                .build().apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo("API VERDE", "API DESAFIO", "1.0", "Termos para ServiÃ§o",
                new Contact("https://www.linkedin.com/in/joao-gabrielldev/", "(83) 98658-4839", "joaogabrielldev@gmail.com"),
                "Apache License Version 2.0", "https://www.apache.org/licesen.html", new ArrayList<>());

        return apiInfo;
    }
}

