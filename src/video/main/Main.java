package video.main;

import static video.ui.AppUi.*;

public class Main {

    public static void main(String[] args) {

        AppController controller = new AppController(); // 객체 생성

        while (true) {
            startScreen();
            int selectNumber = inputInteger(">>> ");
            controller.chooseSystem(selectNumber);
        }

    }

}