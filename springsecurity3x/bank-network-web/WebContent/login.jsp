<%@page pageEncoding="GBK" contentType="text/html; charset=GBK" %>
<html>
  <head>
    <title>��ӭ�������ͻ������¼</title>
  </head>

  <body onload="document.f.j_username.focus();">
    <h1>��¼</h1>


    <form action="j_security_check" method="post">
      <table>
        <tr><td>�û�����</td><td><input type='text' name='j_username' ></td></tr>
        <tr><td>���룺</td><td><input type='password' name='j_password'></td></tr>
        <tr><td colspan='2'><input name="submit" type="submit"></td></tr>
        <tr><td colspan='2'><input name="reset" type="reset"></td></tr>
      </table>
    </form>

  </body>
</html>
