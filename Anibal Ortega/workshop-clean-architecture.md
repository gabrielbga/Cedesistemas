# Resolver el taller y agregarlo a la carpeta creada con su nombre en git.

1. Indique las capas en las que se dividen la arquitectura limpia.

- Frameworks & Drivers
- Interface Adapter
- Application Business Rules
- Enterprise Business Rules

2. Clasifique los siguientes componentes de acuerdo a las capas de clean arquitectura:

Entidades: _Enterprise Business Rules_
Infraestructura: _Frameworks & Drivers_
API's: _Interface Adapter_
Gateways: _Interface Adapter_
UI: _Frameworks & Drivers_
Casos de Uso: _Application Business Rules_
Web: _Frameworks & Drivers_
Databases: _Frameworks & Drivers_
Dispositivos: _Frameworks & Drivers_

3. Describa el principio de abstracción definido en arquitecturas limpias.

- Lograr definir solo reglas de negocio en las capas de dominio o aplicación.

4. Es posible que una capa haga referencia a una capa interna de la arquitectura?

- Si, Las capas externas de la arquitectura hacen referencia a las capas internas, nunca las capas internas deben depender de las capas externas.

5. Cual es la definición de API?

- Es una interfaz de aplicación que me ptermine encapsular una o un conjunto de funciones de un dominio para asi establecer comunicación entre sistemas.

6. En sus propias palabras especifique acoplamiento y cohesión he indique cual es la mejor configuración que se debe mantener para que un sistema conserve los principios de arquitecturas limpias.

- El acomplamiento nos indica que existe una dependencia alta entre 2 componentes, esto quiere decir que si existe un cambio en alguna de las partes la otra también se ve afectada. La cohesión nos indica que un componente de software representa y actua bajo la naturaleza que se le ha definido.
  Un sistema debe ser bajo acoplamiento y alta cohesion en componentes de software.

7. Mencione y describa las partes de los casos de uso.

- Lógica de negocio que resuelve el caso de uso _(Interactor)_
- Input que recibe los datos de las capas externas que se comunican con el caso de uso. _(Controller)_
- Output que entrega los datos de respuesta del caso de uso. _(Presenter)_

8. Diagramación de casos de uso (tiempo 40 minutos):

- Una empresa comercializadora, desea invertir en el desarrollo de un sistema orientado al control de las ventas de sus productos, los requerimientos que el sistema debe satisfacer son:

  A. Permitir que los Vendedores registren las ventas, para ello deberán consultar el saldo de los productos.

  B. Permitir al Jefe de Recursos Humanos administrar al personal de ventas, registrando, actualizando y eliminando a los diferentes vendedores que ingresen o salgan de la empresa.

  C. El Gerente de Ventas podrá consultar los siguientes reportes:

  - Ventas diarias.
  - Ventas dentro de un rango de fechas.
  - Ventas de un producto en particular.
  - Vendedores existentes en la empresaoVendedores que tienen una ruta a seguir.

9. Teniendo en cuenta el ejemplo anterior y luego de definir los casos de uso especifique que componentes deberia tener y en a que capa de arquitecturas limpias pertenece.
