import java.io.IOException;

/**
 La classe usa le classi FileReader e FileWriter per gestire le scrittura
 su file presente sul nostro fyle-system
 */

public class FileWriter {
    Pizza pizza;
    Sushi sushi;


    /**
     ordinePizza takes a Pizza Object and writes its properties to a .txt file
     */
    public  void ordinePizza (Pizza pizza)  {
        // creo un oggetto di classe FileWriter
        java.io.FileWriter fw = null;
        try {
            fw = new java.io.FileWriter("CiboOrdinePizza.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } // fine creazione oggetto


        try {
            fw.write("Nome: " + pizza.nome);
            fw.write("\n"); // ritorno a capo
            fw.write("Gusto: " +pizza.gusto);
            fw.write("\n"); // ritorno a capo
            fw.write("Contantti: " + pizza.prezzo);
            fw.write("\n"); // ritorno a capo
            fw.write("Quantità: " + pizza.quantita);
            fw.write("\n"); // ritorno a capo
            fw.write("Pomodoro?: " + pizza.pomodoro);
            fw.write("\n"); // ritorno a capo
            fw.write("Doppio Formaggio?: " + pizza.doppioFormaggio);


            // usare il flush() // forza la scrittura su file

            fw.flush(); // non è richiesto come obbligatorio ma conviene metterlo


        } catch (IOException e) {
            System.out.println("Genarata eccazione: " + e.getMessage());
        }
        finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Non posso chiudere la connessione: " + e.getMessage());;
                //chiamo un altro metodo
            }
        }

    }

    /**
     ordineSushi takes a Sushi Object and writes its properties to a .txt file
     */
    public  void ordineSushi (Sushi sushi)  {
        // creo un oggetto di classe FileWriter
        java.io.FileWriter fw = null;
        try {
            fw = new java.io.FileWriter("CiboOrdineSushi.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } // fine creazione oggetto


        try {
            fw.write("Nome: " + sushi.nome);
            fw.write("\n"); // ritorno a capo
            fw.write("Gusto: " +sushi.gusto);
            fw.write("\n"); // ritorno a capo
            fw.write("Contanti: " + sushi.prezzo);
            fw.write("\n"); // ritorno a capo
            fw.write("Quantità: " + sushi.quantita);
            fw.write("\n"); // ritorno a capo
            fw.write("Agridolce?: " + sushi.agridolce);
            fw.write("\n"); // ritorno a capo
            fw.write("Fritto?: " + sushi.fritto);

            // usare il flush() // forza la scrittura su file

            fw.flush(); // non è richiesto come obbligatorio ma conviene metterlo


        } catch (IOException e) {
            System.out.println("Genarata eccazione: " + e.getMessage());
        }
        finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Non posso chiudere la connessione: " + e.getMessage());;
                //chiamo un altro metodo
            }
        }

    }

}
