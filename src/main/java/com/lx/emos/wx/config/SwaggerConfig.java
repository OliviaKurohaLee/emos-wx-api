package com.lx.emos.wx.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration  //加进配置
@EnableSwagger2 //  开启swagger
public class SwaggerConfig {

    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2);
    }










    //在swagger中开启jwt
//    @Bean
//    public Docket creatRestApi(){
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//        apiInfoBuilder.title("Emos在线办公系统");
//        ApiInfo info = apiInfoBuilder.build();
//        docket.apiInfo(info);
//
//        ApiSelectorBuilder select = docket.select();
//        select.paths(PathSelectors.any());
//        select.apis(RequestHandlerSelectors.withClassAnnotation(ApiOperation.class));
//         docket = select.build();
//
//        ApiKey apiKey = new ApiKey("token","token","he  ader");
//
//        List<ApiKey> apiKeys = new ArrayList<>();
//        apiKeys.add(apiKey);
//        docket.securitySchemes(apiKeys);
//        AuthorizationScope authorizationScope = new AuthorizationScope("global","accessEverything");
//        AuthorizationScope[] scopes={authorizationScope};
//        SecurityReference reference = new SecurityReference("token",scopes);
//        List refList = new ArrayList();
//        refList.add(reference);
//        SecurityContext context = SecurityContext.builder().securityReferences(refList).build();
//        List cxt = new ArrayList<>();
//        cxt.add(context);
//        docket.securityContexts(cxt);
//
//        return docket;
//
//
//    }




}
