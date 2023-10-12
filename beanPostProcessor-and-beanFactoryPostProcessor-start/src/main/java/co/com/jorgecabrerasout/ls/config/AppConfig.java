package co.com.jorgecabrerasout.ls.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.jorgecabrerasout.ls.persistence.model.BeanA;

@Configuration
public class AppConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

}
