
INSERT INTO TRAITS(TRAIT) VALUES ('Extrovert');
INSERT INTO TRAITS(TRAIT) VALUES ('Lagspelare');
INSERT INTO TRAITS(TRAIT) VALUES ('Självständig');
INSERT INTO TRAITS(TRAIT) VALUES ('Nyfiken');
INSERT INTO TRAITS(TRAIT) VALUES ('Flexibel');
INSERT INTO TRAITS(TRAIT) VALUES ('Noggrann');

INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('LÄRARE', 'Flexibel', 'Noggrann', 3, 2,'Du är flexibel och noggrann! Därför skulle du passa som Lärare. <br> Vill du veta mer om detta yrke, <a href="https://www.lararforbundet.se/artiklar/sa-blir-du-larare/">klicka här!</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('PROGRAMMERARE', 'Självständig', 'Nyfiken', 2, 3, 'Du är självständig och nyfiken! Därför skulle du passa som Programmerare. <br> Vill du veta mer om detta yrke, <a href="https://www.awacademy.se/">klicka här!</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('SJUKSKÖTERSKA', 'Lagspelare', 'Flexibel', 3, 2,'Du är flexibel och en lagspelare! Därför skulle du passa som Sjuksköterska. <br> Vill du veta mer om detta yrke, <a href="https://www.studera.nu/jamfor-utbildning/sjukskoterska/">klicka här!</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('POLIS', 'Extrovert', 'Lagspelare', 2, 2,'Du är extrovert och en lagspelare! Därför skulle du passa som Polis. <br> Vill du veta mer om detta yrke, <a href="https://polisen.se/jobb-och-utbildning/bli-polis/">klicka här</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('EKONOM', 'Extrovert', 'Noggrann', 2, 3,'Du är extrovert och noggrann! Därför skulle du passa som Ekonom. <br> Vill du veta mer om detta yrke, <a href="https://www.studera.nu/jamfor-utbildning/studera-till-ekonom/">klicka här!</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('JURIST', 'Självständig', 'Noggrann', 2, 3,'Du är självständig och noggrann! Därför skulle du passa som Jurist. <br> Vill du veta mer om detta yrke, <a href="https://www.studera.nu/jamfor-utbildning/jurist/">klicka här!</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('INGENJÖR', 'Nyfiken', 'Självständig', 2, 3,'Du är nyfiken och självständig! Därför skulle du passa som Ingenjör. <br> Vill du veta mer om detta yrke, <a href="https://www.framtid.se/yrke/ingenjor">klicka här!</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('PILOT', 'Flexibel', 'Noggrann', 2, 3,'Du är flexibel och noggrann! Därför skulle du passa som Pilot. <br> Vill du veta mer om detta yrke, <a href="https://www.studentum.se/utbildning/pilotutbildning">klicka här!</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('PSYKOLOG', 'Nyfiken', 'Flexibel', 3, 2,'Du är nyfiken och flexibel! Därför skulle du passa som Psykolog. <br> Vill du veta mer om detta yrke, <a href="https://www.studera.nu/jamfor-utbildning/psykolog/">klicka här!</a> <br>');
INSERT INTO PROFESSION (TITLE, TRAIT1, TRAIT2, POINTS1, POINTS2, DESCRIPTION) VALUES ('ELEKTRIKER', 'Självständig', 'Noggrann', 2, 3,'Du är självständig och noggrann! Därför skulle du passa som Elektriker. <br> Vill du veta mer om detta yrke, <a href="https://www.gymnasium.se/yrkesguiden/elektriker-11070">klicka här!</a> <br>');

INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('På en stor middag föredrar jag att stifta bekantskap med så många som möjligt hellre än att ha djupgående samtal med ett fåtal.',1);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag vill helst ha en aktiv, drivande roll i en arbetsgrupp.',2);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag tycker det är lättare att jobba mot uppsatta mål på egen hand.',3);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag ställer gärna frågor när jag behöver eller vill veta mer om något.',4);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Om jag har tid tar jag gärna på mig arbetsuppgifter trots att de inte ingår i min yrkesroll.',5);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag tar gärna lite extra tid på mig för att säkerställa att jag inte missat någonting.',6);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('När jag är på fest föredrar jag att stå i centrum.',1);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Om någon i mitt team har gjort ett misstag försäkrar du hen om att det är ok och hjälper dem att rätta till misstaget.',2);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag är mer effektiv i eget arbete än i gruppprojekt.',3);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag lär mig gärna nya sätt att utföra arbetsuppgifter.',4);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Om en kollega inte hinner med sina arbetsuppgifter hjälper jag gärna till.',5);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag följer helst instruktioner noggrant.',6);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag spenderar helst större delen av min fritid i sällskap med andra.',1);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag lyssnar uppmärksamt på andras åsikter och idéer, även om jag inte håller med om dem.',2);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('När jag är osäker på hur jag ska lösa en uppgift försöker jag hitta lösningen på egen hand hellre än att fråga en kollega.',3);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Det är spännande att utforska och förstå nya saker.',4);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Det är roligt när det dyker upp nya utmaningar under arbetsdagen.',5);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag föredrar att jobba metodiskt framför att improvisera.',6);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag är vanligtvis en pratglad person.',1);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag bidrar med positiv energi och laganda i en arbetsgrupp.',2);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag tycker att risken för att något blir fel är större när man arbetar i grupp.',3);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag testar gärna nya tillvägagångssätt.',4);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Det känns okej om min chef ber mig jobba över någon gång då och då.',5);
INSERT INTO QUESTIONS(QUESTION, TRAITS_TRAITSID) VALUES ('Jag ställer många frågor inför en ny uppgift.',6);
