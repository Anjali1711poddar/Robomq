package MobileMain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ForJdbc.MyJdbcfile;
import DaoClasses.mobileDao;
import MyPojo.Mobile;

public class JdbcMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyJdbcfile.class);

		mobileDao mmobileDao = context.getBean(mobileDao.class);

		System.out.println("List of mobile is:");

 		for (Mobile m :mmobileDao.getAll()) {
			System.out.println(m);
		}

		System.out.println("\nGet mobiles with ID 10");

		Mobile mobileById =mmobileDao.getMobileById(10);
		System.out.println(mobileById);

		System.out.println("\nCreating mobile: ");
		Mobile mobile = new Mobile(41, "iphone", 600000L,4, "Very expensive");
		System.out.println(mobile);
		mmobileDao.createMobile(mobile);
		System.out.println("\nList of mobile is:");

		for (Mobile m :mmobileDao.getAll()) {

			System.out.println(m);
		}

		System.out.println("\nDeleting mobile with ID 12");
		mmobileDao.deleteMobile(mobileById);

		System.out.println("\nUpdate mobile with ID 41");

		Mobile m2 = mmobileDao.getMobileById(401);
		m2.setPrice(670000L);
		mmobileDao.updateMobile(m2);

		System.out.println("\nList of mobile is:");
		for (Mobile m : mmobileDao.getAll()) {
			System.out.println(m);
		}

		context.close();
	}

}
