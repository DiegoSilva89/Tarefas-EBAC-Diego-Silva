public class Main {
    public static void main(String[] args) {
        //Cria uma nova instância da classe Lampada
        Lampada lampada = new Lampada();

        //Verifica o estado da lâmpada (deve ser desligada)
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());

        //Liga a lâmpada
        lampada.ligar();

        //Verifica o estado da lâmpada (deve ser ligada)
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());

        //Desliga a lâmpada
        lampada.desligar();

        //Verifica o estado da lâmpada (deve ser desligada novamente)
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());
    }
}