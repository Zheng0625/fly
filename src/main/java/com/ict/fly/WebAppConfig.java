package com.ict.fly;


import org.apache.catalina.startup.UserConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(new LoginConfig())
//                .addPathPatterns("/**")   /*拦截所有请求*/
                .addPathPatterns("/index/**")
                .excludePathPatterns("/index/plane");  /*排除拦截的请求*/

        super.addInterceptors(registry);

    }

}