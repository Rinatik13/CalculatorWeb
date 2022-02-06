<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="myCss.css">
</head>
<body>
<h2>
    Please input numbers!
</h2>

<form action="result" method="get">
    <input type="number" name="numberOne"
    placeholder="Input number one">

    <br>
    <br>

    <input type="number" name="numberTwo"
           placeholder="Input number two"/>
    <br>
    <br>
    + <input type="radio" value="1" name="1">
    - <input type="radio" value="2" name="1">
    / <input type="radio" value="3" name="1">
    * <input type="radio" value="4" name="1">
    <br>
    <br>
    <input type="submit" value="="/>


</form>


</body>

</html>