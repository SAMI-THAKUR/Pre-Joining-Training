<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<html>
<body>

<%
    String name = "";
    String email = "";

    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie cookie : cookies) {

            if ("userName".equals(cookie.getName())) {
                name = URLDecoder.decode(
                        cookie.getValue(),
                        StandardCharsets.UTF_8
                );
            }
        }
    }
    
    if(session == null || session.getAttribute("email")==null){
       response.sendRedirect("index.html");
       return;
    }

    email = (String) session.getAttribute("email");
%>

<h2>Welcome <%= name %></h2>
<p>Email: <%= email %></p>

</body>
</html>