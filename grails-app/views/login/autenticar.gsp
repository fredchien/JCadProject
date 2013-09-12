<!DOCTYPE html>
<html>
	<head>
		<title>Autenticar</title>
		<script type="text/javascript">
			$('#submitConnection').click(function(e) {
				e.preventDefault(); // prevents normal event of button submitting form
				$.post("/login/entrar/", {
					userName : "dummy",
					password : "dummy"
				}, function(data) {
					if (data.success) {
						window.location = "/login/entrar/";
					} else {
						$("#error-message").html(data.message).show();
					}
				});
			});
		</script>
	</head>
	<body>
		<div align="center">
			<g:form controller="login" action="entrar">
				<h2>Please, log in</h2>
				<div id="error-message" class="hide"></div>
				<g:textField name="userName" placeholder="Email address" />
				<g:passwordField name="password" type="password"
					placeholder="Password" />
				<button id="submitConnection" type="submit">Connection</button>
			</g:form>
		</div>
	</body>
</html>