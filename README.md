# Tarea 1 - Radiografía del sistema

### Alumno

- Anxo Vázquez Lorenzo

### Asignatura

- PSP - Programación de servizos e procesos

## El proceso desde fuera

### Ejecución desde el `IDE`

Ejecuto el programa y cuando entra en espera por la lectura del `scanner`, ejecuto en otra terminal el siguiente comando:

```
ps -ef | grep InformeSistema
```

Al ejecutar el comando anterior se muestran dos entradas, la primera es de `InformeSistema` y la segunda es del `grep` que se uso para filtrar la busqueda dentro de la salida del ps.

El segundo (`PID`) y tercer (`PPID`) campo indican los identificadores del propio proceso y el del padre.

![primer ps](./capturas/ps1-programa.png)

Si realizo la misma búsqueda pero indicando el `PPID` se muestra el proceso padre, que en este caso es el propio `ide` ya que se lanzó desde ahí:

![ppid](./capturas/ps-ppid.png)

### Ejecución desde la terminal

![terminal-ejecución](./capturas/ejecucion-terminal.png)

Compruebo su `pid` y `ppid` y veo que cambian los dos, ahora el padre es `bash` (interprete de comandos) y el `pid` cambio porque el sistema operativo le asignó otro.

![segundo ps](./capturas/ps2-programa.png)

### Ejecución con `Xmx128m`

`Xmx128m` establece la memoria límite que la `JVM` puede usar, al ejecutarlo con ese limite se puede ver que cambia la sección de memoria.

**Limitado:**

![limitado](./capturas/informe-limitado.png)

**Sin limitación:**

![sin-limitacion](./capturas/informe-sin-limitacion.png)

### Ruta archivo `informe.txt`

```
//Sección del código InformeSistema, en la función mostrarMultiplataforma()
System.out.println("Ruta archivo informe.txt: " + System.getProperty("user.home") + System.getProperty("file.separator") + "psp" + System.getProperty("file.separator") + "informe.txt");
```

Esta ruta se vería modificada por el divisor (`file.separator`) y por la ruta del `home`(`user.home`).

Por ejemplo, si fuese en `windows` la salida sería parecida a esta:

```
C:\Usuarios\anxo\psp\informe.txt
```

## Tipo de Programación

- a-Un servidor web que atiende 500 peticiones a la vez en una máquina de 8 núcleos.

```
Programación paralela, ya que aunque la máquina tenga muchos núcleos son muchas peticiones simultáneas y al usar programación concurrente se desperdiciaría los 8 núcleos del procesador. Él único inconveniente sería que, al ser una única máquina,si esa máquina "cae", se cae todo el sistema ya que no es distribuida.
```

- b-Renderizar una película de animación en un plazo de tres meses.

```
Programación concurrente, aunque la tarea sea pesada el plazo es muy grande y, de mientras, los otros procesadores se podrían usar sin problema para otro tipo de tareas.
```

- c-Una app de móvil que descarga un fichero mientras seguís navegando.

```
Programación paralela, se necesitan hacer varias cosas simultáneamente aunque sus tareas sean sencillas, el único inconveniente sería el "desperdicio" de tiempos en los procesadores para estas tareas.
```

- d-Un cálculo que no cabe en la RAM de un solo equipo.

```
Programación distribuida, al ser tan alta la demanda de un recurso (RAM, CPU, disco, etc) se necesitan varios equipos, el inconveniente principal sería el alto costo de estos.
```






