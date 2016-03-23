package org.vet.service;

import org.vet.db.CaseDao;
import org.vet.entity.Case;

public class CaseService {
	
	public static boolean createCase(Case c)
	{
		CaseDao dao=new CaseDao();
		return dao.CreateCase(c);
	}

}
