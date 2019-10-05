package PowerNumberGenerator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PowerGeneratorTest {

    private PowerGenerator generator = new PowerGenerator();

    @Test
    public void shouldReturn1At1stAttempt() {

//        given

        final int attempts = 1;
        final Double expectedResult = new Double(2);

//        when
        Double result = null;
        for (int i = 1; i <= attempts; i++) {
            result = generator.next();
        }

//        then
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void shouldReturn4At2ndAttempt() {

//        given

        final int attempts = 2;
        final Double expectedResult = new Double(4);

//        when
        Double result = null;
        for (int i = 1; i <= attempts; i++) {
            result = generator.next();
        }

//        then
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void shouldReturn256At4thAttempt() {

//        given

        final int attempts = 4;
        final Double expectedResult = new Double(256);

//        when
        Double result = null;
        for (int i = 1; i <= attempts; i++) {
            result = generator.next();
        }

//        then
        Assert.assertEquals(expectedResult, result);

    }
}