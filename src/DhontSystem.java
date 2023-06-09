public class DhontSystem {
    public static void main(String[] args) {
        // Party votes and total number of seats
        int[] partioylari = {10000, 5000, 3000, 2000};
        int toplamsandalyesayisi = 10;
        String[] partiler = {"A partisi", "B partisi", "C partisi", "D partisi"};

        // Allocate seats using the D'Hondt method
        int[] partisandalyaleri = atama(partioylari, toplamsandalyesayisi);

        // Output the results
        for (int i = 0; i < partisandalyaleri.length; i++) {
            System.out.println(partiler[i] + " - sandalye: " + partisandalyaleri[i]);
        }
    }

    public static int[] atama(int[] partioyları, int toplamsandalye) {
        // Array to store the number of seats for each party
        int[] sandalyaler = new int[partioyları.length];

        for (int i = 0; i < toplamsandalye; i++) {
            // Find the party with the highest votes per seat ratio
            int dizi = 0;
            int encokoyalan = partioyları[0] / (sandalyaler[0] + 1);

            for (int j = 1; j < partioyları.length; j++) {
                int oylar = partioyları[j] / (sandalyaler[j] + 1);
                if (oylar > encokoyalan) {
                    encokoyalan = oylar;
                    dizi = j;
                }
            }

            // Allocate a seat to the party with the highest ratio
            sandalyaler[dizi]++;
        }

        return sandalyaler;
    }
}
