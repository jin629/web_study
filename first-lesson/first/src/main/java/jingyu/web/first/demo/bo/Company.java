package jingyu.web.first.demo.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Company")
public class Company {
    private Person manager;

    @Value("Google")
    private String name;

    @Autowired //自动去spring容器里找到相匹配的的bean
    public Company(@Qualifier("manager") Person manager){
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }
}
