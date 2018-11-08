import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int OpcionPelo;
		
		
		
		
		do {
		System.out.println("opcion de pelo 1 = "+ "wwwwwwwwwwww");
		System.out.println("opcion de pelo 2 = "+ "\\\\\\//////");
		System.out.println("opcion de pelo 3 = "+ "|\"\"\"\"\"\"\"|");
		System.out.println("opcion de pelo 4 = "+ "|||||||||");
		System.out.println("elige una opcion de pelo");
		OpcionPelo=sc.nextInt();
		if(OpcionPelo<1 || OpcionPelo>4) {
			System.out.println("la opcion es incorrecta , vuelve a introducirla");
		}
		}while(OpcionPelo<1 || OpcionPelo>4);
		
		int OpcionOjos;
		
		do {
			System.out.println("opcion de ojos 1 = "+ "| O O |");
			System.out.println("opcion de ojos 2 = "+ "|-(· ·)-|");
			System.out.println("opcion de ojos 3 = "+ "|-(o o)-|");
			System.out.println("opcion de ojos 4 = "+ "| \\ / |");
			System.out.println("elige una opcion de Ojos");
			OpcionOjos=sc.nextInt();
			if(OpcionOjos<1 || OpcionOjos>4) {
				System.out.println("la opcion es incorrecta , vuelve a introducirla");
			}
			}while(OpcionOjos<1 || OpcionOjos>4);
		
		
		int OpcionNariz;
		do {
			System.out.println("opcion de nariz 1 = "+ "@ J @");
			System.out.println("opcion de  nariz  2 = "+ "{ \" }");
			System.out.println("opcion de  nariz  3 = "+ "[ j ]");
			System.out.println("opcion de  nariz  4 = "+ "< - >");
			System.out.println("elige una opcion de Nariz y orejas");
			OpcionNariz=sc.nextInt();
			if(OpcionNariz<1 || OpcionNariz>4) {
				System.out.println("la opcion es incorrecta , vuelve a introducirla");
			}
			}while(OpcionNariz<1 || OpcionNariz>4);
		
		int OpcionBoca;
		do {
			System.out.println("opcion de Boca 1 = "+ "|  ===  |");
			System.out.println("opcion de  Boca  2 = "+ "|   -   |");
			System.out.println("opcion de  Boca  3 = "+ "|  ___  |");
			System.out.println("opcion de  Boca  4 = "+ "|  ---  |");
			System.out.println("elige una opcion de Boca");
			OpcionBoca=sc.nextInt();
			if(OpcionBoca<1 || OpcionBoca>4) {
				System.out.println("la opcion es incorrecta , vuelve a introducirla");
			}
			}while(OpcionBoca<1 || OpcionBoca>4);
		
		switch(OpcionPelo) {
		case 1:
		System.out.println("wwwwwwwwwwww");
			break;
		case 2:
			System.out.println("\\\\\\//////");
			break;
		case 3:
			System.out.println("|\"\"\"\"\"\"\"|");
			break;
		case 4:
			System.out.println("|||||||||");
			
		}
		
		switch(OpcionOjos) {
		case 1:
		System.out.println("|  O O  |");
			break;
		case 2:
			System.out.println("|-(· ·)-|");
			break;
		case 3:
			System.out.println("|-(o o)-|");
			break;
		case 4:
			System.out.println("|  \\ /  |");
			
		}
		
		switch(OpcionNariz) {
		case 1:
		System.out.println("@   J   @");
			break;
		case 2:
			System.out.println("{   \"   }");
			break;
		case 3:
			System.out.println("[   j   ]");
			break;
		case 4:
			System.out.println("<   -   >");
			
		}
		
		switch(OpcionBoca) {
		case 1:
		System.out.println("|  ===  |");
			break;
		case 2:
			System.out.println("|   -   |");
			break;
		case 3:
			System.out.println("|  ___  |");
			break;
		case 4:
			System.out.println("|  ---  |");
			
		}
		System.out.println("\\_______/");

	}

}
