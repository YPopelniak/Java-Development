public class AppleGreenColorPredigate implements ApplePredigate{


    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
