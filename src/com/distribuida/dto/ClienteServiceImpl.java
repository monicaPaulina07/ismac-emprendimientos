package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.userDAO;
import com.distribuida.dao.passwordDAO;
import com.distribuida.dao.confirmpasswordDao;
import com.distribuida.dao.loginCorreoDAO;

@Service

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private user userDAO;
	@Autowired
	private password passwordDAO;
	@Autowired
	private confirmpassword confirmpasswordDAO;
	@Autowired
	private loginCorreo loginCorreoDAO;
	
	
	@Override
	public List<ClienteServiceImpl> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ClienteService findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int id, String user, String password, String newpassword, String confirmpassword,
			String loginCorreo, String loginToken, String SessiontimeIn, String SessiontimeOUT, String Sessiontiempo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int findMax() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int findOne(String loginCliente) {
		// TODO Auto-generated method stub
		return 0;
	}
}
