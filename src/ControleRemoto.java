
public class ControleRemoto implements InterfaceControlador{
    private int volume;
    private boolean tocando;
    private boolean ligado;

    public ControleRemoto() {
        this.volume = 50;
        this.tocando = false;
        this.ligado = false;
    }

    // Getters
    private int getVolume() {
        return volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    private boolean getLigado() {
        return ligado;
    }

    //Setters
    private void setVolume(int v) {
        this.volume = v;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("\n----------MENU----------\n");
        System.out.println("Ligado: " + getLigado());
        System.out.println("Tocando: " + getTocando());
        System.out.print("Volume: " + getVolume());

        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print(" 🟩");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando o menu...");
    }

    @Override
    public void maisVolume() {
        if (this.ligado) this.setVolume(this.getVolume() + 1); else System.out.println("Não foi possível aumentar volume");
    }

    @Override
    public void menosVolume() {
        if (this.ligado) this.setVolume(this.getVolume() - 1); else System.out.println("Não foi possível diminuir volume");
    }

    @Override
    public void ligarMudo() {
        if (this.ligado && this.getVolume() > 0) this.setVolume(0); else System.out.println("Não foi possível ligar o mudo");
    }

    @Override
    public void desligarMudo() {
        if (this.ligado && this.getVolume() == 0) this.setVolume(50); else System.out.println("Não foi possível desligar o mudo");
    }

    @Override
    public void play() {
        if (this.ligado && !(this.getTocando())) this.setTocando(true); else System.out.println("Não foi possível dar play");
    }

    @Override
    public void pause() {
        if (this.ligado && this.getTocando()) this.setTocando(false); else System.out.println("Não foi possível pausar");
    }
}
