package baseball.domain;

import java.util.List;

public class Judgement {
    public int correctCount(List<Integer> computer, List<Integer> player){
        int result = 0;
        for (int i = 0; i < computer.size(); i++) {
            int playerNumber = player.get(i);
            if(computer.contains(playerNumber)){
                result ++; //  == > result += 1;
            }
        }
        return 0;
    }

    public boolean hasPlace(List<Integer> computer, int placeIndex, int number){
        return computer.get(placeIndex) == number;

//        if (computer.get(placeIndex) == number){ // 이 코드를 위 한줄로 줄일 수 있다.
//          return true;
//        }
//        return false;
    }
}
