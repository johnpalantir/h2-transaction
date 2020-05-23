# h2-transaction

sample project for h2 memory database


~~~
CustomerController just for testing purpose and play around. 

http://localhost:8080/h2-console
save: http://localhost:8080/api/v1/customer
{
	"name":"test order"
}
get: http://localhost:8080/api/v1/customer/1
~~~




~~~
Order Controller Professional coding used doctor to place medice for 
patient
save : http://localhost:8080/api/v1/orders
payload
{
    "name": "test order",
    "address": {
        "streetNo": "street no",
        "streetName": "stree name",
        "city": "city",
        "state": "state",
        "couuntry": "country",
        "code": "code"
    }
}
