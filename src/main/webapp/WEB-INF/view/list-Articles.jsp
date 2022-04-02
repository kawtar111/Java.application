<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Customers</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Article</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add Article"
               onclick="window.location.href='add'; return false;"
               class="add-button"
        />

        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>

            <%--@elvariable id="customers" type="java.util.List"--%>
            <c:forEach var="tempCustomer" items="${articles}">

                <c:url var="updateLink" value="/customer/update">
                    <c:param name="customerId" value="${tempArticle.id}" />
                </c:url>

                <c:url var="deleteLink" value="/article/delete">
                    <c:param name="customerId" value="${tempArticle.id}" />
                </c:url>

                <tr>
                    <td> ${tempCustomer.NomArticle} </td>
                    <td> ${tempCustomer.NomAuteur} </td>

                    <td> ${tempCustomer.DatePub} </td>
                    <td> ${tempCustomer.texte_Article} </td>
                    <td> ${tempCustomer.photo} </td>

                    <td>
                        <a href="${updateLink}">Update</a>
                        |
                        <a href="${deleteLink}"
                           onclick="if (!(confirm('Are you sure you want to delete this article?'))) return false">Delete</a>
                    </td>

                </tr>

            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>









