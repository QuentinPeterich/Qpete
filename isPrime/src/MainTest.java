import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void TestIsPrime2()
    {

        //Arrange
        //not used in this example


        //Act
        boolean actualResult = Main.IsPrime(2);
        boolean expectedResult = true;


        //Assert
        assertEquals(expectedResult, actualResult);
    }

    //7 - True
    @org.junit.jupiter.api.Test
    void TestIsPrime7()
    {

        //Arrange
        //not used in this example


        //Act
        boolean actualResult = Main.IsPrime(7);
        boolean expectedResult = true;


        //Assert
        assertEquals(expectedResult, actualResult);
    }
    //12 - false
    @org.junit.jupiter.api.Test
    void TestIsPrime12()
    {

        //Arrange
        //not used in this example


        //Act
        boolean actualResult = Main.IsPrime(12);
        boolean expectedResult = false;


        //Assert
        assertEquals(expectedResult, actualResult);
    }

    //0 - false
    @org.junit.jupiter.api.Test
    void TestIsPrime0()
    {

        //Arrange
        //not used in this example


        //Act
        boolean actualResult = Main.IsPrime(0);
        boolean expectedResult = false;


        //Assert
        assertEquals(expectedResult, actualResult);
    }

    //1 - false
    @org.junit.jupiter.api.Test
    void TestIsPrime1()
    {

        //Arrange
        //not used in this example


        //Act
        boolean actualResult = Main.IsPrime(1);
        boolean expectedResult = false;


        //Assert
        assertEquals(expectedResult, actualResult);
    }

    //-3 - false
    @org.junit.jupiter.api.Test
    void TestIsPrimeNeg3()
    {

        //Arrange
        //not used in this example


        //Act
        boolean actualResult = Main.IsPrime(-3);
        boolean expectedResult = false;


        //Assert
        assertEquals(expectedResult, actualResult);
    }




}