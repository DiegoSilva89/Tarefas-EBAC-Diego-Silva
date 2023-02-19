/**
 * Classe que representa uma lâmpada.
 * Possui uma propriedade que indica se a lâmpada está ligada ou desligada,
 * e métodos para ligar, desligar e verificar o estado da lâmpada.
 */
public class Lampada {

    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("Lâmpada ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Lâmpada desligada.");
    }

    public boolean estaLigada() {
        return this.ligada;
    }
}
