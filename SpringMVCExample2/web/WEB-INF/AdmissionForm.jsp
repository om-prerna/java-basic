<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pjain
  Date: 05/06/19
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admission Form</title>
</head>
<body>
<h1>${message}</h1>
<h2>${formHeader}</h2>
<form:errors path="student.*"/>
<form action="/student/submitpage.html" method="post"> <%--  by default method is GET --%>
    <table>
        <tr><td>Name: <input type="text" name="stName"> </td></tr>
        <tr><td>Company Name: <input type="text" name="comName"></td> </tr>
        <tr><td>Mobile No: <input type="text" name="mobileNo"> </td></tr>
        <tr><td>Date of birth: <input type="text" name="dob"> </td></tr>
        <tr><td>Select skills: </td><td><select name="skillSet" multiple>
        <option value="Spring MVC">Spring MVC</option>
        <option value="Spring core">Spring core</option>
        <option value="Spring JDBC">Spring JDBC</option>
        </select> </td></tr>
    </table>
    <table>
        <tr><td>Address:</td></tr>
        <tr><td>City:<input type="text" name="address.city"></td>
        <td>State:<input type="text" name="address.state"></td>
        <td>Country:<input type="text" name="address.country"></td>
        <td>pincode:<input type="text" name="address.pincode"></td></tr>
    </table>

    <p><input type="submit" value="Submit"></p>
</form>
</body>
</html>
