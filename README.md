# prueba tecnica

Buen dia se deja arcchivo de configuracion de base de datos motor ORacle daniel.sql

se crea desarrollo con springboot + data jpa en el cual se encuntra dos servicio expuestos 

insertar un mecanico post
http://localhost:1515/mecanico/crearMecanico/
request: 

{
    "tipoDocumento": "CC",
    "documento": 7764777,
    "primerNombre": "MIGUEL",
    "segundoNombre": "ANGEL",
    "primerApellido": "GARCIA",
    "segundoApellido": "PRIETO",
    "celular": "3118597797",
    "direccion": "calle 50",
    "email": "migelgarcia@gmail.com",
    "estado": "0"
}

response 
{
    "s_exito": 0,
    "s_mensaje": "TRANSACCION EXITOSA"
}

mecanicos prioridad get 
http://localhost:1515/listar/prioridad?page=0&size=5
se deja paginador para la vista 
response 

{
    "content": [
        {
            "documento": 1023025588,
            "primerNombre": "Daniel",
            "segundoNombre": "Fernando",
            "primerApellido": "Osorio",
            "segundoApellido": "Cedeno",
            "estado": 3,
            "cantidad": 1
        },
        {
            "documento": 7764777,
            "primerNombre": "MIGUEL",
            "segundoNombre": "ANGEL",
            "primerApellido": "GARCIA",
            "segundoApellido": "PRIETO",
            "estado": 3,
            "cantidad": 1
        },
        {
            "documento": 1000213076,
            "primerNombre": "Assly",
            "segundoNombre": "Vanessa",
            "primerApellido": "Sanchez",
            "segundoApellido": "Perez",
            "estado": 3,
            "cantidad": 1
        },
        {
            "documento": 5439871,
            "primerNombre": "Lorena",
            "segundoNombre": "efy",
            "primerApellido": "Leal",
            "segundoApellido": "Leal",
            "estado": 0,
            "cantidad": 1
        },
        {
            "documento": 543219876,
            "primerNombre": "Maria",
            "segundoNombre": "Daniela",
            "primerApellido": "Corredor",
            "segundoApellido": "Corredor",
            "estado": 0,
            "cantidad": 2
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 5,
        "unpaged": false,
        "paged": true
    },
    "last": false,
    "totalPages": 3,
    "totalElements": 11,
    "size": 5,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 5,
    "first": true,
    "empty": false
}
