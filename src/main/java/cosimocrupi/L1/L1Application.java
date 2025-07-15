package cosimocrupi.L1;

import cosimocrupi.L1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class L1Application {

	public static void main(String[] args) {
		SpringApplication.run(L1Application.class, args);
		AnnotationConfigApplicationContext cxt= new AnnotationConfigApplicationContext(L1Application.class);
		Menu m = (Menu) cxt.getBean("Menù");
		m.stampaMenu();
	}

}
