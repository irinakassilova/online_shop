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
                    <li class="nav-item">
                        <a class="nav-link" href="#">Корзина</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Личный кабинет</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</header>
<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
        <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="image/768x.jpg" class="d_block" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h1>wellcome <span class="slider_text">to </span>Online-shop</h1>
            </div>
        </div>
        <div class="carousel-item">
            <img src="image/768x.jpg" class="d_block" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h1>wellcome <span class="slider_text">to </span>Online-shop</h1>
            </div>
        </div>
        <div class="carousel-item">
            <img src="image/768x.jpg" class="d_block" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h1>There<span class="slider_text">laptops and smartphones</span>you take</h1>
            </div>
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<section class="section_container">
    <div class="filter_forms">
        <h3 class="header_find">Искать товар:</h3>
        <form action="/products/filter/name" method="post">
            <p>По названию</p>
            <input name="name" required placeholder="Введите название">
            <button type="submit">Искать</button>
        </form>
        <form action="/products/filter/description" method="post">
            <p>По описанию</p>
            <input name="description" required placeholder="Введите описание">
            <button type="submit">Искать</button>
        </form>
    </div>
</section>

<footer>
    <div class="container_footer">
        <p class="text_footer">&#169 2021 company</p>
    </div>
</footer>

</body>
</html>