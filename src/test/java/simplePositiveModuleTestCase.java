import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import triangle.Triangle;

public class simplePositiveModuleTestCase {

    private double testSideA = 10;
    private double testSideB = 15;
    private double testSideC = 5.935;

    /*
    Проверка возвращаемого значения на соответствие –
    метод должен возвращать то значение, которое инициализировано конструктором.
    */
    @Test
    public void test_triangleInitialize() {
        Triangle triangleZero = new Triangle(1,2,2);
        Assert.assertTrue(triangleZero.getMessage().equals(""));
    }

    /*
    Метод призван возвращать true если в него передаются корректные параметры сторон треугольника –
    такие ненулевые неотрицательные длины сторон, которые подходят по критериям определения фигуры
    как треугольник.
     */
    @Test
    public void test_checkTriangle() {
        Triangle triangleChecker = new Triangle(1,2,2);
        Assert.assertEquals(true,triangleChecker.checkTriangle());
    }


    /*
    Проверка возвращаемого значения метода по наборам длин сторон.
    В зависимости от того, какой набор сторон задается
    (равносторонний, равнобедренный, обычный, прямоугольный) –
    метод должен возвращать значение, соответствующее типу треугольника.
     	1 – равносторонний, EQUILATERAL
     	2 – равнобедренный, ISOSCELES
        4 – обычный,        ORDYNARY
        8 - прямоугольный   RECTANGULAR
     */
    @Test
    public void test_detectTriangle() {
        Triangle triangle_EQUILATERAL = new Triangle(10,10,10);
        Assert.assertEquals(1,triangle_EQUILATERAL.detectTriangle());

        Triangle triangle_ISOSCELES = new Triangle(1,2,2);
        Assert.assertEquals(2,triangle_ISOSCELES.detectTriangle());

        Triangle triangle_ORDYNARY = new Triangle(3,7,6.81);
        Assert.assertEquals(4,triangle_ORDYNARY.detectTriangle());

        Triangle triangle_RECTANGULAR = new Triangle(7,10,12.207);
        Assert.assertEquals(8,triangle_RECTANGULAR.detectTriangle());
    }


    /*
    Метод должен возвращать значение, которое соответствует
    арифметически рассчитанному значению площади треугольника,
     определенной по длинам соответствующих сторон.
    */
    @Test
    public void test_getSquare() {
        Triangle t = new Triangle(testSideA,testSideB,testSideC);
        double halfPerimeter = (testSideA+testSideB+testSideC)/2;
        double triangleSquare = Math.sqrt(halfPerimeter*(halfPerimeter-testSideA)*(halfPerimeter-testSideB)*(halfPerimeter-testSideC));
        Assert.assertEquals(triangleSquare,t.getSquare());
    }


}
