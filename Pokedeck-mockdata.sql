set search_path to pokedecks;

insert into roles (roleid, role) values
('1', 'admin'), ('2', 'basic');


insert into users (userid, email, username, pw, roleid) values 
('1', 'admin1@pokedeck.net','Admin01' 'passw0rd', '1'),
('2', 'ilovepokemon7@yahoo.com', 'poke5789' 'p@ssword', '2'),
('3', 'pikachu5@gmail.com', 'whoAmI', 'p4$sword', '2'),
('4', 'emailme@outlook.com', 'Javamente_', 'pa$$word', '2'),
('5', 'dora@gmail.com', 'quarty', 'passw8rd', '2');