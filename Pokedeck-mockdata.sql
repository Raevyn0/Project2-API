set search_path to pokedecks;

insert into roles (roleid, role) values
('1', 'admin'), ('2', 'basic');


insert into users (email, username, pw, roleid) values 
('admin1@pokedeck.net','Admin01', 'Passwords', '1'),
('ilovepokemon7@yahoo.com', 'poke5789', 'IHAtePokemon', '2'),
('pikachu5@gmail.com', 'whoAmI', 'ITHinkpokemonAreok', '2'),
('emailme@outlook.com', 'Javamente_', 'pa$$word', '2'),
('dora@gmail.com', 'quarty', 'passw8rd', '2');