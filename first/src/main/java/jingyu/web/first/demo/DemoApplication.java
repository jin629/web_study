package jingyu.web.first.demo;

import jingyu.web.first.demo.bo.Company;
import jingyu.web.first.demo.bo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.peer.CanvasPeer;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        //Person p =new Person( "jingyu",18);
        //System.out.println(p);
        //Company c=new Company(p);       //控制反转
        //System.out.println(c);



    }

}
