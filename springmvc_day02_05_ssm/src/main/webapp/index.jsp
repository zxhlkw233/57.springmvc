<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<body>

    <a href="account/findAll">findAll</a>
    <h3>测试保存</h3>
    <form action="account/save" method="post">
        姓名:<input type="text" name="name" /><br>
        工资:<input type="text" name="money"/><br>
        <input type="submit" value="保存"><br>
    </form>
</body>
</html>
