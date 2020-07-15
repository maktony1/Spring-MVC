package edu.bit.board.dto;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.Test;

import edu.bit.board.dao.BDao;

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
		System.out.println("b  "+b);
		assertNotNull(b); 
	}
	
	
	@Test
	public void testBDao() {
		BDao dao = new BDao();
		System.out.println("dao  "+dao);
		assertNotNull(dao); 
	}
	
	@Test
	public void testBDaolist() {
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		System.out.println("list   "+dao.list());
		assertNotNull(dao.list()); 
	}
	
	

}
