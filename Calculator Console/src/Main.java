
Scanner scanner = new Scanner(System.in);
Calculate calculate = new Calculate();

int choice;
double num1;
double num2;
int currentInput;

void main() {

    while (true){
        intro();
        decisionHandler();
    }
}

public void decisionHandler(){

    try {
        choice = scanner.nextInt();
    } catch (Exception e) {
        System.out.print("\nInvalid type, try again\n");
        scanner.nextLine();
        return;
    }

    switch (choice)
    {
        case 1:
            userInput();

            calculate.plus(num1, num2);
            calculate.printResult();
            break;
        case 2:
            userInput();

            calculate.minus(num1, num2);
            calculate.printResult();
            break;
        case 3:
            userInput();

            calculate.multiply(num1, num2);
            calculate.printResult();
            break;
        case 4:
            userInput();

            if (num2 == 0) {
                System.out.print("Cannot divide by zero\n\n");
                break;
            }

            calculate.divide(num1, num2);
            calculate.printResult();
            break;
        case 5:
            userInput();

            calculate.power(num1, num2);
            calculate.printResult();
            break;
        case 6:
            System.out.print("\nEnter a number: ");
            currentInput = 1;
            num1 = getNumber();

            if (num1 < 0) {
                System.out.print("Cannot take the square root of a negative number\n");
                break;
            }

            calculate.sqrt(num1);
            calculate.printResult();
            break;
        case 7:
            userInput();

            calculate.modulus(num1, num2);
            calculate.printResult();
            break;
        case 8:
            System.out.print("Goodbye!\n");
            System.exit(0);
            break;
        default:
            System.out.print("Invalid choice, please try again..\n");
            break;
    }
}

public double getNumber() {
    while (true) {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.print("Invalid type, try again\n");

            if(choice == 6){
                System.out.print("Enter a number: ");
            } else if (currentInput == 1) {
                System.out.print("Enter first number: ");
            } else if (currentInput == 2) {
                System.out.print("Enter second number: ");
            }

            scanner.nextLine();
        }
    }
}

public void userInput(){
    System.out.print("\nEnter first number: ");
    currentInput = 1;
    num1 = getNumber();
    System.out.print("Enter second number: ");
    currentInput = 2;
    num2 = getNumber();
}

public void intro(){
    String[] operations = {"Plus +", "Minus -", "Multiply *", "Divide /", "Power ^", "Sqrt √", "Modulus %", "Exit"};

    System.out.print("\n=== Calculator ===\n");
    System.out.println("Please choose an option");

    for (int i = 0; i < operations.length; i++) {
        System.out.println((i + 1) + ". " + operations[i]);
    }

    System.out.print("\nChoice: ");
}