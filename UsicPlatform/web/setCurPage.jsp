<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: wangzhen
  Date: 2020/12/31
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%

    session.setAttribute("curPage", request.getParameter("curPage"));
//    System.out.println("setCurPage -> " + request.getParameter("curPage"));
%>

</body>
</html>
