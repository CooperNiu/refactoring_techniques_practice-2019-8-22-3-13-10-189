package com.tws.refactoring.extract_method;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    @Disabled
    public void should_return_price_if_input_is_right() {
    	// given
    	OwingPrinter owingPrinter = new OwingPrinter();
    	
    	List<Order> orders = null;
		// when
    	owingPrinter.printOwing("A", orders );
    	// then
        assertEquals("A", outContent.toString());
    }
    
    
}