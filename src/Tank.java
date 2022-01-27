public class Tank {

    static final String MODEL = "T34";
    static int ntanks;

    private int x, y;
    private int turn;
    private int fuel;
    private int n;

    public  Tank () {
        this(0,0,100);
    }

    public  Tank (int x, int y ) {
        this(x,y,100);
    }

    public  Tank (int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;
    }

    public void goForward(int goForward) {
        if (goForward < 0 && -goForward > - fuel)
            goForward = -fuel;
        else if (fuel - goForward < 0 ) {
            goForward = fuel;
            fuel = 0;
        } else
            fuel = fuel - goForward;
        if (turn == 0)
            x += goForward;
        else if (turn == 1)
            y += goForward;
        else if (turn == 2)
            x -= goForward;
        else
            y -= goForward;
    }

    public void printPosition() {
        System.out.println("The Tank "+ MODEL+ "-"+ n + " is at " + x + ", " + y + " now.");
    }

    public  void turnRight () {
        turn++;
        if (turn == 4 )
            turn = 0;
    }

    public void turnLeft () {
        turn--;
        if (turn == -1)
            turn = 3;
    }

    public void goBackward (int i) {
        goForward(-i);
    }
}
