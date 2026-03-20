//CT100/G/21575/24
//WANDURI MOSES
//WEEK 6 ACTIVITY -HotelManagementSystem

import java.util.Scanner;
import java.util.Random;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Part 1: 1D Array - Weekly Revenue Tracker
         double[] revenue = new double[7];
        double totalRevenue = 0;
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter revenue for " + days[i] + ": ");
            if (scanner.hasNext()) {
                try {
                    String input = scanner.next();
                    revenue[i] = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Defaulting to 0.0 for this day.");
                    revenue[i] = 0.0;
                }
            } else {
                System.out.println("No input found. Defaulting to 0.0.");
                revenue[i] = 0.0;
            }
            totalRevenue += revenue[i];
        }

        double averageRevenue = totalRevenue / 7;
        System.out.println("\nTotal Weekly Revenue: $" + String.format("%.2f", totalRevenue));
        System.out.println("Average Daily Revenue: $" + String.format("%.2f", averageRevenue));
        System.out.println();

        //  2D Array - Room Occupancy (One Branch)
         int[][] occupancy = new int[5][10];

        // Simulating input with random data
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                occupancy[i][j] = random.nextInt(2); // 0 = vacant, 1 = occupied
            }
        }

        for (int i = 0; i < 5; i++) {
            int occupiedCount = 0;
            int vacantCount = 0;
            for (int j = 0; j < 10; j++) {
                if (occupancy[i][j] == 1) {
                    occupiedCount++;
                } else {
                    vacantCount++;
                }
            }
            System.out.println("Floor " + (i + 1) + ": Occupied = " + occupiedCount + ", Vacant = " + vacantCount);
        }
        System.out.println();

        // 3D Array - Multiple Branches
         int[][][] chain = new int[3][5][10];
        int totalOccupiedAcrossChain = 0;

        for (int b = 0; b < 3; b++) {
            for (int f = 0; f < 5; f++) {
                for (int r = 0; r < 10; r++) {
                    chain[b][f][r] = random.nextInt(2);
                    if (chain[b][f][r] == 1) {
                        totalOccupiedAcrossChain++;
                    }
                }
            }
        }

        System.out.println("Total number of occupied rooms across all 3 branches: " + totalOccupiedAcrossChain);

        scanner.close();
    }
}
