### Rest Crud with Java
## Como funciona?
1.  Primero se debe consumir el servicio como POST


     {
      "url": "http://localhost:8082/login",
      "method": "POST",
      "timeout": 0,
      "headers": {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      "data": {
        "user": "enrique",
        "password": ""
      }
    }
data:
user: cualquiera(no realizo validación de si la cuenta existe o no)
password: cualquiera
Esto genera un token con ayuda de jwt.io, este token se debe guardar para hacer las operaciones del crud.



    {
        "user": "enrique",
        "password": null,
        "token": "EAAM eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiZW5yaXF1ZSIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJpYXQiOjE2MjU2ODkwOTAsImV4cCI6MTYyNTY4OTY5MH0.q-74aLRj711RyFXGAbpH8R42H7c0_oWp-kucJr0peQ0"
    }

2. CRUD
Todas las llamadas crud deberan llevar en el header el token generado.
Listar tipo POST URL: http://localhost:8082/clientes
Obtener cliente por ID: http://localhost:8082/clientes/1    (numero de id)
Crear cliente POST: http://localhost:8082/clientes
Editar Cliente PUT: http://localhost:8082/clientes/1 (numero de id)
Eliminar Cliente DELETE: http://localhost:8082/clientes/1 (numero de id)

###### Cuerpo para crear y eliminar
 

      {
                "nombre": "Enrique3",
                "apellido": "Arenas",
                "nacimiento": "1992-03-21",
                "email": "e.arenas243@gmail.com",
            }
###### Llamada con el token	


    {
      "url": "http://localhost:8082/clientes/1",
      "method": "PUT",
      "timeout": 0,
      "headers": {
        "Authorization": "EAAM eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiZW5yaXF1ZSIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJpYXQiOjE2MjU2OTAzMjEsImV4cCI6MTYyNTY5MDkyMX0.txgRkvj-CxCKvYuw7OCCxnDxQYQXWkRtcATfReO56bM",
        "Content-Type": "application/json",
        "Cookie": "JSESSIONID=346C2344BA6C21D2F6F6F99C8FF9F1A9"
      },
      "data": JSON.stringify({
        "nombre": "Enrique3",
        "apellido": "Arenas",
        "nacimiento": "1992-03-21",
        "email": "e.arenas24@gmail.com",
        "telefono": 0
      }),
    }
