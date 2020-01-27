package DaoClasses;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import MyPojo.Mobile;
import MyPojo.MobileMapper;

@Component
public class MobileDaoImp  implements mobileDao{

	
	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_MOBILE= "select * from Mobile where id = ?";
	private final String SQL_DELETE_MOBILE = "delete from Mobile where id = ?";
	private final String SQL_UPDATE_MOBILE = "update Mobile set id = ?, name = ?, price  = ? , quantity = ? , description = ? where id = ?";
	private final String SQL_GET_ALL = "select * from Mobile";
	private final String SQL_INSERT_MOBILE= "insert into Mobile(id, name,price, quantity,description) values(?,?,?,?,?)";

	@Autowired
	
	public MobileDaoImp(DataSource dataSource) {
		
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Mobile getMobileById(int id) {
		return jdbcTemplate.queryForObject(SQL_FIND_MOBILE, new Object[] { id }, new MobileMapper());
	}

	public List<Mobile> getAll() {
		return jdbcTemplate.query(SQL_GET_ALL, new MobileMapper());
	}

	public boolean deleteMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_DELETE_MOBILE, mobile.getId()) > 0;
	}

	public boolean updateMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_UPDATE_MOBILE, mobile.getName(), mobile.getId(), mobile.getDescription(), mobile.getPrice(),mobile.getQuantity()
			) > 0;
	}

	public boolean createMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_INSERT_MOBILE, mobile.getId(), mobile.getName(),mobile.getPrice(),mobile.getQuantity(),mobile.getDescription()
				) > 0;
	}
}
