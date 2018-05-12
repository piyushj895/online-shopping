<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>
<script type="text/javascript">
	window.menu = '${title}';
</script>

<link href="${css}/space.css" rel="stylesheet">
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- bootstrap litera theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Loading the home page content -->
		<div class="content">
			<c:if test="${userClickHome==true}">
				<%@ include file="home.jsp"%>
			</c:if>

			<!-- load only when user clicks about -->
			<c:if test="${userClickAbout==true}">
				<%@ include file="about.jsp"%>
			</c:if>

			<!-- load only when user clicks contact -->
			<c:if test="${userClickContact==true}">
				<%@ include file="contact.jsp"%>
			</c:if>


			<!-- load only when user clicks product -->
			<c:if test="${userClickAllProducts==true or userClickCategoryProducts==true}">
				<%@ include file="listProducts.jsp"%>
			</c:if>
		</div>
		<!-- Footer -->
		<%@ include file="./shared/footer.jsp"%>
	</div>
	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>

	<!--   Self coded javascript -->
	<script src="${js}/myapp.js"></script>


</body>

</html>
