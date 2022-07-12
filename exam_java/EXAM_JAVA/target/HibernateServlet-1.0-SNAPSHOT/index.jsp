<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<style>
    .main {
        height: 75px;
    }
    .left-content {
        margin-left: 2rem;
    }
    .right-content {
        margin-top: 10px;
    }
    .right-content ul li {
        list-style: none;
        display: inline-block;
        margin-left: 1.5rem;
        border-radius: 12px;
        background-color: #e4e4e4;
        padding: 1rem;
    }
</style>
<body>

</h1>
<div class="d-flex justify-content-between align-items-center bg-light text-dark main">
  <div class="left-content">
      <p class="fs-1">Assignment</p>
  </div>
   <div style="display: inline-block" class="right-content">
       <ul>
           <li><a href="login">Login</a></li>
       </ul>
   </div>
</div>
</body>
</html>
