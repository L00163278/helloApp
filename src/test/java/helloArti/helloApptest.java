package helloArti;

import static org.junit.Assert.*;



import org.junit.Test;



public class helloApptest {



@Test
public void testGreetingMessage() {
assertEquals("Hello Rohit! Welcome to Java Programming", helloApp.getGreetingMessage("Rohit"));
}



}