import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

  /*  public static void main(String[] args) {
        MyDate dat = new MyDate();
        System.out.println("The date is: " + dat.dayOfWeek() + " " + dat.getDay() + "/" + dat.getMonth()+ "/" + dat.getYear());
        dat.nextDay();
        System.out.println("The date is: " + dat.dayOfWeek() + " " + dat.getDay() + "/" + dat.getMonth()+ "/" + dat.getYear());

    }*/

    @Test
    public void test1(){
        MyDate test1 = new MyDate();
        boolean result = test1.isLeapYear(test1.getYear());
        assertEquals(true, result);
    }

    @Test
    public void test2(){
        MyDate test2 = new MyDate();
        int result2 = test2.daysInMonth();
        assertEquals(31, result2);
    }

    @Test
    public void test3(){
        MyDate test3 = new MyDate();
        test3.nextDay();
        int result3 = test3.getDay();
        assertEquals(2, result3);
    }

}
