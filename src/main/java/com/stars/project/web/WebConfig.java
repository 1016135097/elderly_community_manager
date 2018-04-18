package com.stars.project.web;

import com.stars.project.interceptor.LoginInterceptor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public WebConfig(){
        super();
    }

    /**
     * 配置静态资源位置
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/images/**",
                "/css/**",
                "/bootstrap/**","/custom/**","/datatables/**","/fastclick/**","/font-awesome/**","/html/**",
                "/img/**","/summernote/**","/validator/**","/ztree/**","/js/**")
                .addResourceLocations(
                        "classpath:/static/images/",
                        "classpath:/static/css/",
                        "classpath:/static/js/",
                        "classpath:/static/bootstrap/",
                        "classpath:/static/custom/",
                        "classpath:/static/datatables/",
                        "classpath:/static/fastclick/",
                        "classpath:/static/font-awesome/",
                        "classpath:/static/font-html/",
                        "classpath:/static/img/",
                        "classpath:/static/summernote/",
                        "classpath:/static/validator/",
                        "classpath:/static/ztree/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截规则：除了login，其他都拦截判断
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login/index").excludePathPatterns("/login/login");
        super.addInterceptors(registry);
    }

}
