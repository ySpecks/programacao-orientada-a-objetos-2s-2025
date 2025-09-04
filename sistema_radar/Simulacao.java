package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro C3 = new Carro("NRS3155", "Picasso",2012, 0);
        
        Radar radar = new Radar(60, "Pistão sul");
        

        radar.avaliarVelocidade(C3);

        C3.acelerar(); //10
        C3.acelerar();
        C3.acelerar();
        C3.acelerar();
        C3.acelerar();
        C3.acelerar();
        C3.acelerar(); //70

        radar.avaliarVelocidade(C3);

        C3.frear();

        radar.avaliarVelocidade(C3);
    }

}
