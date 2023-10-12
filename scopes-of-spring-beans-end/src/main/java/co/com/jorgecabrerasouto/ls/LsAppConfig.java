package co.com.jorgecabrerasouto.ls;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import co.com.jorgecabrerasouto.ls.persistence.repository.IProjectRepository;
import co.com.jorgecabrerasouto.ls.persistence.repository.impl.ProjectRepositoryImpl;

@Configuration
public class LsAppConfig {

    @Bean
    @Scope("prototype")
    public IProjectRepository prototypeBean() {
        return new ProjectRepositoryImpl();
    }

}