<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Clientes</title>
</head>
<body>
    <h1>Lista de Clientes</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop through customer items and display them in a table -->
            <c:forEach var="cliente" items="${clienteList}">
                <tr>
                    <td>${cliente.id}</td>
                    <td>${cliente.nome}</td>
                    <td>${cliente.cpf}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
