package co.com.jorgecabrerasouto.ls.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import co.com.jorgecabrerasouto.ls.persistence.model.BeanA;
import co.com.jorgecabrerasouto.ls.persistence.model.BeanB;
import co.com.jorgecabrerasouto.ls.persistence.model.BeanC;

@Configuration
public class AppConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    @Bean(initMethod = "initialize")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean(destroyMethod = "destroy")
    @Scope(value = "singleton")
    public BeanC beanC() {
        return new BeanC();
    }
}
