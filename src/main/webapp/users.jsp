<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>
<h1>Hello</h1>

<table>
    <thead>
        <tr>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Role</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.role}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>