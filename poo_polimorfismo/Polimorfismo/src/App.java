public class App {
    public static void main(String[] args) {
        // Animal é abstrato e não pode ser instanciado
        // Animal n = new Animal();

        Mamifero ma = new Mamifero();
        Reptil re = new Reptil();
        Peixe pe = new Peixe();
        Ave av = new Ave();

        Canguru ca = new Canguru();
        Cachorro ka = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        Tilapia ti = new Tilapia();
        Arara ar = new Arara(); 

        // Subclasses de Animal
        System.out.print("Ave: ");
        av.locomover(); // Voando
        System.out.print("Peixe: ");
        pe.locomover(); // Nadando
        System.out.print("Réptil: ");
        re.locomover(); // Rastejando
        System.out.print("Mamífero: ");
        ma.locomover(); // Correndo

        System.out.println();

        // Subclasses de Ave, Peixe, Réptil e Mamífero
        System.out.print("Arara: "); // Ave
        ar.locomover(); // Voando

        System.out.print("Tilápia: "); // Peixe
        ti.locomover(); // Nadando

        System.out.print("Cobra: "); // Réptil
        co.locomover(); // Rastejando

        System.out.print("Tartaruga: "); // Réptil
        ta.locomover(); // Rastejando

        System.out.println();

        System.out.print("Canguru: "); // Mamífero
        ca.locomover(); // "Saltando" -> possui Override (sobrescrita) no método locomover()
        ca.usarBolsa(); // Método específico e único da classe Canguru

        System.out.println();

        System.out.print("Cachorro: "); // Mamífero
        ka.locomover(); // Correndo
        ka.emitirSom(); // "Au! Au! Au!" -> possui Override (sobrescrita) no método emitirSom()
    }
}
