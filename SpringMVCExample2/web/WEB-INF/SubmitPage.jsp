<%--
  Created by IntelliJ IDEA.
  User: pjain
  Date: 05/06/19
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Submit Page</title>
</head>
<body>
<h1>${message}</h1>
<p>Dear ${student.stName}, Thanks for submitting the form.</p>
<h1> Student Data:</h1>
<table>
    <tr><td>Student name: ${student.stName}</td></tr>
    <tr><td>Company Name: ${student.comName}</td></tr>
    <tr><td>Mobile No: ${student.mobileNo}</td></tr>
    <tr><td>Date of birth: ${student.dob}</td></tr>
    <tr><td>Skills: ${student.skillSet}</td></tr>
    <tr><td>Address :</td>
            <td>
                City: ${student.address.city}
                State: ${student.address.state}
                Country: ${student.address.country}
                Pincode: ${student.address.pincode}
            </td>
   </table>
</body>
</html>
