<%@ page import="br.cad.web.Usuario" %>



<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'ativo', 'error')} required">
	<label for="ativo">
		<g:message code="usuario.ativo.label" default="Ativo" />
		<span class="required-indicator">*</span>
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'edEmail', 'error')} ">
	<label for="edEmail">
		<g:message code="usuario.edEmail.label" default="Ed Email" />
		
	</label>
	<g:textField name="edEmail" value="${usuarioInstance?.edEmail}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'nmUsuario', 'error')} ">
	<label for="nmUsuario">
		<g:message code="usuario.nmUsuario.label" default="Nm Usuario" />
		
	</label>
	<g:textField name="nmUsuario" value="${usuarioInstance?.nmUsuario}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'senha', 'error')} ">
	<label for="senha">
		<g:message code="usuario.senha.label" default="Senha" />
		
	</label>
	<g:textField name="senha" value="${usuarioInstance?.senha}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'senhaUsuario', 'error')} ">
	<label for="senhaUsuario">
		<g:message code="usuario.senhaUsuario.label" default="Senha Usuario" />
		
	</label>
	<g:textField name="senhaUsuario" value="${usuarioInstance?.senhaUsuario}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'username', 'error')} ">
	<label for="username">
		<g:message code="usuario.username.label" default="Username" />
		
	</label>
	<g:textField name="username" value="${usuarioInstance?.username}"/>
</div>

