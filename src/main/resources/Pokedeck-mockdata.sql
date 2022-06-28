set search_path to pokedecks;

insert into roles (roleid, role) values
('1', 'admin'), ('2', 'basic');


insert into users (email, username, pw, roleid) values 
('admin1@pokedeck.net','Admin01', 'Passwords', '1'),
('ilovepokemon7@yahoo.com', 'poke5789', 'IHAtePokemon', '2'),
('pikachu5@gmail.com', 'whoAmI', 'ITHinkpokemonAreok', '2'),
('emailme@outlook.com', 'Javamente_', 'pa$$word', '2'),
('dora@gmail.com', 'quarty', 'passw8rd', '2');

insert into cards(cardid, cardurl) values
	('xy5-1', 'https://api.pokemontcg.io/v2/cards/xy5-1'),
	('ex12-1', 'https://api.pokemontcg.io/v2/cards/ex12-1'),
	('pl3-1', 'https://api.pokemontcg.io/v2/cards/pl3-1');

insert into userdeckcards  ( userid, cardid, quantity) values
	(1, 'xy5-1', 2),
	(1, 'ex12-1', 1),
	(2, 'pl3-1', 1),
	(2, 'xy5-1', 1),
	(3, 'ex12-1', 2);

insert into userfavoritecards (userid, cardid) values
	(1, 'pl3-1'),
	(1, 'ex12-1'),
	(1, 'pl3-1'),
	(2, 'ex12-1'),
	(3, 'pl3-1'),
	(3, 'xy5-1');