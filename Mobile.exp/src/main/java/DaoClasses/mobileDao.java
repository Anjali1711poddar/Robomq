package DaoClasses;

import java.util.List;

import MyPojo.Mobile;



public interface mobileDao {
	
	Mobile getMobileById(int id);

	List<Mobile> getAll();

	boolean deleteMobile(Mobile mobile);

	boolean updateMobile(Mobile mobile);

	boolean createMobile(Mobile mobile);


}
