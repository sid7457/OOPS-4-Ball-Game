import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallGameOOPs extends PApplet {



    public static void main(String[] args) {
        PApplet.main("FourBallGameOOPs");
    }
    FrameSize frameSize = new FrameSize(Constant.HEIGHT,Constant.WIDTH);

    @Override
    public void settings() {
        super.settings();
        size(frameSize.getHeight(),frameSize.getHeight());
    }

    @Override
    public void draw() {
        ellipse(FourBallGameOOPsService.addBall(Constant.SPEEDBALLONE), Constant.HEIGHT / Constant.SPEEDLIMIT * Constant.SPEEDBALLONE, CENTER, CENTER);
        ellipse(FourBallGameOOPsService.addBall(Constant.SPEEDBALLTWO), Constant.HEIGHT / Constant.SPEEDLIMIT * Constant.SPEEDBALLTWO, CENTER, CENTER);
        ellipse(FourBallGameOOPsService.addBall(Constant.SPEEDBALLTHREE), Constant.HEIGHT / Constant.SPEEDLIMIT * Constant.SPEEDBALLTHREE, CENTER, CENTER);
        ellipse(FourBallGameOOPsService.addBall(Constant.SPEEDBALLFOUR), Constant.HEIGHT / Constant.SPEEDLIMIT * Constant.SPEEDBALLFOUR, CENTER, CENTER);
        ellipse(FourBallGameOOPsService.addBall(Constant.SPEEDBALLFIVE), Constant.HEIGHT / Constant.SPEEDLIMIT * Constant.SPEEDBALLFIVE, CENTER, CENTER);
    }
}
