package homework_6;

public abstract class Animal {
    private int length;
    private double height;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean run(int length);
    public abstract boolean swim(int length);
    public abstract boolean jump(double height);
}

