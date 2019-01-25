package homework_6;

public class Dog extends Animal{

    @Override
    public boolean run(int length) {
        if(length <= 500) return true;
        return false;
    }

    @Override
    public boolean swim(int length) {
        if (length <= 10) return true;
        return false;
    }

    @Override
    public boolean jump(double height) {
        if(height <= 0.5 && height >= 0.0) return true;
        return false;
    }
}

