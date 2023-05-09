# Credit-processing
 Credit-processing - это сервис, отвечающий за обработку кредитных заявок.

## Установка
1. Склонируйте репозиторий с github
```
git clone https://github.com/Vladiisss/credit-processing.git
```
2. Скачайте и установите postgreSql и pgAdmin 4
3. Запустите pgAdmin 4 и создайте БД со следующими конфигурациями:
```
username: postgres
password: postsql232
db_name: credit_processing_db
port: 5432
host: localhost
```
4. Запустите приложение 

## Примечания к установке
В случае старта БД на Windows необходимо запустить службу postgresql-x64-15  

![search_service](https://github.com/Vladiisss/images/blob/main/search_service.PNG)
![service](https://github.com/Vladiisss/images/blob/main/services.PNG)
## API
1. Получение тарифов
```
localhost:8080/loan-service/getTariffs
```
2. Подача заявки на кредит
```
localhost:8080/loan-service/order
```
http body (пример)
```
{
    "userId": 123456,
    "tariffId": 3
}
```
3. Получение статуса заявки
```
localhost:8080/loan-service/getStatusOrder?orderId=24f35741-df87-47fb-8bd6-b927a720018
```
4. Удаление заявки
```
localhost:8080/loan-service/deleteOrder
```
http body (пример)
```
{
    "userId": 123456,
    "orderId": "b12b25e9-f6be-4c28-9140-ed137bd1f630"
}
```
