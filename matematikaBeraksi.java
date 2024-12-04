public class matematikaBeraksi {
    public static void main(String[] args) {
        matematikaCanggih run = new matematikaCanggih();

        run.pertambahan(2 , 3);
        run.pertambahan(2 , 3 , 4);
        run.pertambahan(4.5 , 5.2);
        run.pertambahan(2.4 , 3.5 , 5.4);

        run.pengurangan(5 , 3);
        run.pengurangan(3 , 2 , 1);
        run.pengurangan(2.4 , 1.3);
        run.pengurangan(10.3 , 3.1 , 2.5);

        run.perkalian(10 , 13);
        run.perkalian(105 , 1 , 4);
        run.perkalian(2.4 , 1.4);
        run.perkalian(2.3, 3.5, 4.6);

        run.pembagian(4 , 2);
        run.pembagian(8 , 2 , 2);
        run.pembagian(8.4 , 2.2);
        run.pembagian(20.4 , 2.5 , 5.2);

        run.modulus(100 , 3);
        run.modulus(100 , 2 , 2);
        run.modulus(100.10 , 2.4);
        run.modulus(100.25 , 2.2 , 2.8);
    }
}
