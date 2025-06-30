import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitQuiz2 {
    int number1 = 15;
    int number2 = 0;
    int number3 = -5;
    
    @BeforeEach
    public void beforeEach(){
        System.out.println("검사시작");
    }
    @Test
    public void test1(){
        assertThat(number1).isPositive();
        System.out.println("양수이다.");
    }
    
    @Test
    public void test2(){
        assertThat(number2).isZero();
        System.out.println("0이다.");
    }
    
    @Test
    public void test3(){
        assertThat(number3).isNegative();
        System.out.println("음수이다.");
    }
    @Test
    public void test4(){
        assertThat(number1).isGreaterThan(number2);
        System.out.println("number1이 number2보다 크다");
    }
    @Test
    public void test5(){
        assertThat(number3).isLessThan(number2);
        System.out.println("number3이 number2보다 작다");
    }

    
    @AfterEach
    public void afterEach(){
        System.out.println("테스트 종료");
    }
    
    @AfterAll
    static void afterAll(){
        System.out.println("테스트 완전히 종료");
    }
}
