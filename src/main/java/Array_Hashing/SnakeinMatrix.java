package Array_Hashing;

import java.util.List;

public class SnakeinMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos = 0;
        for (String command: commands) {
            switch (command) {
                case "RIGHT":
                    pos++;
                    break;
                case "LEFT":
                    pos--;
                    break;
                case "UP":
                    pos -= n;
                    break;
                case "DOWN":
                    pos += n;
                    break;
            }
        }
        return pos;
    }
}

