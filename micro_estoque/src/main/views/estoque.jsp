<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Estoques</title>
</head>
<body>
    <h1>Lista de Estoques</h1>
    <table>
        <thead>
            <tr>
                <th>Código</th>
                <th>Quantidade</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop through estoque items and display them in a table -->
            <c:forEach var="item" items="${estoqueList}">
                <tr>
                    <td>${item.codigo}</td>
                    <td>${item.quantidade}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
