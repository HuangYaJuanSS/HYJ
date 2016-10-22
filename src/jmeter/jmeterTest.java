package jmeter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class jmeterTest {

	jmeter jmTest=new jmeter();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetName() {
		jmTest.setName("xiaoming");
		
	}

	@Test
	public void testSetFriend() {
		jmTest.setFriend("bestFriend");
	}

	@Test
	public void testGetName() {
		testSetName();
		assertEquals("xiaoming",jmTest.getName());
	}

	@Test
	public void testGetFriend() {
		testSetFriend();
		assertEquals("bestFriend",jmTest.getFriend());
	}

}
