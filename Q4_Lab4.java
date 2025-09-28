/*

Q4  A phone directory holds a list of names with a phone number for each name. It is possible to find the number associated with a given name, and to specify the phone number for a given name. 

 [Hint:use a HashMap to store names as keys and phone numbers as values. The user can choose to find a number by providing a name or add a new name with a phone number. The program runs in a loop until the user chooses to exit.]



Code:

 public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPhone Directory Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find phone number by name");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    phoneBook.put(nameToAdd, phoneNumber);
                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    System.out.print("Enter name to find: ");
                    String nameToFind = scanner.nextLine();

                    if (phoneBook.containsKey(nameToFind)) {
                        System.out.println("Phone number: " + phoneBook.get(nameToFind));
                    } else {
                        System.out.println("No contact found with the name: " + nameToFind);
                    }
                    break;

                case 3:
                    System.out.println("Exiting phone directory. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }



Output :


Phone Directory Menu:
1. Add new contact
2. Find phone number by name
3. Exit
Choose an option: 1
Enter name: allone
Enter phone number: 1234567890
Contact added successfully.

Phone Directory Menu:
1. Add new contact
2. Find phone number by name
3. Exit
Choose an option: 2
Enter name to find: allone
Phone number: 1234567890

Phone Directory Menu:
1. Add new contact
2. Find phone number by name
3. Exit
Choose an option: 3
Exiting phone directory. Goodbye!


*/