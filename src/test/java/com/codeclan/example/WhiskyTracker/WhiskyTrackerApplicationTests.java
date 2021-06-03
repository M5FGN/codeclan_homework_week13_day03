package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	void contextLoads() {
	}

	//Fix Me
	// Note: Year and Age seem to be muddled - others in class had this issue too.
	@Test
	public void canFindWhiskyByYear() {
		List<Whisky> foundWhiskies = whiskyRepository.findByYear(15);
		assertEquals(2, foundWhiskies.size());
	}

	@Test
	public void canFindDistilleryByRegion() {
		List<Distillery> foundDistilleries = distilleryRepository.findByRegion("Speyside");
		assertEquals("Macallan", foundDistilleries.get(0).getName());
	}

//	@Test
//	public void canFindbyDistilleryAndAge() {
//		List<Whisky> foundWhiskies = whiskyRepository.findByDistilleryAndAge("Macallan", 2018);
//		assertEquals(1, foundWhiskies.size());
//	}
}
