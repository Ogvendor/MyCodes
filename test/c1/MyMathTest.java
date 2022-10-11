package c1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {



    @Test
    void addNum() {

        MyMath maths = new MyMath();
        int sum = maths.addNum(5,5);
        assertEquals(10,sum);
    }

    @Test
    void subNum() {
        MyMath maths = new MyMath();
        int sub = maths.subNum(5,5);
        assertEquals(0,sub);


    }

    @Test
    void divNum() {
    }

    @Test
    void multiplyNum() {
    }


}
