package br.cad.web.system

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import utils.MD5;

import br.cad.model.system.Usuario;
import br.cad.service.system.UsuarioService;

class LoginController {
	
	@ManagedProperty("#{usuarioService}")
	private UsuarioService usuarioService;

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	def autenticar() {
		
	}
	
	def entrar(){
		String userName = params.userName
		String password = params.password
	
		Usuario user = userName ? usuarioService.login(userName, password) : null
		//If login succeed
		if(user?.senha == MD5.encrypt(password)){
			session.user = user
			render(contentType: 'text/json') {
				[success: true, message: 'Login successful']
			}
		}
		//If login failed
		else{
			render(contentType: 'text/json') {
				[success: false, message: 'Usuário ou Senha Incorreta']
			}
		}
	}
}
