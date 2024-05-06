package dasturlash.uz;

import dasturlash.uz.controller.MainController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // login: adminjon
        // pswd:  12345

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
       MainController mainController = (MainController) applicationContext.getBean("mainController");
       mainController.start();
        
    }

}