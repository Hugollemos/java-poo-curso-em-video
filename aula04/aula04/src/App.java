public class App {
    public static void main(String[] args) throws Exception{
        //Utilizando o modo Construtor
        //Caneta c1 = new Caneta("NICK", "amarela", 0.4f);
        Caneta c1 = new Caneta();
        
        
        c1.setModelo("BIC");
        //c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        //c1.getPonta(0.5f);
        
        c1.status();
        //System.out.println("Tenho uma Caneta " + c1.getModelo());*/
    }
}
