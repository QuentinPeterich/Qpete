import org.junit.Test;

import java.security.InvalidAlgorithmParameterException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AirplaneTests {

    @Test
    public void TestFlyPositive() throws InvalidAlgorithmParameterException
    {
        //Arrange
        Airplane plane = new Airplane(); //creating a new instance of Airplane

        //Act
        plane.Fly(2000);


        //Assert
        assertEquals(2000, plane.miles, 0.01);
    }

    @Test
    public void TestFlyNegative()
    {
        //Arrange
        Airplane plane = new Airplane(); //creating a new instance of Airplane

        //Act


        //Assert
        assertThrows(InvalidAlgorithmParameterException.class, ()->plane.Fly(-2000));
    }

    @Test
    public void TestFlyZero() throws InvalidAlgorithmParameterException
    {
        //Arrange
        Airplane plane = new Airplane(); //creating a new instance of Airplane

        //Act
        plane.Fly(0);

        //Assert
        assertEquals(0, plane.miles,0.01);
    }

    @Test
    public void TestFlyMultiple() throws InvalidAlgorithmParameterException
    {
        //Arrange
        Airplane plane = new Airplane(); //creating a new instance of Airplane

        //Act
        plane.Fly(2000);
        plane.Fly(1000);
        plane.Fly(1000.5);

        //Assert
        assertEquals(4000.5, plane.miles,0.01);
    }
}