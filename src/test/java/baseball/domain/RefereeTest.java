package baseball.domain;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RefereeTest {
    private static final List<Integer> ANSWER = Arrays.asList(1,2,3);
    private Referee referee;

    @BeforeEach  //매 테스트마다 실행되는 함수이다. // 중복된 코드제거에 활용
    void setup(){
        referee = new Referee();
    }

    @Test
    void 스트라이크3() {
        //Referee referee = new Referee(); //중복된 코드 제거
        String result = referee.compare(ANSWER,Arrays.asList(1,2,3));
        Assertions.assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }

    @Test
    void 아웃() {
        //Referee referee = new Referee();
        String result = referee.compare(ANSWER,Arrays.asList(7,8,9));
        Assertions.assertThat(result).isEqualTo("아웃");
    }

    @Test
    void 볼3() {
        //Referee referee = new Referee();
        String result = referee.compare(ANSWER,Arrays.asList(2,3,1));
        Assertions.assertThat(result).isEqualTo("3 볼 0 스트라이크");
    }

    @Test
    void 볼2_스트라이크1() {
        //Referee referee = new Referee();
        String result = referee.compare(ANSWER,Arrays.asList(1,3,2));
        Assertions.assertThat(result).isEqualTo("2 볼 1 스트라이크");
    }
}