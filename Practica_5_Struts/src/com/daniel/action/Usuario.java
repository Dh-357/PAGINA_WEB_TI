package com.daniel.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Usuario extends ActionSupport {
	private String userlogin;
	private String userpwd;
	private String usernombre;
	private String userlectura;
	
	public String getUserlectura() {
		return userlectura;
	}

	public void setUserlectura(String userlectura) {
		this.userlectura = userlectura;
	}

	public String accionar() {
		String ir=ERROR;
		if(getUserpwd().equals("123")) {
			ir=SUCCESS;
			setUsernombre(getUserlogin());
		}else {
			if(getUserlogin().equals("")&&getUserpwd().equals("")
					&&getUserlectura().equals("")) {
				addActionError("Error: Campos Vacios");
			}else {
				addActionError("Error: Datos incorrectos");
			}
		}
		return ir;
	}
	
	public String getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(String userlogin) {
		this.userlogin = userlogin;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUsernombre() {
		return usernombre;
	}
	public void setUsernombre(String usernombre) {
		this.usernombre = usernombre;
	}
}
