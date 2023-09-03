package ch07.part03.innerclass;

public class TestMain {
    public static void main(String[] args) {

        MyButton myButton = new MyButton();

        myButton.setCaption("save");

        MyButton.PositionInfo positionInfo = myButton.getPositionInfo();
        positionInfo.x = 100;
        positionInfo.y = 100;
        positionInfo.width = 200;
        positionInfo.height = 40;

        System.out.println("Caption of Button = " + myButton.getCaption());
        System.out.println("PositionInfo of Button = " + positionInfo);
        System.out.println("PositionInfo of Button = " + myButton.getPositionInfo());
    }
}
