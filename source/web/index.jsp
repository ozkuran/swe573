<%--
  Created by IntelliJ IDEA.
  User: maozkuran
  Date: 29/03/16
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <!-- Latest compiled and minified CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

      <!-- Optional theme -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

      <!-- Latest compiled and minified JavaScript -->
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
      <title>BUKOOP Kooperatifine Hoşgeldiniz</title>
  </head>
  <body>
  <div class="container-fluid">
      <div class="page-header">
          <h1>Purchase Requests</h1>
      </div>
      <div class="row">
          <ul class="nav nav-tabs">
              <li role="presentation" class="active"><a href="#">Ana Sayfa</a></li>
              <li role="presentation"><a href="#">Hakkımızda</a></li>
              <li role="presentation"><a href="#">Bültenler</a></li>
              <li role="presentation"><a href="#">Üreticiler</a></li>
              <li role="presentation"><a href="#">Ürünler</a></li>
              <li role="presentation"><a href="#">Haberler</a></li>
              <li role="presentation"><a href="#">Yazılar</a></li>
              <li role="presentation"><a href="#">S.S.S.</a></li>
              <li role="presentation"><a href="#">İletişim</a></li>
          </ul>
      </div>
      <div class="row">
          <table class="table">
              <thead>
              <tr>
                  <th>PO Number</th>
                  <th>Date</th>
                  <th>Justification</th>
              </tr>
              </thead>
              <tbody>
              <c:forEach items="${myRequestList}" var="request">
                  <tr>
                      <td>${request.poNumber}</td>
                      <td>${request.date}</td>
                      <td>${request.justification}</td>
                  </tr>
              </c:forEach>
              </tbody>
          </table>
      </div>
  </div>

  </body>
</html>
