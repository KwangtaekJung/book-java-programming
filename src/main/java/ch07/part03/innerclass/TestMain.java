package ch07.part03.innerclass;

public class TestMain {
    public static void main(String[] args) {

        //non-static inner class
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

        //static inner class
        Logger.log(Logger.LogLevel.INFO, "Informational message");
        Logger.log(Logger.LogLevel.WARNING, "Warning message");
        Logger.log(Logger.LogLevel.ERROR, "Error message");

        Logger logger = new Logger();
        logger.test();
    }
}
