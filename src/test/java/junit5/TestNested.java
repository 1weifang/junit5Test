package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TestNested {

    @Test
    @DisplayName("外层测试")
    void outerTest(){
        System.out.println("最外层测试输出");
    }


    @Nested
    @DisplayName("内层测试1")
    class Inner{

        @Test
        void innerTest(){
            System.out.println("内层测试1输出");
        }

        @Nested
        @DisplayName("内层测试1嵌套")
        class InInner{

            void InInerTest(){
                System.out.println("内层测试1嵌套内层输出");
            }

        }

    }

    @Nested
    @DisplayName("内层测试2")
    class Inner2{

        @Test
        void testInner2(){
            System.out.println("内层测试2输出");
        }

    }
}
