package counter.client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import counter.dao.counterDAO;
import counter.daoimpl.counterDAOImpl;

public class Client {
	counterDAO counterDAO = new counterDAOImpl();

	@Before
	public void setUp() {
		counterDAO.setFile("C:\\Users\\Cameron\\Documents\\University\\eclipse-workspace\\word-counter\\src\\text.txt");
	}

	@Test
	public void testGetWordCount() {
		setUp();
		Assert.assertEquals(9, counterDAO.getWordCount());
	}

	@Test
	public void testGetFirstNumberForEachLength() {
		setUp();
		Assert.assertEquals(0, counterDAO.getFirstNumberForEachLength());
	}

	@Test
	public void testGetSecondNumberForEachLength() {
		setUp();
		Assert.assertEquals(1, counterDAO.getSecondNumberForEachLength());
	}

	@Test
	public void testGetThirdNumberForEachLength() {
		setUp();
		Assert.assertEquals(1, counterDAO.getThirdNumberForEachLength());
	}

	@Test
	public void testGetFourthNumberForEachLength() {
		setUp();
		Assert.assertEquals(2, counterDAO.getFourthNumberForEachLength());
	}

	@Test
	public void testGetFifthNumberForEachLength() {
		setUp();
		Assert.assertEquals(2, counterDAO.getFifthNumberForEachLength());
	}

	@Test
	public void testGetSeventhNumberForEachLength() {
		setUp();
		Assert.assertEquals(1, counterDAO.getSeventhNumberForEachLength());
	}

	@Test
	public void testGetTenthNumberForEachLength() {
		setUp();
		Assert.assertEquals(0, counterDAO.getTenthNumberForEachLength());
	}
}
