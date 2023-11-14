# Проект по автоматизации тестирования для компании оператора связи [Билайн](https://www.beeline.ru)

<p align="center"><a href="https://www.beeline.ru"><img src="images/beeline.logo.jpg" align="center" width="500" height="200"  alt="Java"/></a></p>

> Билайн - крупнейший оператор, который оказывает услуги сотовой (GSM, UMTS и LTE) и фиксированной связи, проводного (FTTB) и беспроводного (Wi-Fi, «Билайн WiFi») высокоскоростного доступа в Интернет, IP-телевидения.

## :notebook: Содержание:

- [Технологии и инструменты](#computer-технологии-и-инструменты)
- [Тестовые сценарии](#clipboard-тестовые-сценарии)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Команда для запуска](#rocket-команда-для-запуска)
- [Allure отчет](#-allure-отчет)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram чат с ботом](#-уведомления-в-telegram-чат-с-ботом)
- [Видео запуска тестов в Selenoid](#-видео-запуска-тестов-в-selenoid)

---

<a id="tools"></a>
## 🔨 Технологии и инструменты:

| Java                                                                                                     | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         | Jenkins                                                                                                          | Jira                                                                                                                                    | Telegram                                                                                                            |                                                                                            Allure <br> TestOps |
|:---------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50" alt="Java" title="Java"/></a> | <a href="https://web.telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50" alt="Telegram"/></a> | <a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

## :clipboard: Тестовые сценарии

- :white_check_mark: Раздел "Билайн услуги"
    - :heavy_check_mark: Проверка функции пополнения номера телефона и личного кабинета Билайн через систему быстрых платежей
    - :heavy_check_mark: Проверка заполнения форм подключения домашнего интернета с успешной территориальной возможностью подключения 
    - :heavy_check_mark: Проверка подписки на новости Билайн
- :white_check_mark: Раздел "Билайн магазин"
    - :heavy_check_mark: Проверка поисковой строки магазина Билайн
    - :heavy_check_mark: Проверка пользовательской корзины на добавление и удаление товара
- :white_check_mark: Раздел "Билайн Бизнес"
    - :heavy_check_mark: Проверка смены языка текста страницы с русского на английский
    - :heavy_check_mark: Тестирование загрузки файлов договоров Билайн с проверкой содержимого текста
    - :heavy_check_mark: Проверка наличия списка строк основного меню Билайн Бизнес

---

## <img src="images/logo/Jenkins.svg" width="50" height="50"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Melnikov_A-Beeline_autotests/)

<p align="center">
<img src="images/screenshots/JenkinsScreenshot.png" alt="Jenkins Build" width="1000" height="300">
</p>

### Параметры сборки проекта

| Параметр        | Назначение                               |
|-----------------|------------------------------------------|
| BROWSER         | Браузер для запуска                      |
| BROWSER_VERSION | Версия браузера                          |
| BROWSER_SIZE    | Разрешение экрана                        |
| REMOTE_URL      | Удаленный сервер для запуска тестов      |
| COMMENT         | Комментарий                              |
| ENVIRONMENT     | Тестовая среда                           |
| TASK            | Опция выбора запуска определённых тестов |

### Запуск тестов с параметрами в **Jenkins**

<p align="center">
<img src="images/screenshots/JenkinsLaunch.png" alt="Jenkins Launch" width="1000" height="350">
</p>

---

<a id="console"></a>
## 🚀 Команда для запуска

Удаленный запуск с использованием Jenkins и Selenoid (требуется логин и пароль):
```bash  
./gradlew clean test -Denv=remote
```

---

## <img src="images/logo/Allure.svg" width="50" height="50"/> [Allure](https://jenkins.autotests.cloud/job/Melnikov_A-Beeline_autotests/61/allure/) отчет

### 🖨️ Главная страница отчета

<p align="center">
<img src="images/screenshots/Allure-report.png" alt="Allure report" width="1000" height="350">
</p>

### 📄 Тест-кейсы

<p align="center">
<img src="images/screenshots/Allure-testcase.png" alt="Test Case" width="1000" height="350">
</p>

### 📊  Графики

<p align="center">
<img src="images/screenshots/Allure-graf1.png" alt="Allure-graph" width="1000" height="350">
</p>

---

<a id="allure"></a>
## <img alt="Allure_TO" height="50" src="images/logo/Allure_TO.svg" width="50"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3785/dashboards">Allure TestOps</a>


## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screenshots/Allure-testops.png" width="850">  
</p>  

## 📄 Авто и Ручные тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/screenshots/Allure-to-manual.png" width="850">  
</p>

---

## <img src="images/logo/Jira.svg" width="50" height="50"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-954)

### Задача в Jira

<p align="center">
<img src="images/screenshots/Jiramain.png" alt="TestOps launch" width="1000" height="350">
</p>

#### Содержание задачи

- :heavy_check_mark: Цель
- :heavy_check_mark: Задачи для выполнения
- :heavy_check_mark: Тест-кейсы из Allure TestOps
- :heavy_check_mark: Результат прогона тестов в Allure TestOps

---

## <img src="images/logo/Telegram.svg" width="50" height="50"/> Уведомления в Telegram чат с ботом

### Уведомление из переписки с чат ботом

<p align="center">
<img src="images/screenshots/Tlg.png" alt="TestOps launch" width="500" height="400">
</p>


#### Содержание уведомления в Telegram

- :heavy_check_mark: Окружение
- :heavy_check_mark: Комментарий
- :heavy_check_mark: Длительность прохождения тестов
- :heavy_check_mark: Общее количество сценариев
- :heavy_check_mark: Процент прохождения тестов
- :heavy_check_mark: Ссылка на Allure отчет

---
## <img src="images/logo/Selenoid.svg" width="50" height="50"/> Видео запуска тестов в Selenoid

<p align="center">
<img src="images/gifs/selenoid.gif" alt="TestOps launch" width="800" height="400">
</p>