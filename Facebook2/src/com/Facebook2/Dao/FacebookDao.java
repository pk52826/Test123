package com.Facebook2.Dao;

import com.Facebook2.Entity.FacebookEmployee;

public class FacebookDao implements FacebookDaoInterface{

	private FacebookDao() {
		
	}
	public static FacebookDaoInterface createDaoObject() {
		// TODO Auto-generated method stub
		return new FacebookDao();
	}
	@Override
	public int createprofileDao(FacebookEmployee fe) {
		// TODO Auto-generated method stub
		return 1;
	}



}
