package ch07.part03.innerclass;

public class MyButton {

    private String caption;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    private PositionInfo positionInfo = new PositionInfo();

    public PositionInfo getPositionInfo() {
        return positionInfo;
    }

    public class PositionInfo {
        public int x;
        public int y;
        public int width;
        public int height;

        @Override
        public String toString() {
            String msg = "PositionInfo [";
            msg += "x=" + x + ", y=" + y;
            msg += ", width=" + width + ", height=" + height + "]";
            return msg;
        }
    }
}
