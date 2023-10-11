package co.com.jorgecabrerasouto.ls.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baeldung.ls.persistence.repository.impl.ProjectRepositoryImpl;

@Configuration
public class PersistanceConfig {
    
    @Bean
    public ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }

}
