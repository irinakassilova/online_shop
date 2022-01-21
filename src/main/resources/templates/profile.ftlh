<#import "partials/parts.ftlh" as p>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<@p.header />
<div id="customers">
    <div class="container">
        <p>${customer.fullname}  ${customer.email}</p>
    </div>
</div>
</body>
</html>