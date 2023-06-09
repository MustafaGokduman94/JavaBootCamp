public class DhontSystem {
    public static void main(String[] args) {
        // Party votes and total number of seats
        int[] partyVotes = {10000, 5000, 3000, 2000};
        int totalSeats = 10;
        String[] parties = {"A partisi", "B partisi", "C partisi", "D partisi"};

        // Allocate seats using the D'Hondt method
        int[] partySeats = allocateSeats(partyVotes, totalSeats);

        // Output the results
        for (int i = 0; i < partySeats.length; i++) {
            System.out.println(parties[i] + " - Seats: " + partySeats[i]);
        }
    }

    public static int[] allocateSeats(int[] partyVotes, int totalSeats) {
        // Array to store the number of seats for each party
        int[] partySeats = new int[partyVotes.length];

        for (int i = 0; i < totalSeats; i++) {
            // Find the party with the highest votes per seat ratio
            int maxIndex = 0;
            int maxVotes = partyVotes[0] / (partySeats[0] + 1);

            for (int j = 1; j < partyVotes.length; j++) {
                int votesPerSeat = partyVotes[j] / (partySeats[j] + 1);
                if (votesPerSeat > maxVotes) {
                    maxVotes = votesPerSeat;
                    maxIndex = j;
                }
            }

            // Allocate a seat to the party with the highest ratio
            partySeats[maxIndex]++;
        }

        return partySeats;
    }
}
