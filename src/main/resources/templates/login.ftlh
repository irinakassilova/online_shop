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

        <#--        <form action="/login" method="post">-->
        <#--&lt;#&ndash;            <div>&ndash;&gt;-->
        <#--&lt;#&ndash;                <#if error!false >&ndash;&gt;-->
        <#--&lt;#&ndash;                    <p >Неверные имя пользователя или пароль !</p>&ndash;&gt;-->
        <#--&lt;#&ndash;                </#if>&ndash;&gt;-->
        <#--&lt;#&ndash;            </div>&ndash;&gt;-->
        <#--&lt;#&ndash;                <legend>Please Login</legend>&ndash;&gt;-->
        <#--&lt;#&ndash;                <label for="email">email</label>&ndash;&gt;-->
        <#--&lt;#&ndash;                <input type="email" id="email" name="email" value="${(dto.email)!''}" autofocus />&ndash;&gt;-->
        <#--&lt;#&ndash;                <label for="password">Password</label>&ndash;&gt;-->
        <#--&lt;#&ndash;                <input type="password" id="password" name="password" value=""/>&ndash;&gt;-->


        <#--&lt;#&ndash;                <button type="submit" class="btn">Log in</button>&ndash;&gt;-->

        <#--&lt;#&ndash;            <#if _csrf??>&ndash;&gt;-->
        <#--&lt;#&ndash;                <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>&ndash;&gt;-->
        <#--&lt;#&ndash;            </#if>&ndash;&gt;-->

        <#--            <div>-->
        <#--                <#if error!false >-->
        <#--                    <p >Неверные имя пользователя или пароль !</p>-->
        <#--                </#if>-->
        <#--            </div>-->

        <#--            <label>E-mail</label>-->
        <#--            <input type="text" name="username" class="form-control" value="${(customer.email)!''}" autofocus>-->

        <#--            <label>Пароль</label>-->
        <#--            <input type="text" name="password" class="form-control" value="">-->

        <#--            <button class="btn btn-primary" type="submit">Войти</button>-->

        <#--            <#if _csrf??>-->
        <#--                <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>-->
        <#--            </#if>-->
        <#--        </form>-->


        <form action="/login" method="post" class="form-group">

            <div>
                <#if error!false >
                    <p >Неверные имя пользователя или пароль !</p>
                </#if>
            </div>

            <label>E-mail</label>
            <input type="text" name="username" class="form-control" value="${(customer.email)!''}" autofocus>

            <label>Пароль</label>
            <input type="text" name="password" class="form-control" value="">

            <button class="btn btn-primary" type="submit">Войти</button>

            <#if _csrf??>
                <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>
            </#if>
        </form>

    </div>
</div>
</body>
</html>