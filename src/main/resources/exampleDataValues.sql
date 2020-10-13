INSERT INTO LOGIN VALUES
(1, 'mail1@gmail.com', 'pass'),
(2, 'mail2@gmail.com', 'pass'),
(3, 'mail3@gmail.com', 'pass3'),
(4, 'mail4@gmail.com', 'pass4');

INSERT INTO SPORT_FACILITIES_CATEGORY  VALUES
(1, 'Ścieżki rowerowe'),
(2, 'Ścieżki biegowe');

INSERT INTO NUTRITIONAL_PRODUCT_CATEGORY   VALUES
(1, 'Mięsne'),
(2, 'Wysokobiałkowe');

INSERT INTO EXERCISE_CATEGORY   VALUES
(1, 'Ogólnorozwojowe'),
(2, 'Wytrzymałościowe');

INSERT INTO SPECIALISATION VALUES
(1, 'Dietetyk'),
(2, 'Trener personalny');

INSERT INTO SPORT_FACILITIES  VALUES
(2, 22.22, true, 'siłownia na oceanie', 33.33, 1),
(3, 33.22, false, 'siłownia na oceanie dwa', 33.66, 1);

INSERT INTO PERSON  VALUES
(1,'2000-12-31', 'Dawid', 'Kapica'),
(2,'1999-10-11', 'Adam', 'Zakrzewski'),
(3,'1998-10-11', 'Rafał', 'Mirowski'),
(4,'1998-10-11', 'Mikołaj', 'Rybak');


INSERT INTO EXPERT VALUES
('Jestem specjalistą 1', 'Politechnika', 1, 1),
('Jestem specjalistą 2', 'Politechnika', 2, 2);

INSERT INTO EXPERT_SPECIALISATION  VALUES
(1, 3, 1, 1),
(2, 1, 1, 2),
(3,2, 2, 2);

INSERT INTO USER VALUES
(3, 3),
(4, 4);

INSERT INTO EXERCISE VALUES
(1, 17,  'rowerstwo górskie', 1),
(2, 31, 'bieganie wytrzymałościowe', 2),
(3, 33, 'bieganie halowe', 2);

INSERT INTO NUTRITIONAL_PRODUCT VALUES
(1, 100, 'jajko', 2),
(2, 350, 'burger', 1);

INSERT INTO CONSUMED_FOOD VALUES
(1, 1, 1, 3),
(2, 2, 2, 4),
(3, 1, 2, 3);


INSERT INTO TRAINING VALUES
(1, 'treing pierwszy', '2020-10-09', 1, 3),
(2, 'trening testowy', '2020-10-10', 2, 3);

INSERT INTO USER_PLAN VALUES
(1, 'opis1', '2020-12-31', 20.04, '2020-10-10', 3),
(2, 'opis2', '2020-11-01', 70, '2021-01-07', 3);

INSERT INTO USER_DETAIL VALUES
(1, 80, '2020-01-01', 3),
(2, 100, '2020-10-10', 3);

INSERT INTO OPINION VALUES
(1, 'opinia1', 1, 3),
(2, 'opinia2', 1, 4),
(3, 'opinia3', 2, 3),
(4, 'opinia4', 2, 4);


