package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.ClienteService;
import com.distribuida.entities.ClienteServiceImpl;

public interface ClienteService {
	
	public List<ClienteServiceImpl> findAll();
	public ClienteService findOne(int id);
	
	public void add(int id, String user, String password,  String newpassword, String confirmpassword,  String loginCorreo,
			String loginToken,  String SessiontimeIn , String SessiontimeOUT,String  Sessiontiempo);
	
	public int findMax();
	public int findOne(String loginCliente);

}
