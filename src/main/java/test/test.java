package test;

import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext appCon=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao=(TestDao)appCon.getBean("test");
        testDao.sayHello();
    }
}
