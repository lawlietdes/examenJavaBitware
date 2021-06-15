

CREATE TABLE bitware.productos (
	producto serial NOT NULL,
	nombre varchar(100) NOT NULL,
	precio money NOT NULL,
	CONSTRAINT productos_pk PRIMARY KEY (producto)
);


CREATE TABLE bitware.cajeros (
	cajero serial NOT NULL,
	nomapels varchar(255) NOT NULL,
	CONSTRAINT cajeros_pk PRIMARY KEY (cajero)
);


CREATE TABLE bitware.maquinas_regristradoras (
	maquina serial NOT NULL,
	piso int4 NOT NULL,
	CONSTRAINT maquinas_regristradoras_pk PRIMARY KEY (maquina)
);


CREATE TABLE bitware.venta (
	cajero int4 NULL,
	maquina int4 NULL,
	producto int4 NULL,
	CONSTRAINT venta_fk FOREIGN KEY (producto) REFERENCES bitware.productos(producto),
	CONSTRAINT venta_fk_1 FOREIGN KEY (cajero) REFERENCES bitware.cajeros(cajero),
	CONSTRAINT venta_fk_2 FOREIGN KEY (maquina) REFERENCES bitware.maquinas_regristradoras(maquina)
);