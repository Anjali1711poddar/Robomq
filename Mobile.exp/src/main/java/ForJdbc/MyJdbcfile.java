package ForJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;




@Configuration

@ComponentScan({"ForJdbc","DaoClasses","MobileMain", "MyPojo"})

public class MyJdbcfile {

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/MyDatabase");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("Anjali@17");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
	}
}
