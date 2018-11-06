package com.ncusc.dms.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * 错误配置
 * @author WANGHAO
 * @version 1.0.0
 */
@Configuration
public class ErrorConfig {

    /**
     * 错误页面配置
     * @author WANGHAO
     * @version 1.0.0
     */
    @Configuration
    class ErrorPageConfig implements ErrorPageRegistrar {
        @Override
        public void registerErrorPages(ErrorPageRegistry registry) {
            //404页面映射
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404.html");
            ErrorPage error405Page = new ErrorPage(HttpStatus.METHOD_NOT_ALLOWED, "/error/405.html");
            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500.html");
            registry.addErrorPages(error404Page, error405Page, error500Page);
        }
    }
}

