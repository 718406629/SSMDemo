<%--
  Created by IntelliJ IDEA.
  User: zjc1234
  Date: 2019/5/18
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入jstl标签库（前端使用）--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  测试成功！
<c:forEach items="${accounts}" var="account">
    ${account.names}


</c:forEach>


</body>
</html>
