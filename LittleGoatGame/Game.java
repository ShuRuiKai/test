public class Game {
    public static void main(String[] args) {
        System.out.println("欢迎来到小羊过河游戏!");
        System.out.println("在这个游戏中，你需要帮助小羊安全过河。");
        
        boolean gameRunning = true;
        while (gameRunning) {
            System.out.println("请选择一个操作: 1. 过河 2. 退出");
            int choice = getUserInput();
            switch (choice) {
                case 1:
                    System.out.println("小羊正在过河...");
                    // 在这里添加过河的逻辑
                    break;
                case 2:
                    System.out.println("感谢您玩这个游戏!");
                    gameRunning = false;
                    break;
                default:
                    System.out.println("无效选择，请再试一次。");
                    break;
            }
        }
    }

    private static int getUserInput() {
        // 获取用户输入的实现
        return 1; // 默认返回 1 以示范
    }
}