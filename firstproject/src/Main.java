public class Main {
    public static void main(String[] args) {
      int a = 3;
      int b = 2;
      int c = 4;
        suma(a, b, c);

    car myCar = new car();
    myCar.adddoor();

    System.out.println(myCar.getDoor());

    }
    private static void suma(int a, int b, int c) {
      System.out.println(a + b +c);
    }

    static class car {
        public int door = 3;
     public void adddoor(){
        this.door++;
     }

        public int getDoor() {
            return door;
        }
    }
}