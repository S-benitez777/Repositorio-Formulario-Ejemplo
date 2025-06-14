<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
</head>
<body>
    <h2>Datos recibidos desde el formulario:</h2>
    <p><strong>Nombre:</strong> <%= request.getAttribute("nombre") %></p>
    <p><strong>Correo Electrónico:</strong> <%= request.getAttribute("email") %></p>
    <p><strong>Mensaje:</strong> <%= request.getAttribute("mensaje") %></p>
</body>
</html>
