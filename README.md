![AD1](https://github.com/user-attachments/assets/7e090b06-df3a-4d62-ae3d-1347269afa35)


# Enunciado

Una Empresa tiene recogido en una base de datos los pedidos solicitados por Clientes y el Comercial asociado a la venta. La tabla pedidos recoge el importe total del pedido realizado.

La aplicación la van a usar los jefes de comerciales  para ver la información, tanto de clientes como de sus comerciales.

Tablas:

![tablas_comerciales_clientes](https://github.com/user-attachments/assets/078c3431-edf6-41cd-a5b4-4d329f894e69)

Se adjunta el script del sql

## Ejercicio

  Crear un proyecto Spring web, con Spring data Jpa y MySql 8 para los siguientes servicios web restfull, y probar con postman:


## url y descripción:


/comercial   @RequestMapping(“/comercial”)
 
/alta  Dar de alta el comercial

/eliminar/{id}  Eliminar de la bbdd el comercial cuyo id coincida

/uno/{id}  Devolver los datos del comercial cuyo id coincida

/bycliente/{id}  Devolver la lista de los comerciales que han atendido pedidos del cliente que coincida con ese id.

/conpedidos  Devolver la lista de comerciales que han atendido algún pedido

/pedidos/{id}  Devolver la lista de pedidos gestionados por el comercial que coincida con ese id.

