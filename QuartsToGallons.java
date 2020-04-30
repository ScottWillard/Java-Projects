class QuartsToGallons{
    public static void main(String[] args) {
        int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        quartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.print("A job that needs 18 quarts requires ");
        System.out.print(gallonsNeeded);
        System.out.print(" gallons plus ");
        System.out.print(quartsNeeded);
        System.out.print(" quarts");
    }
}