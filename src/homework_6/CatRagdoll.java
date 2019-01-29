package homework_6;

public class CatRagdoll extends Cat {
    @Override
    public boolean jump(double height) {
        //return super.jump(height);
        if (height <= 3) return true;
        return false;
    }
}
