package JOGO;

// Classe abstrata que representa uma entidade no jogo
abstract class Entidade {
    // Atributos e métodos comuns a todas as entidades
}

// Classe abstrata que representa um personagem no jogo
abstract class Personagem extends Entidade {
    protected int vida;

    public Personagem(int vida) {
        this.vida = vida;
    }

    public abstract void mover();
}

// Subclasse que representa o personagem Fireboy
class Fireboy extends Personagem {
    public Fireboy(int vida) {
        super(vida);
    }

    @Override
    public void mover() {
        // Implementação específica para movimento do Fireboy
    }
}

// Subclasse que representa o personagem Watergirl
class Watergirl extends Personagem {
    public Watergirl(int vida) {
        super(vida);
    }

    @Override
    public void mover() {
        // Implementação específica para movimento da Watergirl
    }
}

// Classe abstrata que representa um elemento do ambiente no jogo
abstract class Elemento extends Entidade {
    // Atributos e métodos comuns a todos os elementos do ambiente
}

// Subclasse que representa um item no jogo, como gema ou botão
class Item extends Elemento {
    // Atributos e métodos específicos para um item
}

// Subclasse que representa um elemento perigoso no jogo
abstract class Perigo extends Elemento {
    // Atributos e métodos comuns a todos os elementos perigosos
}

// Subclasse que representa um elemento perigoso no jogo: Lava
class Lava extends Perigo {
    // Implementação específica para o elemento Lava
}

// Subclasse que representa um elemento perigoso no jogo: Gelo
class Gelo extends Perigo {
    // Implementação específica para o elemento Gelo
}

// Classe que representa um nível do jogo
class Nivel {
    private int numero;
    private int tempo;
    private int gemasColetadas;
    private Medalha medalha;

    public Nivel(int numero, int tempo, int gemasColetadas, Medalha medalha) {
        this.numero = numero;
        this.tempo = tempo;
        this.gemasColetadas = gemasColetadas;
        this.medalha = medalha;
    }

    // Métodos para acessar e modificar os atributos
}

// Enumeração para representar os diferentes tipos de medalhas
enum Medalha {
    CINZA, // Nenhuma pontuação
    ROXA,  // 1 ponto
    LARANJA, // 2 pontos
    VERDE // 3 pontos
}

// Classe principal para demonstrar o uso das classes do jogo
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes do jogo
        Fireboy fireboy = new Fireboy(3); // Criando uma instância do Fireboy com 3 vidas
        Watergirl watergirl = new Watergirl(3); // Criando uma instância da Watergirl com 3 vidas

        // Criando um nível do jogo
        Nivel nivel1 = new Nivel(1, 100, 10, Medalha.VERDE); // Nível 1 com 100 segundos, 10 gemas e medalha verde

        // Outras operações e interações entre as entidades do jogo podem ser adicionadas aqui
    }
}
