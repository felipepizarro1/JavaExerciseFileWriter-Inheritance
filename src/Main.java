import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
        FileWriter ordine1 = new FileWriter();
        Pizza pizza1 = new Pizza("Margherita", "Salato",1, 8,true,false);
        Sushi sushi1 = new Sushi("Uramaki","Spicy",10,15,false);

        ordine1.ordinePizza(pizza1);
        ordine1.ordineSushi(sushi1);

     */


        Scanner scanner = new Scanner(System.in);
        String ciboScelta;
        String nomeCibo;
        String gustoCibo;
        Integer quantitaCibo;
        Integer prezzoCibo;
        //pizza
        Boolean pomodoro1;
        Boolean doppioFormaggio1;
        //sushi
        Boolean fritto1;
        Boolean agridolce1;


        FileWriter ordineUtente = new FileWriter();


        do {
            System.out.println("Ciao!Pizza o Sushi?");
            ciboScelta = scanner.nextLine();
            if(ciboScelta.equalsIgnoreCase("pizza")){
                System.out.println("Quale pizza?");
                nomeCibo = scanner.nextLine();
                System.out.println("Gusto?");
                gustoCibo = scanner.nextLine();
                System.out.println("Quantità?");
                quantitaCibo = scanner.nextInt();
                System.out.println("Contanti a pagare?");
                prezzoCibo = scanner.nextInt();
                System.out.println("Vuoi pomodoro?(true or false)");
                pomodoro1 = scanner.nextBoolean();
                System.out.println("Vuoi doppio formaggio?(true or false)");
                doppioFormaggio1 = scanner.nextBoolean();

                Pizza pizzaUtente = new Pizza(nomeCibo,gustoCibo,quantitaCibo,prezzoCibo,pomodoro1,doppioFormaggio1);
                ordineUtente.ordinePizza(pizzaUtente);
                System.out.println("Lista pronta!");


        }
            else if (ciboScelta.equalsIgnoreCase("sushi")){
                System.out.println("Quale sushi?");
                nomeCibo = scanner.nextLine();
                System.out.println("Gusto?");
                gustoCibo = scanner.nextLine();
                System.out.println("Quantità?");
                quantitaCibo = scanner.nextInt();
                System.out.println("Contanti a pagare?");
                prezzoCibo = scanner.nextInt();
                System.out.println("Vuoi Fritto?(true or false)");
                fritto1 = scanner.nextBoolean();
                System.out.println("Vuoi Agridolce?(true or false)");
                agridolce1 = scanner.nextBoolean();

                Sushi sushiUtente = new Sushi(nomeCibo,gustoCibo,quantitaCibo,prezzoCibo,fritto1,agridolce1);
                ordineUtente.ordineSushi(sushiUtente);
                System.out.println("Lista pronta!");

            }

        }while (scanner.hasNext());


    }
}