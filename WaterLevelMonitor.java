
import java.util.Scanner;

public class WaterLevelMonitor
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double waterLevel = scanner.nextDouble();

        if (waterLevel >= 1000.0) {
            System.out.println("Warning: Water level has reached 1000L or more!");
        } else {
            System.out.println("Status Normal.");
        }
    
    }
}