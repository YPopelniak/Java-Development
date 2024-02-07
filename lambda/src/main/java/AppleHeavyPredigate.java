public class AppleHeavyPredigate implements ApplePredigate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
