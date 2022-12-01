public class Pizza extends Cibo{
    boolean pomodoro;
    boolean doppioFormaggio;


    public Pizza(String nome, String gusto, Integer quantita, Integer prezzo, boolean pomodoro, boolean doppioFormaggio) {
        super(nome, gusto, quantita, prezzo);
        this.pomodoro = pomodoro;
        this.doppioFormaggio = doppioFormaggio;

    }
}
