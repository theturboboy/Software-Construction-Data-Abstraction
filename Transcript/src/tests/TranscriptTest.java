package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TranscriptTest {

    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Andrew", 1);
        //TODO: write new values in testTranscript constructor
    }

    @Test
    public void testGetStudentName(){
        assertEquals(testTranscript.getStudentName(), "Andrew");
    }

    @Test
    public void testAddGrade() {
        testTranscript.addGrade("CPSC-210", 3.5);
        assertEquals(testTranscript.getCourseAndGrade("CPSC-210"), "CPSC-210: 3.5");
    }

    @Test
    public void testGetGPA() {
        testTranscript.addGrade("CPSC-210", 3.0);
        testTranscript.addGrade("ENGL-201", 4.0);
        assertEquals(testTranscript.getGPA(), 3.5, 0);
    }
}