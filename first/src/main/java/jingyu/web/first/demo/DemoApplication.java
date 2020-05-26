package jingyu.web.first.demo;

import jingyu.web.first.demo.bo.Company;
import jingyu.web.first.demo.bo.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.awt.peer.CanvasPeer;

@SpringBootApplication
public class DemoApplication {

    private  static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(DemoApplication.class, args);

        //Person p =new Person( "jingyu",18);
        //System.out.println(p);
        //Company c=new Company(p);       //控制反转
        //System.out.println(c);

        System.out.println(context.containsBean("manager"));      //查看bean-"manager"是否存在， return true/false
        System.out.println(context.containsBean("Company"));
        Company c = (Company)context.getBean("Company");
        System.out.println(c);





    }

}
