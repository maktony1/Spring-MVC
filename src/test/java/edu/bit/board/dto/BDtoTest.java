package edu.bit.board.dto;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.junit.Test;

public class BDtoTest {

	@Test
	public void testBDto() {
		BDto b = new BDto();
		System.out.println(b);
		assertNotNull(b);
	}
	@Test
	public void testBDtoAllArgs() {
		BDto b = new BDto(1,"111","111","111",new Timestamp(9873),1,2,3,4);
		System.out.println(b);
		assertNotNull(b); 
	}
	
	

}
