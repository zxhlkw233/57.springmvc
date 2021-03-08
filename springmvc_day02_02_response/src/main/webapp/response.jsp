<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Title</title>
    <script src="js/jquery-1.11.3.js"></script>
    <script>
        //页面加载,绑定单机事件
        $(function () {
            $("#btn").click(function () {
                // alert("hello");
                //发送ajax请求
                $.ajax({
                    // 编写json格式,设置属性和值
                    url:"user/testAjax",//表示请求路径
                    contentType:"application/json;charset=UTF-8",//发送信息至服务器时内容编码类型
                    data:'{"username":"haha","password":"123","age":30}',//发送到服务器的数据
                    dataType:"json",//预期服务器返回的数据类型
                    type:"post",//请求方式,默认"GET"
                    success:function (data) {//data : 服务器端响应的json的数据,进行解析
                        alert(data)
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }//请求成功后的回调函数
                });
            });
        });
    </script>
</head>
<body>
    <a href="user/testString">testString</a>

    <br>
    <a href="user/testVoid" >testVoid</a> <br>

    <a href="user/testModelAndView" >testVoid</a><br>

    <a href="user/testForwardOrRedirect">testForwardOrRedirect</a><br>

    <button id="btn">发送ajax的请求</button>

</body>
</html>
