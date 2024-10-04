public class Conversor {
    
    private double moedaConvertida;

    public double converterMoeda(double valor, Moedas valorOrigem, Moedas valorDestino){
        moedaConvertida = valor * (valorDestino.getValor() / valorOrigem.getValor());
        return moedaConvertida;
    }
}
