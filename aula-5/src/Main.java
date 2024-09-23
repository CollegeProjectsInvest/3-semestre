import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      var jogador = new Jogador();
      var inimigo = new Inimigo();
      var jogado1 = new Jogador();
      var inimigo1 = new Inimigo();

      ArrayList<IGameEntity> entidades = new ArrayList<>();

      entidades.add(jogador);
      entidades.add(jogado1);
      entidades.add(inimigo1);
      entidades.add(inimigo);

      for (IGameEntity entidade : entidades) {
          entidade.renderizar();
      }
    }
}
