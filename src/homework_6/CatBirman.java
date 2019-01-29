package homework_6;

public class CatBirman extends Cat {
    @Override
    public boolean jump(double height) {
        //return super.jump(height);
        if (height <= 1) return true;
        return false;
    }
}
