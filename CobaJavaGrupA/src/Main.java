public class Main {

    public static void main(String args[]){
        System.out.println("Hello World!"+ args[0]);

        Lampu lampu = new Lampu();
        System.out.println(lampu.warnaSekarang());
        lampu.gantiwarna("Merah");
        System.out.println(lampu.warnaSekarang());

    }
}
