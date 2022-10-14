
INSERT INTO TRAITS(TRAIT) VALUES ('Extrovert');
INSERT INTO TRAITS(TRAIT) VALUES ('Lagspelare');
INSERT INTO TRAITS(TRAIT) VALUES ('Nischad');
INSERT INTO TRAITS(TRAIT) VALUES ('Noggrannhet');
INSERT INTO TRAITS(TRAIT) VALUES ('Rättfram');

INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2) VALUES ('LÄRARE', 'Extrovert', 'Lagspelare', 2, 1);
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2) VALUES ('PROGRAMMERARE', 'Nischad', 'Noggrannhet', 1, 2);
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2) VALUES ('BREVBÄRARE', 'Extrovert', 'Rättfram', 1, 2);
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2) VALUES ('POLIS', 'Rättfram', 'Lagspelare', 1, 2);
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2) VALUES ('FASTIGHETSMÄKLARE', 'Extrovert', 'Noggrannhet', 2, 1);

INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Får du energi när du umgås med andra människor?',0,1);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Föredrar du att jobba i grupp framför att jobba självständigt?',0,2);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Föredrar du att använda en beprövad lösning framför att testa nya lösningar?',0,3);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Föredrar du att ha en plan framför att ta det som det kommer?',0,4);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Om du inte håller med en kollega, säger du ifrån då?',0,5);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Får du energi när du umgås med andra människor',0,1);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Föredrar du att jobba i grupp framför att jobba självständigt?',0,2);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Föredrar du att använda en beprövad lösning framför att testa nya lösningar?',0,3);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Föredrar du att ha en plan framför att ta det som det kommer?',0,4);
INSERT INTO QUESTIONS(QUESTION, ANSWER, TRAITS_TRAITSID) VALUES ('Om du inte håller med en kollega, säger du ifrån då?',0,5);
