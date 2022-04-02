<!DOCTYPE html>
<html>

<head>
    <title>Add Customer</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-article-style.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM -Article Relationship Manager</h2>
    </div>
</div>

<div id="container">
    <h3>Add Article</h3>

    <form name="addArticle" action="${pageContext.request.contextPath}/Article/add" method="post">

        <label>
            <input type="text" name="ArticleId" value="${customer.id}" hidden>
        </label>

        <table>
        <tbody>

        <tr>
            <td><label>Nom Article:</label></td>
            <td><label><input type="text" name="NomArticle" value="${customer.NomArticle}" required/></label></td>
        </tr>

        <tr>
            <td><label>Nom Auteur:</label></td>
            <td><label><input type="text" name="NomAuteur" value="${customer.NomAuteur}" required/></label></td>
        </tr>

        <tr>
            <td><label>Date Pub:</label></td>
            <td><label><input type="date" name="DatePub" value="${customer.DatePub}" required/></label></td>
        </tr>
        
        
             <tr>
            <td><label>texte Article:</label></td>
            <td><label><input type="text" name="texte_Article" value="${customer.texte_Article}" required/></label></td>
        </tr>

       <tr>
            <td><label>Photo:</label></td>
            <td><label><input type="file" name="photo" value="${customer.photo}" required/></label></td>
        </tr>


        <tr>
            <td><label></label></td>
            <td><input type="submit" value="Save" class="save"/></td>
        </tr>


        </tbody>
    </table>

    </form>

    <div style="clear: both;"></div>

    <p>
        <a href="${pageContext.request.contextPath}/article/list">Back to List</a>
    </p>

</div>
</body>
</html>










