# Bootcamp fullstack Java Trainee

---

## INTEGRANTES

|NOMBRES                     |    PERFIL GITHUB
|-|-
|Leonel Briones Palacios     |    [jarodsmdev](https://github.com/jarodsmdev)
|Priscila Carrillo           |    [PriscilaCarrillo](https://github.com/PriscilaCarrillo)
|Kevin Moreno                |    [kmra00](https://github.com/kmra00)
|Valentina Saldías           |    [mundenius](https://github.com/mundenius)
|Andrés Contreras            |    [AndresSCP](https://github.com/AndresSCP)

[Enlace Trello aquí](https://trello.com/b/8x0eFHMl/sprint)

Este es un projecto colaborativo realizado en el bootcamp fullstack Java trainee impartido por [Talento Digital](https://talentodigitalparachile.cl/) en las instalaciones de la Universidad Andrés Bello sede Viña del Mar.

![logo Java](https://i.blogs.es/8d2420/650_1000_java/1366_2000.webp)

### CONTEXTO

En la última década, han aumentado los índices de accidentabilidad, especialmente en las empresas del rubro industrial, minero y construcción. Las cifras son alarmantes, a pesar de las leyes y normativas que obligan a las empresas a tomar todas las medidas necesarias para protegerla vida y salud de los trabajadores. Para dar cumplimiento a la normativa y mantener ambientes de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría profesional, lo cual representa un costo elevado y fomenta la disminución o la no implementación de medidas necesarias para la seguridad. Muchas de las empresas que han optado por no invertir en asesoría preventiva, se ven expuestas a aplicación de multas de las entidades fiscalizadoras, gastos por días perdidos en accidentabilidad, bajas en la producción,
alzas en el pago de cotizaciones (al organismo administrador del seguro de accidentes del trabajo, ley 16.744), entre otros. Además, hay que considerar posibles demandas y pagos de indemnizaciones a lostrabajadores y familiares afectados por accidentes del trabajo.
Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos laborales y necesita una solución tecnológica que ayude a administrar los procesos que se deben ejecutar en cada una de las empresas que son clientes de la compañía. Este servicio finalmente pretende ofrecer una solución completa en prevención de riesgos para las empresas a un costo razonable, cumpliendo estrictamente todos los procesos necesarios para dar cumplimiento a la normativa vigente, mejorando los ambientes de trabajo, la productividad, contribuyendo a un ahorro económico.

### PROBLEMA

La empresa no posee un sistema de información que le permita administrar toda la cantidad de información que se genera, ni controlar las actividades y el recurso humano.Existen problemas con la planificación de las visitas, generalmente los profesionales están en terreno por lo que no están disponibles para informarles sus actividades futuras. No existe registro del profesional que ha estado con mayor actividad ni se sabe dónde está cada uno. Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el cliente. Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la ejecución de la capacitación, lo que trae consigo multas para la empresa. No se tiene un control de los clientes que pagan y los que no, lo que hace que muchas actividades de los
profesionalescorran por cuenta de la empresa, generando desbalances financieros. Las actividades se registran en carpetas lo que dificulta el seguimiento de las asesorías y el resumen de resultados por empresa. Además, generalmente no se cumplen ciertas actividades de control de implementación de soluciones y a veces no se ha cumplido con la dirección del trabajo, lo que genera multas para los clientes, bajando la calidad del servicio. Los profesionales que han atendido la empresa esporádicamente han variado, no existiendo un registro de la totalidad deactividades preventivas realizadas y no se tiene certeza de los avances.

### SOLUCIÓN

Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información para la empresa y sus clientes. El sistema debe permitir la planificación de actividades y el controlde ejecución de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales y los clientes para la respuesta temprana ante incidentes de seguridad. Además, se requiere queel sistema genere reportes y estadísticas que ayuden a tomar de decisiones y mejorar elrendimiento de la empresa, considerando la carga laboral, y la demanda de clientes y las actividades que cada uno involucra para el cumplimiento de los contratos. Es imprescindible, mantener comunicación con los profesionales en todo momento, aún en terreno, y darle la posibilidad de realizar todas sus actividades aun no teniendo conectividad (internet), ya que muchas empresas se encuentran en zonas donde no
hay conexión de ese tipo.

### IDE DE DESARROLLO:

> Eclipse

### DESARROLLO:

Todas las clases tienen declarados sus atributos, su metodo toString (), un constructor que no recibe parámetros, un constructor que recibe todos los atributos de la clase como parámetros, métodos mutadores y métodos acceso res.
Se creó una interface llamada Asesoría, la que tiene declarado el método analizarUsuario() y por ser una interface, solo de considera la declaración del método.

Se han definido entidades al sistema y las validaciones correspondientes que se aplican en cada atributo, las cuales son:

    Usuario:
    Cliente: -> Se extiende desde la clase Usuario.
    Profesional: -> Se extiende desde la clase Usuario.
    Administrativo: -> Se extiende desde la clase Usuario.
    Capacitación:
    Accidente:
    Visita en terreno:
    Revisión:

En cada clases existen los siguientes métodos adicionales:

    Usuario: el método mostrarEdad (), el cual retorna un mensaje que dice “El usuario tiene X años” y en donde X es la edad del usuario en cuestión, y el método analizar Usuario (), se despliega el nombre y el RUN, además, esta clase  se implementa la interface Asesoría.
    Cliente: el método obtenerNombre(), el cual retorna un String con el nombre completo del cliente (nombres + apellidos), el método obtenerSistemaSalud() que de acuerdo al valor registrado en el objeto despliega el tipo de sistema de salud, y el método analizarUsuario() se despliegan los datos del método del mismo nombre correspondiente a la clase padre y la dirección del cliente junto con la comuna.
    Profesional:  Se implementa el método analizarUsuario(), el que despliega los datos del método del mismo nombre de la clase padre, y el título y fecha de ingreso del profesional.
    Administrativo: el método analizarUsuario(), el cual muestra los datos del método del mismo nombre correspondiente a la clase padre, junto con el área a la que pertenece el administrativo y su experiencia previa.
    Capacitación: el método mostrarDetalle(), retorna un mensaje con el texto “La capacitación será en A a las B del día C, y durará D minutos”, en donde A es el lugar, B es la hora, C es el día y D son los minutos.
    Accidente:
    Visita en terreno:
    Revisión:

Se crea la clase Contenedor, la cual tiene tener declarado como atributos dos listas:

- Una lista de instancias de la interface Asesoria y en esta lista se tienen almacenados distintos tipos de usuarios.
- Una lista de objetos de la clase Capacitacion.
  
En esta clase **Contenedor** se tienen los siguientes métodos:

**Almacenar cliente:** permite agregar un nuevo cliente a la lista de instancias de la interface Asesoria.

**Almacenar profesional:** permite agregar un nuevo profesional a la lista de instancias de la interface Asesoria.

**Almacenar administrativo:** permite agregar un nuevo administrativo a la lista de instancias de la interface Asesoria.

**Almacenar capacitación:** permite agregar una nueva capacitación a la lista deinstancias de la clase Capacitación.

**Eliminar usuario:** permite eliminar un usuario desde la lista de interfaces de Asesoría acuerdo con el RUN del usuario.

**Listar usuarios:** permite desplegar la lista completa de usuarios, independiente del tipo. En este método solo se deben desplegar los datos de la clase usuario.

**Listar usuarios por tipo:** recibe un tipo de usuario (cliente, administrador o profesional), y retorna los datos respectivos según el tipo de usuario.

**Listar capacitaciones**: este método despliega las capacitaciones registradas en la lista respectiva, junto con los datos del cliente al que está asociada dicha
capacitación.

Finalmente, se crea la clase Principal, la que tiene como objetivo crear una instancia de la clase Contenedor, lo que crea con ello las dos listas que considera esta clase. Posterior a esto, se crea un menú principal con nueve opciones: ocho para las acciones indicadas en el listado anterior, y una opción para salir del programa. En caso de que se ingrese una opción incorrecta, se debe pide nuevamente. El programa solo terminará una vez que ingrese la opción de salida.
