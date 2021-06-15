INSERT INTO productos (producto, nombre, precio) VALUES(1, 'producto1', 100);
INSERT INTO productos (producto, nombre, precio) VALUES(2, 'producto2', 200.00);
INSERT INTO productos (producto, nombre, precio) VALUES(3, 'producto3', 300.00);
INSERT INTO productos (producto, nombre, precio) VALUES(4, 'producto4', 400.00);
INSERT INTO productos (producto, nombre, precio) VALUES(5, 'producto5', 5001.00);


INSERT INTO cajeros (cajero, nomapels) VALUES(1, 'cajero1');
INSERT INTO cajeros (cajero, nomapels) VALUES(2, 'cajero2');
INSERT INTO cajeros (cajero, nomapels) VALUES(3, 'cajero3');
INSERT INTO cajeros (cajero, nomapels) VALUES(4, 'cajero4');


INSERT INTO maquinas_regristradoras (maquina, piso) VALUES(1, 1);
INSERT INTO maquinas_regristradoras (maquina, piso) VALUES(2, 2);
INSERT INTO maquinas_regristradoras (maquina, piso) VALUES(3, 3);


INSERT INTO venta (cajero, maquina, producto) VALUES(1, 2, 5);
INSERT INTO venta (cajero, maquina, producto) VALUES(1, 2, 5);
INSERT INTO venta (cajero, maquina, producto) VALUES(1, 2, 2);
INSERT INTO venta (cajero, maquina, producto) VALUES(2, 1, 1);
INSERT INTO venta (cajero, maquina, producto) VALUES(2, 3, 3);
