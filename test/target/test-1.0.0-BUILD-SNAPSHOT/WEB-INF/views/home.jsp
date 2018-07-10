<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<c:forEach items="list" var="list">
		<div>${list.test }</div>
	</c:forEach>
</body>
</html>
