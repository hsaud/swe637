package swe637.hw3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ReservationServiceTest {

	private ReservationService reservationService = null;
	private Customer customer = null;
	private RankingService rankingService = null;
	private RankingService realRankingService = null;

	@Before
	public void setUp() {
		reservationService = new ReservationService();
		customer = new Customer("John Smith", new Rank(10));
		rankingService = mock(RankingService.class); //creates mock
		realRankingService = new RankingService();
	}

	
	@Test
	public void testReservationService() {
		ReservationService spyService = spy(reservationService);
		doNothing().when(spyService).reserve(customer);	
	}

	@Test
	public void testRankingService() {
		Rank rank = new Rank(2);
		customer.setRank(rank);
		when(rankingService.getRank(customer)).thenReturn(rank);
		assertEquals(rankingService.getRank(customer), rank);
	}
	
	@Test
	public void testRealRankingService() {
		Rank rank = new Rank(2);
		customer.setRank(rank);
		when(realRankingService.getRank(customer)).thenReturn(rank);
		assertEquals(realRankingService.getRank(customer), rank);
	}
	
	@Test
	public void testRankingServiceFail() {
		Rank rank = new Rank(2);
		Rank anotherRank = new Rank(10);
		customer.setRank(rank);
		when(rankingService.getRank(customer)).thenReturn(rank);
		assertNotEquals(rankingService.getRank(customer), rank);
	}

	
}
