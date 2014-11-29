<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form action="/login.action" method="post">
<div><span class="span_width_60 text_algin_right">username:</span><span><input name="username"/></span></div>
<div><span class="span_width_60 text_algin_right">password:</span><span><input type="password" name="password"/></span></div>
<div><span class="span_width_60 text_algin_right"><input type="submit" value='submit'/></span></div>
</form>
</body>
</html>

