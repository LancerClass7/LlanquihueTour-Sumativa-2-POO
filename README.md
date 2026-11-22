README · MD
#  LlanquihueTourApp – Desarrollo Orientado a Objetos I
 
##  Autor del proyecto
 
- **Nombre completo:** Claudio Jorge Muñoz Olivares
- **Sección:** 2026_204_OL_PRY2202_24684767_PCT
- **Carrera:** Analista Programador Computacional
- **Sede:** Sede Virtual
---
 
##  Descripción general del sistema
 
**LlanquihueTourApp** es una aplicación de consola desarrollada en Java para la agencia de turismo **Llanquihue Tour**, ubicada en la Región de Los Lagos. La agencia ofrece rutas gastronómicas, paseos lacustres y excursiones culturales, y necesitaba dejar atrás la gestión manual de las personas vinculadas a su operación.
 
Esta primera versión se enfoca en la gestión de **guías turísticos**. El sistema:
 
- Lee los datos de los guías desde un archivo externo (`Guias.txt`).
- Valida la información y descarta registros inválidos o con RUT duplicado.
- Carga los guías en una colección dinámica (`ArrayList`).
- Muestra el listado completo por consola.
- Permite filtrar guías por **especialidad** y por **ciudad**.
El proyecto aplica encapsulamiento, composición entre clases, colecciones genéricas, lectura de archivos, manejo de excepciones y organización del código en paquetes funcionales. Es la base para futuras mejoras del sistema de gestión de la agencia.
 
---
 
##  Estructura general del proyecto
 
```
 src/
├── app/         # Clase principal con el método main
├── model/       # Clases de dominio
├── service/     # Lógica de gestión: listado y búsquedas
├── util/        # Utilidades: lectura del archivo de datos
└── resources/   # Archivo de datos Guias.txt
```
 
---
 
##  Clases implementadas
 
| Paquete | Clase | Rol |
|---|---|---|
| `app` | `Main` | Punto de entrada. Carga los datos, muestra el listado y ejecuta los filtros. |
| `model` | `GuiaTuristico` | Representa a un guía: RUT, nombre, teléfono, especialidad, años de experiencia y dirección. Contiene una `Direccion` (**composición**). |
| `model` | `Direccion` | Representa la dirección de un guía: calle, número y ciudad. |
| `service` | `GestorGuias` | Administra la colección de guías. Permite mostrar todos y buscar por especialidad o ciudad. |
| `util` | `LectorArchivo` | Lee `Guias.txt`, valida cada línea y crea los objetos `GuiaTuristico`. |
 
Todas las clases del modelo tienen atributos privados, constructores, getters, setters y método `toString()`.
 
---
 
##  Formato del archivo de datos
 
Cada línea de `Guias.txt` representa un guía y tiene 8 campos separados por punto y coma (`;`):
 
```
rut;nombre;telefono;especialidad;anhosExperiencia;calle;numero;ciudad
```
 
Ejemplo:
 
```
12345678-8;Hernan Rosenberg;999999999;Excursiones Lacustres;5;Vicuna Mackena;4398;Puerto Varas
```
 
El sistema omite y reporta por consola las líneas con estructura incorrecta, formato numérico inválido, campos vacíos, años de experiencia negativos o RUT repetido.
 
---
 
##  Instrucciones para clonar y ejecutar el proyecto
 
1. Clona el repositorio desde GitHub:
```
git clone https://github.com/LancerClass7/LlanquihueTour-Sumativa-2-POO.git
```
 
2. Abre el proyecto en IntelliJ IDEA.
3. Verifica que el archivo `Guias.txt` esté en `src/resources/`.
4. Ejecuta la clase `Main.java` desde el paquete `app`.
5. Revisa la salida en consola: carga de datos, listado completo y resultados de los filtros.
---
 
**Repositorio GitHub:** https://github.com/LancerClass7/LlanquihueTour-Sumativa-2-POO
**Fecha de entrega:** 22-11-2026
 
---
 
© Duoc UC | Escuela de Informática y Telecomunicaciones
