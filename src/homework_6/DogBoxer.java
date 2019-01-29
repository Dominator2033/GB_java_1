package homework_6;

public class DogBoxer extends Dog {
    @Override
    public boolean run(int length) {
        //return super.run(length);
        if (length <= 400) return true;
        return false;
    }
}
