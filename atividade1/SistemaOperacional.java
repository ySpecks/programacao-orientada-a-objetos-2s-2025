package atividade1;

public class SistemaOperacional{
    private Computador computador;

    public SistemaOperacional(Computador computador){
        this.computador=computador;
    }

    public boolean verificarProgramasProgramas(Programa programa){
        if(programa.getSSDOcupado()>computador.getSSD()){
            System.out.println("Erro na instalação: SSD ocupado maior que o disponível.");
            return false;
        }
        if(programa.getMemoriaRAMAlocada()>computador.getMemoriaRAM()){
            System.out.println("Erro na execução: Memória RAM alocada maior que a disponível.");
            return false;
        }
        return true;
    }

    public void executarPrograma(Programa programa){
        boolean sucesso=verificarProgramasProgramas(programa);

        if(sucesso){
            System.out.println("Programa executado com êxito.");
            calcularTempoExecucao(programa);
        }
    }

    private void calcularTempoExecucao(Programa programa){
        float tempoExecucao=(float)programa.getQuantidadeOperacoes()/(computador.getOperacoesPorSegundo()*computador.getNucleos());
        System.out.println("Tempo de execução: "+tempoExecucao+" segundos.");
    }
}