/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;

/**
 *
 * @author Tahmid Sajin
 */
public class FlightTest extends TestCase{
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    public static Flight flightInitialTest = new Flight(1030, "Toronto", "London", "03/02/99 7:50 pm", 100, 1000.0D);
    
    @Test
    public void testConstructor() {
        Flight testFlightInput = new Flight(flightInitialTest);
        
        Assert.assertEquals(testFlightInput.getFlightNumber(), flightInitialTest.getFlightNumber(), 0.0D);
        Assert.assertEquals(testFlightInput.getOrigin(), flightInitialTest.getOrigin());
        Assert.assertEquals(testFlightInput.getDestination(), flightInitialTest.getDestination());
        Assert.assertEquals(testFlightInput.getDepartureTime(), flightInitialTest.getDepartureTime());
        Assert.assertEquals(testFlightInput.getCapacity(), flightInitialTest.getCapacity(), 0.0D);
        Assert.assertEquals(testFlightInput.getNumberOfSeatsLeft(), flightInitialTest.getNumberOfSeatsLeft()); //Number of seats left may not need 0.0D at the end
        Assert.assertEquals(testFlightInput.getOriginalPrice(), flightInitialTest.getOriginalPrice(), 0.0D);
        
        testFlightInput = new Flight(flightInitialTest.getFlightNumber(), flightInitialTest.getOrigin(), flightInitialTest.getDestination(), flightInitialTest.getDepartureTime(), flightInitialTest.getCapacity(), flightInitialTest.getOriginalPrice());
        
        Assert.assertEquals(testFlightInput.getFlightNumber(), flightInitialTest.getFlightNumber(), 0.0D);
        Assert.assertEquals(testFlightInput.getOrigin(), flightInitialTest.getOrigin());
        Assert.assertEquals(testFlightInput.getDestination(), flightInitialTest.getDestination());
        Assert.assertEquals(testFlightInput.getDepartureTime(), flightInitialTest.getDepartureTime());
        Assert.assertEquals(testFlightInput.getCapacity(), flightInitialTest.getCapacity(), 0.0D);
        Assert.assertEquals(testFlightInput.getNumberOfSeatsLeft(), flightInitialTest.getNumberOfSeatsLeft()); //Number of seats left may not need 0.0D at the end
        Assert.assertEquals(testFlightInput.getOriginalPrice(), flightInitialTest.getOriginalPrice(), 0.0D);
    }
    
    @Test
    public void testInvalidConstructor() {
        
    }
    
    @Test
    public void testSetFlightNumber() {
        //System.out.println("setFlightNumber");
        //int flightNumber = 0;
        //Flight instance = null;
        //instance.setFlightNumber(flightNumber);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Manually typed code
        Flight testFlightInput = new Flight(flightInitialTest);
        
        testFlightInput.setFlightNumber(1020);
        Assert.assertEquals(1020.0D, testFlightInput.getFlightNumber(), 0.0D);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        //System.out.println("setOrigin");
        //String origin = "";
        //Flight instance = null;
        //instance.setOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Flight testFlightInput = new Flight(flightInitialTest);
        
        testFlightInput.setOrigin("Montreal");
        Assert.assertEquals("Montreal", testFlightInput.getOrigin());
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        //System.out.println("setDestination");
        //String destination = "";
        //Flight instance = null;
        //instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Flight testFlightInput = new Flight(flightInitialTest);
        
        testFlightInput.setDestination("Vancouver");
        Assert.assertEquals("Vancouver", testFlightInput.getDestination());

    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        //System.out.println("setDepartureTime");
        //String departureTime = "";
        //Flight instance = null;
        //instance.setDepartureTime(departureTime);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Flight testFlightInput = new Flight(flightInitialTest);
        
        testFlightInput.setDepartureTime("05/05/20 5:00 pm");
        Assert.assertEquals("05/05/20 5:00 pm", testFlightInput.getDepartureTime());
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        //System.out.println("setCapacity");
        //int capacity = 0;
        //boolean planeVacant = false;
        //Flight instance = null;
        //boolean expResult = false;
        //boolean result = instance.setCapacity(capacity, planeVacant);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Flight testFlightInput = new Flight(flightInitialTest);
        boolean vacant = testFlightInput.setCapacity(110, false);
        Assert.assertEquals(Boolean.valueOf(vacant), Boolean.valueOf(false));
        
        testFlightInput = new Flight(flightInitialTest);
        vacant = testFlightInput.setCapacity(90, false);
        Assert.assertEquals(Boolean.valueOf(vacant), Boolean.valueOf(false));
        
        testFlightInput = new Flight(flightInitialTest);
        vacant = testFlightInput.setCapacity(110, true);
        Assert.assertEquals(Boolean.valueOf(vacant), Boolean.valueOf(true));
        
        testFlightInput = new Flight(flightInitialTest);
        vacant = testFlightInput.setCapacity(90, true);
        Assert.assertEquals(Boolean.valueOf(vacant), Boolean.valueOf(true));
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        //System.out.println("setNumberOfSeatsLeft");
        //int numberOfSeatsLeft = 0;
        //Flight instance = null;
        //instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Flight testFlightInput = new Flight(flightInitialTest);
        
        testFlightInput.setNumberOfSeatsLeft(20);
        Assert.assertEquals(20, testFlightInput.getNumberOfSeatsLeft());

    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        //System.out.println("setOriginalPrice");
        //double originalPrice = 0.0;
        //Flight instance = null;
        //instance.setOriginalPrice(originalPrice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Flight testFlightInput = new Flight(flightInitialTest);
        
        testFlightInput.setOriginalPrice(900.0D);
        Assert.assertEquals(900.0D, testFlightInput.getOriginalPrice(), 0.0D);

    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        //System.out.println("getFlightNumber");
        //Flight instance = null;
        //int expResult = 0;
        //int result = instance.getFlightNumber();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        //System.out.println("getOrigin");
        //Flight instance = null;
        //String expResult = "";
        //String result = instance.getOrigin();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        //System.out.println("getDestination");
        //Flight instance = null;
        //String expResult = "";
        //String result = instance.getDestination();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        //System.out.println("getDepartureTime");
        //Flight instance = null;
        //String expResult = "";
        //String result = instance.getDepartureTime();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        //System.out.println("getCapacity");
        //Flight instance = null;
        //int expResult = 0;
        //int result = instance.getCapacity();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        //System.out.println("getNumberOfSeatsLeft");
        //Flight instance = null;
        //int expResult = 0;
        //int result = instance.getNumberOfSeatsLeft();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        //System.out.println("getOriginalPrice");
        //Flight instance = null;
        //double expResult = 0.0;
        //double result = instance.getOriginalPrice();
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        //System.out.println("bookASeat");
        //Flight instance = null;
        //boolean expResult = false;
        //boolean result = instance.bookASeat();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Flight testFlightInput = new Flight(flightInitialTest);
        boolean vacant = testFlightInput.setCapacity(110, false);
        Assert.assertEquals(Boolean.valueOf(vacant), Boolean.valueOf(false));
        
        vacant = testFlightInput.setCapacity(flightInitialTest.getCapacity(), false);
        Assert.assertEquals(testFlightInput.getNumberOfSeatsLeft(), 100L);
        Assert.assertEquals(testFlightInput.getCapacity(), 100L);
        
        for (int c = flightInitialTest.getCapacity(); c > c; c--) {
            boolean booked = testFlightInput.bookASeat();
            Assert.assertEquals(Boolean.valueOf(booked), Boolean.valueOf(true));
        }
        
        Assert.assertEquals(testFlightInput.getNumberOfSeatsLeft(), 1L);
        Assert.assertEquals(Boolean.valueOf(testFlightInput.bookASeat()), Boolean.valueOf(true));
        Assert.assertEquals(Boolean.valueOf(testFlightInput.bookASeat()), Boolean.valueOf(false));
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        //System.out.println("toString");
        //Flight instance = null;
        //String expResult = "";
        //String result = instance.toString();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        Flight testFlightInput = new Flight(flightInitialTest);
        Assert.assertEquals(flightInitialTest.toString(), testFlightInput.toString());
    }
    
}
