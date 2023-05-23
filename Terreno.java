package zoologico;

public class Terreno {
    private int id;
    
    //descrição pode ser um toString?
    //private String descricao;
    
    //precisamos de um jeito de achar um animal apartir do terreno e
    //o terreno apartir de um animal, do jeito que eu coloquei aqui,
    //a classe animal cria um terreno e a classe terreno cria um animal.
    private Animal animal = new Animal();
    private int maxAnimais;
    private boolean manutencao;

    
}
