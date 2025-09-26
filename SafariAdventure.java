import java.util.Scanner;

public class SafariAdventure 
{
    public static void main(String[] args)
    {
        // Variables 
        String area;
        int day;
        int points = 0;

        // Intro
        System.out.println("Welcome to the Safari Adventure!");
        System.out.println("You are about to embark a journey through the wild.");
        System.out.println("Let the adventure begin!");

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // 5 days of adventure in for loop 
        for(day = 1; day <= 5; day++)
        {
            // Prompt user to choose area in do..while loop
            do {
                System.out.print("Enter the area you want to explore (Jungle, River, Desert, or Mountains): ");
                area = input.nextLine();
                if (area.equalsIgnoreCase("jungle") || area.equalsIgnoreCase("river") || area.equalsIgnoreCase("desert")
                || area.equalsIgnoreCase("mountains"))
                {
                    System.out.println("You have chosen " + area + " on day " + day + ".");
                }
                else{
                    System.out.println("Invalid area. Please choose Jungle, River, Desert, or Mountains.");
                }
            } while (!(area.equalsIgnoreCase("jungle") || area.equalsIgnoreCase("river") || area.equalsIgnoreCase("desert")
                || area.equalsIgnoreCase("mountains")));
            
            // Variable declerations for events 
            String action;
            int event = 0;
            int choice;

            // Jungle area
            if (area.equalsIgnoreCase("jungle") )
            {
                while (event < 3) {
                    System.out.print("Pick a number between 1 and 3 to see what happens: ");
                    choice = input.nextInt();
                    input.nextLine();
                    //events 
                    switch (choice) {
                        // resource
                        case 1 -> {
                            System.out.println("You find a papaya tree and collect some fruit. You've earned +15 points!");
                            points += 15;
                            event++;
                        }
                        // wild animal
                        case 2 -> {
                            System.out.println("You encounter a wild jaguar!");
                            System.out.print("Type 'run' to escape!: " );
                            action = input.nextLine();
                            break;
                        }
                        // weather
                        case 3 -> {
                            System.out.println("A thunderstorm hits!");
                            event++;
                        }
                        default -> {
                            if (choice < 1 || choice > 3){
                                System.out.println("Invalid number.");
                            }
                        }
                    }
                    if (choice == 2){
                        System.out.println("You succesfully escaped the jaguar! The day ends early.");
                        break;
                    }
                }
            }
            // River area
            else if(area.equalsIgnoreCase("river"))
            {
                while (event < 3) {
                    System.out.print("Pick a number between 1 and 3 to see what happens: ");
                    choice = input.nextInt();
                    input.nextLine();
                    //events 
                    switch (choice) {
                        // resource
                        case 1 -> {
                            System.out.println("You catch a fish for food. You've earned +15 points!");
                            points += 15;
                            event++;
                        }
                        // weather
                        case 2 -> {
                            System.out.println("You find a hidden waterfall!");
                            event++;
                        }
                        // wild animal
                        case 3 -> {
                            System.out.println("You encounter a crocodile!");
                            System.out.print("Type 'run' to escape!: " );
                            action = input.nextLine();
                            break;
                        }
                        default -> {
                            if (choice < 1 || choice > 3){
                                System.out.println("Invalid number.");
                            }
                        }
                    }
                    if (choice == 3){
                        System.out.println("You succesfully escaped the crocodile! The day ends early.");
                        break;
                    }
                }
            }
            // desert
            else if(area.equalsIgnoreCase("desert"))
            {
                while (event < 3) {
                    System.out.print("Pick a number between 1 and 3 to see what happens: ");
                    choice = input.nextInt();
                    input.nextLine();
                    //events 
                    switch (choice) {
                        // weather
                        case 1 -> {
                            System.out.println("A sandstorm hits!");
                            event++;
                        }
                        // wild animal
                        case 2 -> {
                            System.out.println("You encounter a scorpion!");
                            System.out.print("Type 'run' to escape!: " );
                            action = input.nextLine();
                            break;
                        }
                        // resource
                        case 3 -> {
                            System.out.println("You find a oasis and refil your water. You've earned +20 points!");
                            points += 20;
                            event++;
                        }
                        
                        default -> {
                            if (choice < 1 || choice > 3){
                                System.out.println("Invalid number.");
                            }
                        }
                    }
                    if (choice == 2){
                        System.out.println("You succesfully escaped the scorpion! The day ends early.");
                        break;
                    }
                }
            }
            // mountain area
            else if(area.equalsIgnoreCase("mountains"))
            {
                while (event < 3) {
                    System.out.print("Pick a number between 1 and 3 to see what happens: ");
                    choice = input.nextInt();
                    input.nextLine();
                    //events 
                    switch (choice) {
                        
                        // wild animal
                        case 1 -> {
                            System.out.println("You encounter a wild mountain lion!");
                            System.out.print("Type 'run' to escape!: " );
                            action = input.nextLine();
                            break;
                        }
                        // resource
                        case 2 -> {
                            System.out.println("You find rare herbs and collect them. You've earned +25 points!");
                            points += 25;
                            event++;
                        }
                       
                        // weather
                        case 3 -> {
                            System.out.println("A rockslide occurs!");
                            event++;
                        }
                        default -> {
                            if (choice < 1 || choice > 3){
                                System.out.println("Invalid number.");
                            }
                        }
                    }
                    if (choice == 1){
                        System.out.println("You succesfully escaped the mountain lion! The day ends early.");
                        break;
                    }
                }
            }
        }
        
        
        input.close();
        // points summary
        System.out.println("Your Safari Aventure has ended. You scored " + points + " points!");
        // outro 
        if (points >= 100) 
        {
            System.out.println("You are a Safari master!");
        }
        else{
            System.out.println("You survived and completed the aventure.");
        }
    }
}
