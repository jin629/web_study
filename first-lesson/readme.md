# Frist-lesson

### 一. Inversion of Control (控制反转)
-----
#### 1.什么是控制反转
- 摆脱过度依赖产生的缺点
- 不再使用 `new` 创建一个新的对象
	- 因为这种方法提高了耦合性 (coupling)
	- 当更改一个类时，依赖于此类的类不再需要修改
	- 把控制权交给spring容器
	
#### 2.Bean
- 一个类
- 被spring容器所控制
- 当需使用相对应的bean时，spring会自动查找到

#### 3.Application Context
- 使用于 /DemoApplication.java 里
```java
private static ApplicationContext context;
context.containsBeans(String beanName);		//renturn true or false, 判断bean是否在spring容器中
context.getBean(String beanName);		//return object, 获取一个bean到的值
```

### 二. Dependency Injection （依赖注入）
----
#### 1.什么是dependecy
- 如果当创建 A类时，必须同时创建B。我们可以说A类依赖B类
```java
public class Company() {
	private Person manager;
	public Company(Person p){
		this.person = p;
	}
}
```

#### 2.什么是dependency injection
- 使用依赖注入后，我们将不再关心 `person` 
	- 何时创建
	- 在哪创建
- 因为Spring boot 会自导倒入

### 三. Anotation
####1. `@Bean`
- 必须使用于 `@Configuration`下
- 可通过 `@Bean ("manager")` 手动设置名字

#### 2. `@Autowired`
- 通过自动绕入/输入， 实现依赖注入
- 可使用于三种情况下
	- in Property
```java
public class A{
		@Autowried
		private B b;
}
```
	- in Setter
	```java
public class A{
	@Autowried
		public setB (B b){
			this.b=b;
		}
}
```
	
	- in Constructor
	```java
public class A{
	@Autowried
	Public A(B b){
			this.b=b;
		}
}
```
	
#### 3. `@Value`
- 手动设置属性值
```java
 @Value("Google")
    private String companyName;	 //in this case, companyName =  "Google"
```

#### 4. `@Qualifier("BeanName")`
- 当拥有多个bean时，可手动注入bean
- 和 `@Autowired` 配套使用
```java
@Autowired //自动去spring容器里找到相匹配的的bean
    public Company(@Qualifier("manager") Person manager){
        this.manager = manager;
    }
```

#### 5. `@Component`
- 和`@Bean`一样
- 不过必须用于类里
- 可通过 `@Component ("person")` 手动设置名字
- 带有`@Component`的类会自动创建并加入到spring容器中

#### 6. `@Configuration`
```java
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
```




