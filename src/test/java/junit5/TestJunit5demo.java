package junit5;

import org.junit.jupiter.api.*;

public class TestJunit5demo {

    @BeforeAll
    static void beforeAlltest(){
        System.out.println("测试类执行前先执行我");
    }

    @BeforeEach
    void beforeEachTest(){
        System.out.println("执行用例之前执行我");
    }

    @DisplayName("测试用例1")
    @Disabled
    @Test
    void test1(){
        System.out.println("junit5 test1");
    }


    @DisplayName("测试用例2")
    @Test
    @RepeatedTest(3)
    void test2(){
        System.out.println("junit5 test2");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("执行用例之后执行我");
    }

    @AfterAll
    static void afterAllTest(){
        System.out.println("测试类执行完了之后要执行我");
    }

}
