/*задание возмите проект по созданию танка (задание 4.2.3) и
сохраните еще в git,
потом сделайте изменения в проекте и сохраните их в git.*/

//git init
//git add .



public class Main {
    public static  void main(String[] args){

        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

    }
}
