<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="container">
	<form action="LoginServlet" class="login_form" id="login_form" method="post">
            <div class="input-control">
                <label for="username">Kullanıcı Adı</label>
                <input id="username" name="username" type="text">
            </div>
            <div class="input-control">
                <label for="password">Şifre</label>
                <input id="password" name="password" type="password">
            </div>
            <div class="remember-control">
            	<input type="checkbox" id="rememberMe" name="rememberMe">
            	<label for="rememberMe">Beni Hatırla</label>
            </div>
            <button class="submit">Giriş Yap </button>
        </form>
   </div>
</body>
</html>
