package com.example.demo1.config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;


import javax.sql.DataSource;

@Configuration
@Profile("cloud")
public class democonfig {

    //@CrossOrigin(origins="*")
    private static final String VCAP_SERVICES = "vcap.services.";
    private static final String DB_NAME = "demo";

    Logger log = LoggerFactory.getLogger(getClass());

    @Bean
    public DataSource dataSource(Environment env) {
        String driver = env.getProperty(VCAP_SERVICES + DB_NAME + ".credentials.driver", "");
        String url = env.getProperty(VCAP_SERVICES + DB_NAME + ".credentials.url", "");
        String user = env.getProperty(VCAP_SERVICES + DB_NAME + ".credentials.user", "");
        String password = env.getProperty(VCAP_SERVICES + DB_NAME + ".credentials.password", "");

        log.info("_______________________________________________________________________");
        log.info("Driver: " + driver + ", url: " + url + ", user: " + user + ", password: " + password);

        return DataSourceBuilder.create().driverClassName(driver).url(url).username(user)
                .password(password).build();
    }
}   