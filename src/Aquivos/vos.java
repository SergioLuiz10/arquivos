package Aquivos;

public class vos extends produtos{
    public vos(String nome, double preço, Integer quantidade) {
        super(nome, preço, quantidade);
    }

    @Override
    public double total() {
        return preço*quantidade;
    }
}
