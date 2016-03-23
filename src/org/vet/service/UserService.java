package org.vet.service;

import org.vet.db.UserDao;
import org.vet.entity.User;

public class UserService {

	public static String FindUser(User u)
	{
		UserDao dao=new UserDao();
		return dao.FindUser(u);
		
	}

}
