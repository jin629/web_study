package jingyu.web.first.demo.config;

import jingyu.web.first.demo.bo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemonConfig {

    @Bean ("manager") //<- 手动设置Bean的名字  //被spring容器控制
    public Person m(){ //注册一个person bean which is named jingyu
        return createManager();
    }

    @Bean
    public Person person(){
        return new Person("christina",19);
    }

    private  Person createManager(){   //辅助（person）方法
        return new Person("jingyu",20);
    }
}
