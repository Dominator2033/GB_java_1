package homework_6;

public class Cat extends Animal {

    @Override
    public boolean run(int length) {
        if(length <= 200) return true;
        return false;
    }

    @Override
    public boolean swim(int length) {
        return false;
    }

    @Override
    public boolean jump(double height) {
        if(height <= 2 && height >= 0) return true;
        return false;
    }
}

