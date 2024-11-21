package QA_testing_2024.QA_testing_2024;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	ex4 tester = new ex4 (); // object class test
    /**
     * Rigorous Test :-)
     */
	
	    @Test
	 // get an positive
	    public void Test_1 () {
	    	String ExpectedResult = "A"; // ExpectedResult this variable means what is Expected to get from the test
	    	int a = 5;
	    	int b = 3;
	    	String mod = "regular";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	
	    @Test
	    // get an negative 
	    public void Test_2 () {
	    	String ExpectedResult = "Error"; // ExpectedResult this variable means what is Expected to get from the test
	    	int a = 5;
	    	String b = "@";
	    	String mod = "regular";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    // get an positive 
	    public void Test_3 () {
	    	String ExpectedResult = "B"; // ExpectedResult this variable means what is Expected to get from the test
	    	int a = 8;
	    	int b = -8;
	    	String mod = "negatives";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    
	    @Test
	    // get an negative 
	    public void Test_4 () {
	    	String ExpectedResult = "Error"; // ExpectedResult this variable means what is Expected to get from the test
	    	String a = "s";
	    	int b = -28;
	    	String mod = "negatives";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    // get an positive 
	    public void Test_5() {
	    	String ExpectedResult = "A"; // ExpectedResult this variable means what is Expected to get from the test
	    	double a = 0.2;
	    	double b = 0.6;
	    	String mod = "reciprocals";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    
	    @Test
	    // get an Negative
	    public void Test_6() {
	    	String ExpectedResult = "ERROR"; // ExpectedResult this variable means what is Expected to get from the test
	    	double a = 1/90;
	    	double b = 7/0;
	    	String mod = "reciprocals";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    
	    
	  
	    @Test
	    // get an positive
	    public void Test_7() {
	    	String ExpectedResult = "A"; // ExpectedResult this variable means what is Expected to get from the test
	    	int b =-7;
	    	int a = -2;
	    	String mod = "regular";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    // get an positive
	    public void Test_8() {
	    	String ExpectedResult = "A"; // ExpectedResult this variable means what is Expected to get from the test
	    	double a =0.2;
	    	int b = 10;
	    	String mod = "reciprocals";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    
	    @Test
	    // get an positive
	    public void Test_9() {
	    	String ExpectedResult = "B"; // ExpectedResult this variable means what is Expected to get from the test
	    	double a = -0.2;
	    	int b = -10;
	    	String mod = "negatives";
	    	String ActualResult = tester.Calculate(a, b, mod); // ActualResult this variable means what is Actual to get from the test
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	   
	  
	    
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
}
