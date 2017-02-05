package classes;


import com.oracle.webservices.internal.api.message.PropertySet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.dialect.SpringStandardDialect;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Thymeleaf properties\
 *
 * */

@Configuration
@EnableWebMvc
@ComponentScan({"classes","com.example"})
public class Config extends WebMvcConfigurerAdapter {

    @Autowired
    private InternalResourceViewResolver viewResolver;
    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        viewResolver=new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("E:\\java\\spring tryes\\RESTHelloWorld\\src\\main\\resources\\templates");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(2);
        viewResolver.setViewNames("*.jsp");
        return viewResolver;
    }

//    @Bean
//    public ThymeleafViewResolver viewResolver(){
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(springTemplateEngine);
//        // NOTE 'order' and 'viewNames' are optional
//        viewResolver.setOrder(1);
//        viewResolver.setViewNames(new String[] {".html", ".xhtml"});
//        return viewResolver;
//    }

    @Override
    public void configureViewResolvers(final ViewResolverRegistry registry) {
        registry.jsp("E:\\java\\spring tryes\\RESTHelloWorld\\src\\main\\resources\\templates", ".jsp");
    }
}

