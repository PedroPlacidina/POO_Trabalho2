public enum Moedas {
    REAL(1.0),
    DOLAR(0.1834358),
    EURO(0.165766),
    LIBRA(0.1381406),
    IENE(26.3574064),
    PESO(178.0309774);

    private double valor;

    private Moedas(double valor) {
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public static boolean existeMoeda(String moeda) {
        for (Moedas m : Moedas.values()) {
            if (m.name().equals(moeda)) {
                return true;
            }
        }
        return false;
    }
}