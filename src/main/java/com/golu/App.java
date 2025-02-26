package com.golu;

import com.golu.beans.CartService;
import com.golu.beans.UserService;
import com.golu.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //  ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(context);
        CartService bean = context.getBean("cartService1",CartService.class);
        bean.createCart();


        UserService userBean = context.getBean(UserService.class);
        userBean.createUser();

    }


}
