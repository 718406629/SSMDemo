<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<a href="account/test">测试</a>
<form action="account/login">
    id：<input type="text" name="id"><br>
    名字：<input type="text" name="names" ><br>
    <input type="submit" value="登录">
</form>
<br>
<form action="account/save">
    名字：<input type="text" name="names" ><br>
    金额：<input type="text" name="money"><br>
   <input type="submit" value="保存">
</form>


</body>
</html>
