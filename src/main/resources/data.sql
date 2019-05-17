--Veterinaria 1 + clientes + mascotas

insert into veterinaria (id, nombre)
values(1, 'Veterinaria del Parque');

insert into cliente (id, nombre, telefono)
values(1, 'Luis Caligari', '1145659968');
insert into cliente (id, nombre, telefono)
values(2, 'Carla Deponti', '1123245568');
insert into cliente (id, nombre, telefono)
values(3, 'Marcos Fernandez', '11237689');
insert into cliente (id, nombre, telefono)
values(4, 'Claudia Huergo', '1154678899');
insert into cliente (id, nombre, telefono)
values(5, 'Julieta Bertoli', '1198764562');

insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(1,1);
insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(1,2);
insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(1,3);
insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(1,4);
insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(1,5);

insert into mascota (id, nombre)
values (1, 'Charlie');
insert into mascota (id, nombre)
values (2, 'Max');
insert into mascota (id, nombre)
values (3, 'Buddy');
insert into mascota (id, nombre)
values (4, 'Archie');
insert into mascota (id, nombre)
values (5, 'Teddy');
insert into mascota (id, nombre)
values (6, 'Toby');
insert into mascota (id, nombre)
values (7, 'Bailey');
insert into mascota (id, nombre)
values (8, 'Frankie');
insert into mascota (id, nombre)
values (9, 'Ollie');
insert into mascota (id, nombre)
values (10, 'Jack');

insert into cliente_mascotas (cliente_id, mascotas_id)
values (1, 1);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (1, 2);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (2, 3);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (2, 4);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (3, 5);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (3, 6);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (4, 7);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (4, 8);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (5, 9);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (5, 10);


--Veterinaria 2 + clientes + mascotas


insert into veterinaria (id, nombre)
values(2, 'Veterinaria Mastin');

insert into cliente (id, nombre, telefono)
values(6, 'Sebastian Mineo', '1132455678');
insert into cliente (id, nombre, telefono)
values(7, 'Maria Chaz', '1123439856');
insert into cliente (id, nombre, telefono)
values(8, 'Maira Dapia', '1198674453');
insert into cliente (id, nombre, telefono)
values(9, 'Jose Puertas', '1198563345');
insert into cliente (id, nombre, telefono)
values(10, 'Teresa Esposito', '1143564457');

insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(2,6);
insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(2,7);
insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(2,8);
insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(2,9);
insert into veterinaria_clientes (veterinaria_id, clientes_id)
values(2,10);

insert into mascota (id, nombre)
values (11, 'Bella');
insert into mascota (id, nombre)
values (12, 'Ruby');
insert into mascota (id, nombre)
values (13, 'Coco');
insert into mascota (id, nombre)
values (14, 'Molly');
insert into mascota (id, nombre)
values (15, 'Bonnie');
insert into mascota (id, nombre)
values (16, 'Rosie');
insert into mascota (id, nombre)
values (17, 'Daisy');
insert into mascota (id, nombre)
values (18, 'Lucy');
insert into mascota (id, nombre)
values (19, 'Luna');
insert into mascota (id, nombre)
values (20, 'Maggie');

insert into cliente_mascotas (cliente_id, mascotas_id)
values (6, 11);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (6, 12);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (7, 13);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (7, 14);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (8, 15);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (8, 16);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (9, 17);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (9, 18);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (10, 19);
insert into cliente_mascotas (cliente_id, mascotas_id)
values (10, 20);