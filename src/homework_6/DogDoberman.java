package homework_6;

public class DogDoberman extends Dog {
    @Override
    public boolean run(int length) {
        if(length <= 700) return true;
        return false;
    }

}
