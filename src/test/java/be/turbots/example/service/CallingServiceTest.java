package be.turbots.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CallingServiceTest {

    @Autowired
    private CallingService callingService;

    @Test
    public void testCallingService() {
        String text = this.callingService.getTextFromRestService();

        assertNotNull(text);
        assertEquals("FALLBACK TEXT", text);
    }
}
