package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    private ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    private void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    private void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    private int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    private void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
//        ListaTarefas listaTarefas = new ListaTarefas();
//        System.out.println("O número total de elementos na lista é: " +listaTarefas.obterNumeroTotalTarefas());
//
//        listaTarefas.adicionarTarefa("Tarefa 1");
//        listaTarefas.adicionarTarefa("Tarefa 1");
//        listaTarefas.adicionarTarefa("Tarefa 2");
//        System.out.println("O número total de elementos na lista é: " +listaTarefas.obterNumeroTotalTarefas());
//
//        listaTarefas.removerTarefa("Tarefa 2");
//        System.out.println("O número total de elementos na lista é: " +listaTarefas.obterNumeroTotalTarefas());
//
//        listaTarefas.obterDescricoesTarefas();
    }

}
