package com.Facebook2.Service;

import com.Facebook2.Dao.FacebookDao;
import com.Facebook2.Dao.FacebookDaoInterface;
import com.Facebook2.Entity.FacebookEmployee;

public class FacebookService implements FacebookServiceInterface{
	
	private FacebookService() {}

	public static FacebookServiceInterface createServiceObject() {
		
		return new FacebookService();
	}

	@Override
	public int createProfile(FacebookEmployee fe) {
		FacebookDaoInterface fd=FacebookDao.createDaoObject();
		return fd.createprofileDao(fe);
	}
	private int createprofileDao(FacebookEmployee fe) {
		// TODO Auto-generated method stub
		return 0;
	}
}
