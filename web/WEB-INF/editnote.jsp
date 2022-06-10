<%-- 
    Document   : editnote
    Created on : 2-Jun-2022, 11:07:24 AM
    Author     : i5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            <label for="title">Title: </label> 
            <input name="title" type="text" value="This is the title"/>
            <br>
            <label for="contents">Contents: </label> 
            <textarea name="contents" rows="6" cols="30">Contents go here</textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
