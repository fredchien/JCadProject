
<%@ page import="br.cad.web.Usuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'usuario.label', default: 'Usuario')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-usuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-usuario" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="ativo" title="${message(code: 'usuario.ativo.label', default: 'Ativo')}" />
					
						<g:sortableColumn property="edEmail" title="${message(code: 'usuario.edEmail.label', default: 'Ed Email')}" />
					
						<g:sortableColumn property="nmUsuario" title="${message(code: 'usuario.nmUsuario.label', default: 'Nm Usuario')}" />
					
						<g:sortableColumn property="senha" title="${message(code: 'usuario.senha.label', default: 'Senha')}" />
					
						<g:sortableColumn property="senhaUsuario" title="${message(code: 'usuario.senhaUsuario.label', default: 'Senha Usuario')}" />
					
						<g:sortableColumn property="username" title="${message(code: 'usuario.username.label', default: 'Username')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${usuarioInstanceList}" status="i" var="usuarioInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${usuarioInstance.id}">${fieldValue(bean: usuarioInstance, field: "ativo")}</g:link></td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "edEmail")}</td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "nmUsuario")}</td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "senha")}</td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "senhaUsuario")}</td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "username")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${usuarioInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
