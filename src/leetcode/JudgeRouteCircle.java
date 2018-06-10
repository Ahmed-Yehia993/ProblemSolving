package leetcode;

public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        int xPosition = 0, yPosition = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    yPosition++;
                    break;
                case 'D':
                    yPosition--;
                    break;
                case 'R':
                    xPosition++;
                    break;
                case 'L':
                    xPosition--;
                    break;

            }

        }
        if (xPosition == 0 && yPosition == 0)
            return true;
        else return false;
    }
}
