package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    private CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    private void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    private void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
            itemList.removeAll(itemsParaRemover);
    }

    private double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : itemList) {
            valorTotal += (i.getPreco() * i.getQuantidade());
        }
        return valorTotal;
    }

    private void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
//        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
//
//        carrinhoDeCompras.adicionarItem("Leite", 10.00, 4);
//        carrinhoDeCompras.exibirItens();
//
//
//        carrinhoDeCompras.adicionarItem("Café", 5.00, 2);
//        carrinhoDeCompras.exibirItens();
//
//        System.out.println(carrinhoDeCompras.calcularValorTotal());
//
//        carrinhoDeCompras.removerItem("Café");
//        carrinhoDeCompras.exibirItens();
//
//        carrinhoDeCompras.calcularValorTotal();
//        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
