package com.stars.project.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author : mxy
 * @Date : Created on 15:31 2018/3/5
 * @Description: Swagger2Config 配置类
 * @Version : 1.0
 * @Modified By :
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stars.project.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("电影售票项目Swagger调试页面")
                .description("描述：Spring Boot中使用Swagger2构建RESTful APIs")
                .termsOfServiceUrl("http://www.wowker.com/")
                .contact("stars小组")
                .version("1.0")
                .build();
    }
}
