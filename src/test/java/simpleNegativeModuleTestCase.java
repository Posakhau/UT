import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import triangle.Triangle;


public class simpleNegativeModuleTestCase {

    /*
    Создание и проверка треугольника с параметрами,
    которые не подходят по критериям определения фигуры  как треугольник –
    нулевые значения и отрицательные значения.
     */
    @Test
    public void testNeg_checkTriangle_01() {
        Triangle fakeTriangle = new Triangle(0,0,-100);
        Assert.assertEquals(false,fakeTriangle.checkTriangle());
    }

    /*
    Создание и проверка треугольника с параметрами,
    которые не подходят по критериям определения фигуры  как треугольник –
    не равные нулю положительные значения.
     */
    @Test
    public void testNeg_checkTriangle_02() {
        Triangle fakeTriangle = new Triangle(10,15,25);
        Assert.assertEquals(false,fakeTriangle.checkTriangle());
    }
}
