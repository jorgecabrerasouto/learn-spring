package co.com.jorgecabrerasouto.ls.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.jorgecabrerasouto.ls.persitence.repository.Impl.ProjectRepositoryImpl;

@Configuration
public class PersistanceConfig {
    
    @Bean
    public ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }

}
