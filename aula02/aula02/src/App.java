public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar(); 
        c1.status(); 

        Caneta c2 = new Caneta();
        c2.modelo = "Preta";
        c2.ponta = 10.0f;
        c2.destampar();
        c2.rabiscar();
    }
}
