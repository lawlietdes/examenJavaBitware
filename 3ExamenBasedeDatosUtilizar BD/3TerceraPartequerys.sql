--1.	Generar script para poblar todas las tablas
/*
Estos script se adjuntan junto con este documento

*/
--2.	Mostrar el número de ventas de cada producto, ordenado de más a menos ventas.

	SELECT  p.nombre, COUNT(v.producto) AS numeroDeVentas
	FROM productos p
	JOIN venta v 
	ON p.producto = v.producto
	GROUP BY v.producto,p.nombre
	ORDER BY numeroDeVentas DESC;

--3.	Obtener un informe completo de ventas, indicando el nombre del cajero que realizo la venta, nombre y precios de los productos vendidos, y el piso en el que se encuentra la máquina registradora donde se realizó la venta.

	SELECT c.nomapels,p.nombre,p.precio,mr.piso
	FROM productos p
	INNER JOIN venta v
	ON p.producto = v.producto
	INNER JOIN cajeros c 
	ON c.cajero = v.cajero
	INNER JOIN maquinas_regristradoras mr
	ON v.maquina = mr.maquina;

--4.	Obtener las ventas totales realizadas en cada piso.
	SELECT p.nombre,mr.piso,COUNT(v.producto)
	FROM productos p
	INNER JOIN venta v
	ON p.producto = v.producto
	INNER JOIN maquinas_regristradoras mr
	ON v.maquina = mr.maquina
	GROUP BY v.producto,p.nombre,mr.piso;
--5.	Obtener el código y nombre de cada cajero junto con el importe total de sus ventas.

	SELECT v.cajero,c.nomapels,SUM(p.precio) importeTotVentas
	FROM productos p
	INNER JOIN venta v
	ON p.producto = v.producto
	INNER JOIN cajeros c 
	ON c.cajero = v.cajero
	GROUP BY v.cajero,c.nomapels;

--6.	Obtener el código y nombre de aquellos cajeros que hayan realizado ventas en pisos cuyas ventas totales sean inferiores a los 5000 pesos.
--Para que sea mas visible deje el piso aunque no sea requerido
	SELECT   piso, codigo, nombre , importeTotVentas FROM(
		SELECT mr.piso AS piso, v.cajero AS codigo,c.nomapels AS nombre, SUM(p.precio) AS importeTotVentas
		FROM productos p
		INNER JOIN venta v
		ON p.producto = v.producto
		INNER JOIN cajeros c 
		ON c.cajero = v.cajero
		INNER JOIN maquinas_regristradoras mr
		ON v.maquina = mr.maquina
		GROUP BY mr.piso,v.cajero,c.nomapels
		)AS customquery 
	WHERE CAST(importeTotVentas as decimal) < 5000;
