
<%@ page import="br.cad.web.Usuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'usuario.label', default: 'Usuario')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-usuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-usuario" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list usuario">
			
				<g:if test="${usuarioInstance?.ativo}">
				<li class="fieldcontain">
					<span id="ativo-label" class="property-label"><g:message code="usuario.ativo.label" default="Ativo" /></span>
					
						<span class="property-value" aria-labelledby="ativo-label"><g:fieldValue bean="${usuarioInstance}" field="ativo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.edEmail}">
				<li class="fieldcontain">
					<span id="edEmail-label" class="property-label"><g:message code="usuario.edEmail.label" default="Ed Email" /></span>
					
						<span class="property-value" aria-labelledby="edEmail-label"><g:fieldValue bean="${usuarioInstance}" field="edEmail"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.nmUsuario}">
				<li class="fieldcontain">
					<span id="nmUsuario-label" class="property-label"><g:message code="usuario.nmUsuario.label" default="Nm Usuario" /></span>
					
						<span class="property-value" aria-labelledby="nmUsuario-label"><g:fieldValue bean="${usuarioInstance}" field="nmUsuario"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.senha}">
				<li class="fieldcontain">
					<span id="senha-label" class="property-label"><g:message code="usuario.senha.label" default="Senha" /></span>
					
						<span class="property-value" aria-labelledby="senha-label"><g:fieldValue bean="${usuarioInstance}" field="senha"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.senhaUsuario}">
				<li class="fieldcontain">
					<span id="senhaUsuario-label" class="property-label"><g:message code="usuario.senhaUsuario.label" default="Senha Usuario" /></span>
					
						<span class="property-value" aria-labelledby="senhaUsuario-label"><g:fieldValue bean="${usuarioInstance}" field="senhaUsuario"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.username}">
				<li class="fieldcontain">
					<span id="username-label" class="property-label"><g:message code="usuario.username.label" default="Username" /></span>
					
						<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${usuarioInstance}" field="username"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${usuarioInstance?.id}" />
					<g:link class="edit" action="edit" id="${usuarioInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
