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

        <form name="customer" method="post">
        <#if hasError??>
            <div class="alert alert-danger" role="alert">
                ${SPRING_SECURITY_LAST_EXCEPTION.message}
            </div>
        </#if>
            <fieldset>
                <legend>Please Login</legend>
                <label for="email">email</label>
                <input type="text" id="email" name="email"/>
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>
        <#if _csrf??>
            <input type="hidden"
                   name="${(_csrf.parameterName)!'csrf-param-name'}"
                   value="${(_csrf.token)!'csrf-token'}" />
        </#if>
                <div class="form-actions">
                    <button type="submit" class="btn">Log in</button>
                </div>
            </fieldset>
        </form>


    </div>
</div>
</body>
</html>