<#import "partials/parts.ftlh" as p>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/style.css">
    <title>Online-shop</title>
</head>

<body>
<@p.header />
<h1>Корзина</h1>
<div class="row g-4">
    <div class="row g-4">
        <#list baskets as basket>
            <div class="col-3">
                <div class="card" style="height: 100%; padding: 20px;">
                    <p class="card-text">${basket.product.name}</p>
                    <h4>Цена: </h4>
                    <p class="card-text">${basket.product.price}</p>
                    <form action="/basket/delete" method="post">
                        <input name="basketId" type="hidden" value="${basket.id}">
                        <button type="submit">Удалить</button>
                        <#if _csrf??>
                            <input type="hidden"
                                   name="${(_csrf.parameterName)!'csrf-param-name'}"
                                   value="${(_csrf.token)!'csrf-token'}" />
                        </#if>
                    </form>
                    <form action="/order" method="post">
                        <input name="id" type="hidden" value="${basket.id}">
                        <input name="address" required placeholder="Введите свой адрес">
                        <input name="phone" required placeholder="Введите свой номер телефона">
                        <button type="submit">Оформить заказ</button>
                        <#if _csrf??>
                            <input type="hidden"
                                   name="${(_csrf.parameterName)!'csrf-param-name'}"
                                   value="${(_csrf.token)!'csrf-token'}" />
                        </#if>
                    </form>
                </div>
            </div>
        </#list>
    </div>
</div>
</body>
</html>
