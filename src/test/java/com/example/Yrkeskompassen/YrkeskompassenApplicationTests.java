package com.example.Yrkeskompassen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class YrkeskompassenApplicationTests {

	@Autowired
	KompassService service;

	@Autowired
	ProfessionRepository professionRepository;
	@Autowired
	TraitsRepository traitsRepository;
	@Autowired
	QuestionRepository questionRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void matchTraitsAndProfession() {
		List<Profession> p = (List)professionRepository.findAll();
		List<Traits> t = (List)traitsRepository.findAll();

		for (Traits traits : t) {
			traits.setPoints(3);
		}

		List<String> match = service.matchTraitsAndProfession(p, t);

		Assertions.assertEquals("LÄRARE", match.get(0));
	}

	@Test
	void addPoints() {
		List<Traits> t = new ArrayList<>();
		t.add(new Traits(1l, "EXTROVERT", 1));
		List<Questions> q = (List)questionRepository.findAll();
		Questions question = q.get(0);

		t = service.addPointsOrNewTrait(t, question);

		Assertions.assertEquals(2 , t.get(0).getPoints());
	}
	@Test
	void addNewTrait() {
		List<Traits> t = new ArrayList<>();
		List<Questions> q = (List)questionRepository.findAll();
		Questions question = q.get(0);

		t = service.addPointsOrNewTrait(t, question);

		Assertions.assertEquals(1 , t.get(0).getPoints());
		Assertions.assertEquals("EXTROVERT" , t.get(0).getTrait());
	}

}
