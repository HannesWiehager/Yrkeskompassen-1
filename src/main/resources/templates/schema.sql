CREATE TABLE QUESTIONS(
  QUESTIONSID BIGINT AUTO_INCREMENT PRIMARY KEY,
  QUESTION VARCHAR(250) NOT NULL,
    ANSWER BIT NOT NULL,
    TRAITSID BIGINT,
    FOREIGN KEY(TRAITSID) REFERENCES TRAITS(TRAITSID)
);
CREATE TABLE TRAITS(
  TRAITSID BIGINT AUTO_INCREMENT PRIMARY KEY,
  TRAIT VARCHAR(250) NOT NULL,
    POINTS BIGINT NOT NULL
);