package jingyu.web.first.demo.bo;

public class Company {
    private  String name;
    private  Person manager;

    public Company(Person manager){
        this.name="google";
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
