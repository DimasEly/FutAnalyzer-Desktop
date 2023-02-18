SELECT * FROM futanalyzer.usuario;
SELECT * FROM futanalyzer.jogador;
delete from jogador where id = 1;

UPDATE jogador SET nome = "amigo", overall = 88 WHERE id = 21;

insert into usuario values (1, "Dimas", "dimas.ifsul@gmail.com", "123456");
insert into jogador values (1, "Dimas", "88", "0", "1");
insert into Jogador (nome, overall, gols, Usuario_id) values(?, ?, ?, ?);
select * from usuario;