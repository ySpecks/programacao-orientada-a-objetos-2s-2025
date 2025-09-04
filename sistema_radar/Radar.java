package sistema_radar;

public class Radar {
    public Integer limiteVelocidade;
    public String Localizacao;

    public Radar(Integer limiteVelocidade, String Localizacao){
        this.limiteVelocidade = limiteVelocidade;
        this.Localizacao = Localizacao;
    }

    public void avaliarVelocidade(Carro carro) {
    if (carro.getVelocidade() > this.limiteVelocidade){

        emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
    }
}
    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade observada: "+ velocidadeObservada);
        System.out.println("Limite da via: "+ this.limiteVelocidade);

    }

}
