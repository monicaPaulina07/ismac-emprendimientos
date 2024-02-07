package com.distribuida.dto;

import java.util.List;

import org.springframework.stereotype.Service;

import com.distribuida.dao.loginClienteImplDao;
import com.distribuida.entities.loginCliente;


@Service

public class loginClienteServiceImpl extends loginCliente {

		@Override
		public List<loginCliente> finAll() {
			// TODO Auto-generated method stub
			return null;
		}
	 
		@Override
		public loginCliente finOne(int id) {
			// TODO Auto-generated method stub
			return null;
		}
	 
		@Override
		public void add(int id, String user, String password,  String newpassword, String confirmpassword,  String loginCorreo,
				String loginToken,  String SessiontimeIn , String SessiontimeOUT,String  sessiontiempo) {
			// TODO Auto-generated method stub
			
	loginCliente = loginClienteImplDao.findOne(fk_loginCliente);
			loginCliente = new loginCliente (id, user, password, newpassword, confirmpassword,
					loginCorreo, loginToken, SessiontimeIn, SessiontimeOUT, sessiontiempo);
			loginCliente.setloginCliente(loginCliente);
			loginClienteImplDao.add(loginCliente);
	 
		}
	 
		@Override
		public void up(int id, String user, String password,  String newpassword, String confirmpassword,  String loginCorreo,
				String loginToken,  String SessiontimeIn , String SessiontimeOUT,String  Sessiontiempo,loginCliente loginCliente) {
			// TODO Auto-generated method stub
	 
		}
	 
		@Override
		public void del(int id) {
			// TODO Auto-generated method stub
	 
		}
	 
		@Override
		public  List<loginCliente> findAll(String busqueda) {
			// TODO Auto-generated method stub
			return null;
		}
	 
}
