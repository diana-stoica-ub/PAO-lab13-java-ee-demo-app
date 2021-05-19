<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>

<c:choose>
    <c:when test = "${user.role == 'student'}">
        Welcome, student!
    </c:when>
    <c:when test = "${user.role == 'teacher'}">
        Welcome, teacher!
    </c:when>
    <c:otherwise>
        Welcome!
    </c:otherwise>
</c:choose>
<h1>Subjects list <c:out value="${user.firstName} ${user.lastName}"/></h1>
<br/>
<div>
    <ul>
        <c:forEach items="${subjects}" var="subject">
            <li>${subject}</li>
        </c:forEach>
    </ul>

</div>
</body>
</html>