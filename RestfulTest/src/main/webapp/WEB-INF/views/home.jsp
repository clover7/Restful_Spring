<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<table border="1">
    <tr align="center">
        <td width="100px">No</td>
        <td width="100px">KEY</td>
        <td width="100px">VALUES</td>
        <td width="100px">DATE</td>
        <td width="100px">ETC</td> 
    </tr>
<c:forEach var="lists" items="${lists}">
    <tr align="center">
        <td>${lists.seq}</td>
        <td>${lists.key}</td>
        <td>${lists.values}</td>
        <td>${lists.input_dt}</td>
        <td>${lists.extends_etc}</td> 
    </tr>
</c:forEach>
</table>

</body>
</html>
