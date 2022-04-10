package config;

import bean.Dog;
import bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig {

    @Bean(name = "dog1")
    public Dog getDog() {
        return new Dog();
    }
    @Bean(name = "cat1")
    public Cat getCat() {
        return new Cat();
    }

}
