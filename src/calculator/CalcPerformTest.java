package calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class CalcPerformTest{

	@Test
	public void calcPTest() {
		Calculator mockedCal = mock(Calculator.class);
		when(mockedCal.add(10, 20)).thenReturn(30);
		CalcPerform cp = new CalcPerform();
		cp.setCal(mockedCal);//mock 주입
		assertEquals(30, cp.calResult(1, 10, 20));
	}
	
	
}
