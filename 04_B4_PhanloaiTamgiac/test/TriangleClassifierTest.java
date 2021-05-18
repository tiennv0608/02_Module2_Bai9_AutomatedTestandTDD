import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangleClassifier1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expected = "Tam giac deu";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier2() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expected = "Tam giac can";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier3() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expected = "Tam giac vuong";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier4() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 4;
        String expected = "Tam giac can";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier5() {
        int side1 = 4;
        int side2 = 3;
        int side3 = 4;
        String expected = "Tam giac can";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier6() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String expected = "Khong la tam giac";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier7() {
        int side1 = 3;
        int side2 = 2;
        int side3 = 8;
        String expected = "Khong la tam giac";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier8() {
        int side1 = 2;
        int side2 = 8;
        int side3 = 3;
        String expected = "Khong la tam giac";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier9() {
        int side1 = -1;
        int side2 = 5;
        int side3 = 3;
        String expected = "Khong la tam giac";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier10() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        String expected = "Khong la tam giac";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier11() {
        int side1 = 1;
        int side2 = 0;
        int side3 = 1;
        String expected = "Khong la tam giac";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier12() {
        int side1 = 10;
        int side2 = 6;
        int side3 = 8;
        String expected = "Tam giac vuong";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    void testTriangleClassifier13() {
        int side1 = 8;
        int side2 = 10;
        int side3 = 6;
        String expected = "Tam giac vuong";

        TriangleClassifier triangle = new TriangleClassifier();
        String actual = triangle.triangleClassifier(side1,side2,side3);
        assertEquals(expected,actual);
    }
}