public interface IGameEntity {
    void mover(float velocidade);
    void atacar(int dano);
    void defender();
    void levarDano(int dano);
    void renderizar();
}
