package cn.kgc.tangcco.swagger.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @program: swagger
 * @description: TODO
 * @author: cuihao
 * @create: 2020-01-12 20:08
 * @version: V1.0
 **/
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SPRING_WEB).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("cn.kgc.tangcco.swagger.controller"))
                .paths(PathSelectors.any()).build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("这是XXX的使用的项目").contact(new Contact("aa","https://wwww.baidu.com","3123@163.com"))
                .version("1.0").description("练习").build();
    }
}
