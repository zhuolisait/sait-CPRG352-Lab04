<%-- 
    Document   : viewnote
    Created on : 2-Jun-2022, 11:07:06 AM
    Author     : i5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p>Title: ${note.title}</p>
        <p>Contents: ${note.contents}</p>
        <p><a href="note?edit">Edit</a></p>
    </body>
</html>
