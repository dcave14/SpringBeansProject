package idyll.printerLab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String printerMessage() {
        return "Welcome to the Printer Database!";
    }
}