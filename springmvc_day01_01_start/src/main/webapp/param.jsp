<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--请求参数绑定--%>
    <%--解决中文乱码问题--%>
    <%-- <a href="/param/testParam?username=haha">请求参数绑定</a>--%>
        <%--把数据封装到Account类中--%>
<%--    <form action="/param/saveAccount" method="post">--%>
<%--        姓名: <input type="text" name="username"></br>--%>
<%--        密码: <input type="text" name="password"></br>--%>
<%--        金额: <input type="text" name="money"></br>--%>
<%--        用户姓名: <input type="text" name="user.uname"></br>--%>
<%--        用户年龄: <input type="text" name="user.age"></br>--%>
<%--        <input type="submit" value="提交"></br>--%>
<%--    </form>--%>
        <%--把数据封装到Account类中,类中存在list和map的集合中--%>
<%--        <form action="/param/saveAccount" method="post">--%>
<%--            姓名: <input type="text" name="username"></br>--%>
<%--            密码: <input type="text" name="password"></br>--%>
<%--            金额: <input type="text" name="money"></br>--%>

<%--            用户姓名: <input type="text" name="list[0].uname"></br>--%>
<%--            用户年龄: <input type="text" name="list[0].age"></br>--%>

<%--            用户姓名: <input type="text" name="map['one'].uname"></br>--%>
<%--            用户年龄: <input type="text" name="map['one'].age"></br>--%>
<%--            <input type="submit" value="提交"></br>--%>
<%--        </form>--%>
        <%--自定义类型转换器
        <form action="/param/aaa" method="post">

            用户姓名: <input type="text" name="uname"></br>
            用户年龄: <input type="text" name="age"></br>
            用户生日: <input type="text" name="date"></br>
            <input type="submit" value="提交"></br>
        </form>--%>

    <a href="param/testPathVariable">Servlet原生的api</a>
</body>
</html>
