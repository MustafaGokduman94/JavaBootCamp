public class DhontSystem {
    public static void main(String[] args) {
        int[] partyVotes = {10000, 5000, 3000, 2000};
        int totalSeats = 10;
        String[] parties = {"A partisi", "B partisi", "C partisi", "D partisi"};

        int[] partySeats = allocateSeats(partyVotes, totalSeats);

        // Output the results
        for (int i = 0; i < partySeats.length; i++) {
            System.out.println(parties[i] + " - Seats: " + partySeats[i]);
        }
    }

    public static int[] allocateSeats(int[] partyVotes, int totalSeats) {
        int[] partySeats = new int[partyVotes.length];

        while (totalSeats > 0) {
            int maxIndex = 0;
            int maxVotes = partyVotes[0];

            for (int i = 1; i < partyVotes.length; i++) {
                if (partyVotes[i] > maxVotes) {
                    maxVotes = partyVotes[i];
                    maxIndex = i;
                }
            }

            if (maxVotes <= 0) {
                break; // No more votes to allocate
            }

            partySeats[maxIndex]++;
            partyVotes[maxIndex] /= 2;
            totalSeats--;
        }

        return partySeats;
    }
}
