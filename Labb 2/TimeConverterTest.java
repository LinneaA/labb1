package se.iths;

import static org.junit.Assert.*;
import org.junit.Test;

public class TimeConverterTest {


	@Test(expected = IllegalArgumentException.class)
	public void minusDigitThrowsIllegalArgumentException() {
		TimeConverter converter = new TimeConverter();
		converter.getMeridiem(-5);
		assertEquals(converter, -5);

	}

	@Test(expected = IllegalArgumentException.class)
	public void toHighDigitThrowsIllegalArgumentException() {
		TimeConverter converter = new TimeConverter();
		converter.getMeridiem(25);
		assertEquals(converter, 25);
	}

	@Test
	public void returningAM() {
		TimeConverter converter = new TimeConverter();
		String returnAM = converter.getMeridiem(7);
		System.out.println(converter.getMeridiem(7));
		assertEquals(returnAM, "AM");

	}

	@Test
	public void returningPM() {
		TimeConverter converter = new TimeConverter();
		String returnPM = converter.getMeridiem(23);
		System.out.println(converter.getMeridiem(23));
		assertEquals(returnPM, "PM");
	}
}