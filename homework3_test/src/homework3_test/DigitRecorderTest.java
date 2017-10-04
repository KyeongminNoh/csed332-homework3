package homework3_test;
 

import static org.junit.Assert.*;


import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
 
@RunWith(SWTBotJunit4ClassRunner.class)
public class DigitRecorderTest {
 
    private static SWTWorkbenchBot bot;
    
    /**
     * You have to step image 1~3 in hw3.pdf at initBot() method.
     */
    @BeforeClass
    public static void initBot() {
    		//TODO
    }
 
    /**
     * You don't have to edit this method.
     */
    @AfterClass
    public static void afterClass() {
    		bot.sleep(2000);
    		bot.resetWorkbench();
    }
    
    /**
     * This is example of test for simple typing.
     * You have to pass this test when you do the initBot() method and DigitRecorder.java correctly.
     */
    @Test
    public void TypingSuccessTest() {
    		bot.button("3").click();
    		bot.button("1").click();
    		bot.button("2").click();
    		SWTBotText text = bot.textWithLabel("Buffer: ");
    		assertTrue(text.getText().equals("312"));
    		bot.button("Clear").click();
    }
    
    /**
     * Test when you type more than 20 digits.
     * You have to check the warning window is popped up.
     * The message of warning is "You can write up to 20 digits".
     * Click the "OK" button for closing the warning window.
     */
    @Test
    public void TypingExceptionTest() {
    		//TODO
    }
    
    /**
     * Test When you click "Backspace" button when text viewer is empty.
     * You have to check the warning window is popped up.
     * The message of warning is "Empty".
     * Click the "OK" button for closing the warning window.
     */
    @Test
    public void RemoveExceptionTest() {
    		//TODO
    }
    
    /**
     * Check the "Backspace" button working well.
     */
    @Test
    public void RemoveSuccessTest() {
    		//TODO
    }
    
}