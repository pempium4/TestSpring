package TestSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        testBean bean = context.getBean("testBean", testBean.class);
        System.out.println(bean.getName());
        context.close();
    }
}
