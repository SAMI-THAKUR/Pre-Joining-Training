<%@ page import="com.example.model.User" %>

<%
User user = (User) session.getAttribute("user");

if(user == null){
    response.sendRedirect("login.jsp");
    return;
}

ServletContext context = application;
String college = (String) context.getAttribute("college");
String appVersion = (String) context.getAttribute("appVersion");
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" href="style/welcome.css" />
</head>
<body>
    <div class="app-info">
        <span><strong>College:</strong> <%= college %></span>
        <span><strong>Version:</strong> <%= appVersion %></span>
    </div>
    <div class="card">
        <h1>Welcome</h1>
        <div class="info">
            <span class="label">Name:</span>
            <%= user.getName() %>
        </div>

        <div class="info">
            <span class="label">Email:</span>
            <%= user.getEmail() %>
        </div>

        <div class="info">
            <span class="label">Gender:</span>
            <%= user.getGender() %>
        </div>

        <div class="info">
            <span class="label">Department:</span>
            <%= user.getDepartment() %>
        </div>

        <form action="logout" method="get">
            <button class="logout-btn" type="submit">
                Logout
            </button>
        </form>
    </div>
</body>
</html>