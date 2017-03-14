<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <jsp:include page="/header"/>
</head>
<body>
  <jsp:include page="/menu"/>
  <div class="container">
    <div class="jumbotron">
      <h1>Home</h1>
      Hola vamos a <a href="<c:url value="/list" />">listado</a>.
      <button type="button" class="btn btn-primary">Primary</button>
      <ul>
        <li><a href="/api/sample">API Sample</a></li>
      </ul>
    </div>
  </div>
</body>
</html>
