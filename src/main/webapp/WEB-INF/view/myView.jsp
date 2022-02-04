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

<form action="result" method="post">
    <input type="number" name="numberOne"
    placeholder="Input number one">

    <br>
    <br>

    <input type="number" name="numberTwo"
           placeholder="Input number two"/>
    <br>
    <br>
    + <form:radiobutton path="func" value="plus" name="+"/>
    - <form:radiobutton path="func" value="minus" name="-"/>
    / <form:radiobutton path="func" value="delenie" name="/"/>
    * <form:radiobutton path="func" value="umnojenie" name="*"/>
    <br>
    <br>
    <input type="submit" value="="/>
</form>



</body>

</html>