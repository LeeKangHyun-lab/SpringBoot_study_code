import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitQuiz1 {
    String name1 = "홍길동";
    String name2 = "홍길동";
    String name3 = "홍길은";
    
    @BeforeEach
    public void beforeEach(){
        System.out.println("검사시작");
    }
    @Test
    public void test1(){
        assertThat(name1).isNotEmpty();
        System.out.println("통과");
        assertThat(name2).isNotEmpty();
        System.out.println("통과");
        assertThat(name3).isNotEmpty();
        System.out.println("통과");
    }
    
    @Test
    public void test2(){
        assertThat(name1).isEqualTo(name2);
        System.out.println("통과");
    }
    
    @Test
    public void test3(){
        assertThat(name1).isNotEqualTo(name3);
        System.out.println("통과");
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
