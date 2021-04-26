<%--
  Created by IntelliJ IDEA.
  User: fhasa
  Date: 4/26/2021
  Time: 5:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<form style="border: 2px blue dotted" action="/student-register.do" method="post">
    <table>
        <tr>
            <td>Name =</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Family =</td>
            <td><input type="text" name="family"/></td>
        </tr>
        <tr>
            <td>Age =</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="register" value="register"/></td>
        </tr>
    </table>
</form>
</body>
</html>
