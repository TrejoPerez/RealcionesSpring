/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  publico
 * Created: 12/10/2016
 */

drop table direccion;

drop table usuario;
drop table email;

select * from usuario;
select * from direccion;
select * from email;

SELECT * FROM usuario INNER JOIN direccion ON usuario.id_usuario=direccion.id_direccion
INNER JOIN email ON usuario.id_usuario=email.id_email WHERE usuario.id_usuario=3;

