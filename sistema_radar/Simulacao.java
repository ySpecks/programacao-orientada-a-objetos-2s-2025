package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro C3 = new Carro();
        C3.ano = 2012;
        C3.modelo = "Picasso";
        C3.placa = "NRS3155";
        C3.velocidade = 0;

        Radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.Localizacao = "Pistao sul";

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
