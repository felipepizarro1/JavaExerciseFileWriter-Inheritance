public class Sushi extends Cibo{
    boolean fritto;
    boolean agridolce;


    public Sushi(String nome, String gusto, Integer quantita, Integer prezzo, boolean fritto, boolean agridolce) {
        super(nome, gusto, quantita, prezzo);
        this.fritto = fritto;
        this.agridolce = agridolce;
    }
}
