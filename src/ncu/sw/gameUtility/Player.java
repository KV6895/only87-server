package ncu.sw.gameUtility;

import javafx.scene.image.Image;

/**
 * Created by Arson on 2016/11/1.
 */
public class Player extends GameObject{

    private String identity;
    private int score;
    public Player(int x,int y,String id){
        super(x,y,20,20);
        identity = id;
        setAttribute(0);
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getId() {
        return identity;
    }
}
