package co.com.jorgecabrerasouto.ls.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class PersistentConfig {

    @Bean
    public DataSource dataSource() {
        //return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).setName("learn-spring-db").build();
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:learn-spring-db;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("username");
        dataSource.setPassword("password");
        
        return dataSource;
    }
}
