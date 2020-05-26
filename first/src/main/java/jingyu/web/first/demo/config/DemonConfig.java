package jingyu.web.first.demo.config;

import jingyu.web.first.demo.bo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemonConfig {

    @Bean //被spring容器控制
    public Person person(){ //注册一个person bean which is named jingyu
        return new Person("Jingyu", 18);
    }

}
