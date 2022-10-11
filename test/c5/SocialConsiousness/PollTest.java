package c5.SocialConsiousness;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PollTest {

    Poll poll;

    @BeforeEach
    void setUp(){
        poll = new Poll();
    }

    @Test
    void testCalculateAverage(){
        //given
        int[] pollNum = {10,20,30,40};
        //when
        poll.calculateAverage(pollNum);
        //check
        assertEquals(25,poll.calculateAverage(pollNum));
    }

}
