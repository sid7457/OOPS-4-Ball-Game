public class FourBallGameOOPsService {
    private static int ballA = 0;
    private static int ballB = 0;
    private static int ballC = 0;
    private static int ballD = 0;
    private static int ballE = 0;

    public static int addBall(int speed) {
        switch (speed){
            case 1:
                return ballA +=speed;
            case 2:
                return ballB +=speed;
            case 3:
                return ballC +=speed;
            case 4:
                return ballD +=speed;
            case 5:
                return ballE+=speed;
            default:
                return speed;
        }
    }
}
