package ch09.part01;

public class Parent extends GrandParent {

//    protected String name = "Parent";
    public int value = 1;
    private TypeA type = TypeA.A;

    public enum TypeA {A, B, C, D};

    public Parent() {
        super();
    }

    public Parent(int value, TypeA type) {
        super("GrandParent by constructor", 10);
        this.value = value;
        this.type = type;
    }
}
