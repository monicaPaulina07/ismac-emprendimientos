package com.distribuida.dto;
 
 
import java.util.List;
 

import com.distribuida.entities.loginCliente;

public interface LogincliService {
public List<loginCliente> finAll();
	public loginCliente finOne(int id);
	public void add(int id, String user, String password,  String newpassword, String confirmpassword,  String loginCorreo,
			String loginToken,  String SessiontimeIn , String SessiontimeOUT,String  Sessiontiempo);
	
	public void up(int id, String user, String password,  String newpassword, String confirmpassword,  String loginCorreo,
			String loginToken,  String SessiontimeIn , String SessiontimeOUT,String  Sessiontiempo,loginCliente loginCliente);
	
	public void del(int id);
	public List<loginCliente> findAll(String busqueda);
 
}