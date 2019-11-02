public class LockerBoolean {
    public static void main(String[] args) {

        boolean[] lockers = new boolean[101];

        //set all lockers to closed
        for (int i = 1; i < lockers.length; i++){
            lockers[i] = false;
        }

        //now lets open the lockers
        for (int i = 1; i < lockers.length; i++){
            lockers[i] = true;
        }

        //starting at second locker - lets change every other
        for (int n = 2; n < lockers.length; n++){
            for (int i = n; i < lockers.length; i = i + (n + 1)){
                lockers[i] = !lockers[i];
            }

        }

        //now lets print the lock status for the 100 lockers
        for (int i = 1; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.println("Locker " + (i) + " is Open");
            } else {
                System.out.println("Locker " + (i) + " is closed");
            }
        }
    }
}
