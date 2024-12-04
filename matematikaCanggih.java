public class matematikaCanggih extends matematika{
    private int modus;

    public void modulus(int a , int b){
        this.modus = a % b;
        System.out.println("Hasil Modulus :" + modus);
    }
    public void modulus(int a , int b , int c){
        this.modus = a % b % c;
        System.out.println("Hasil Modulus :" + modus);
    }
    public void modulus(double a , double b){
        double modus = a % b;
        System.out.println("Hasil Modulus :" + modus);
    }
    public void modulus(double a , double b , double c){
        double modus = a % b % c;
        System.out.println("Hasil Modulus :" + modus);
    }
 
}