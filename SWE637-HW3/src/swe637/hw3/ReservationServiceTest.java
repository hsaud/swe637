package swe637.hw3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class ReservationServiceTest {

	private ReservationService reservationService = null;
	private Customer customer = null;
	private RankingService rankingService = null;

	@Before
	public void setUp() {
		reservationService = new ReservationService();
		customer = new Customer("John Smith", new Rank(10));
		rankingService = mock(RankingService.class); //creates mock
	}

	
	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testReservationService() {
		reservationService.reserve(customer);
		//how to assert reservation is successful?
	}

	@Test
	public void testRankingService() {
		Rank rank = new Rank(2);
		customer.setRank(rank);
		when(rankingService.getRank(customer)).thenReturn(rank);
		assertEquals(rankingService.getRank(customer), rank);
	}

}
