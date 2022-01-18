<#macro header>
    <header>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-dark">
                <a class="navbar-brand" href="#"><img class="logo" src="image/kisspng-vector-graphics-computer-icons-shopping-cart-onlin-5c94e709b63246.3329197615532623457463.jpg" alt="logo"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Переключатель навигации">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="/products">Каталог товаров<span class="sr-only">(текущая)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/contacts">Контакты</a>
                        </li>
                        <#--                    <li class="nav-item">-->
                        <#--                        <a class="nav-link" href="#">Корзина</a>-->
                        <#--                    </li>-->
                        <li class="nav-item">
                            <a class="nav-link" href="/register">Зарегистрироваться</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/login">Личный кабинет(Войти)</a>
                        </li>
                        <li class="nav-item">
                            <#if _csrf??>
                                <form action="/logout" method="post">
                                    <input type="hidden"
                                           name="${(_csrf.parameterName)!'csrf-param-name'}"
                                           value="${(_csrf.token)!'csrf-token'}" />
                                    <button class="btn btn-primary">Выйти</button>
                                </form>
                            <#else>
                                <a class="nav-link" href="/logout"> Выйти </a>
                            </#if>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </header>
</#macro>
