<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--常用的注解--%>
    <a href="anno/testRequestParam?name=哈哈">RequestParam</a>
    <form action="anno/testRequestBody" method="post">

        用户姓名: <input type="text" name="uname"></br>
        用户年龄: <input type="text" name="age"></br>
        <input type="submit" value="提交"></br>
    </form>
    <a href="anno/testPathVariable/10">RequestParam</a></br>

    <a href="anno/testRequestHeader/10">RequestHeader</a><br>

    <form action="anno/testModeAttribute" method="post">

        用户姓名: <input type="text" name="uname"></br>
        用户年龄: <input type="text" name="age"></br>
        <input type="submit" value="提交"></br>
    </form>

    <a href="anno/testSessionAttributes">testSessionAttributes</a><br>
</body>
</html>
