package eCamara.legislativo;

public class PLP extends ProjetoDeLeiAbstract {
    private String artigos;

    /**
     * Construtor responsavel por construir um objeto do tipo PLP(projeto de legislativo Complementar) a partir do dni do deputado
     * que o criou, do ano em que ele foi criado, da ementa, dos interesses relacionados ao projeto, da url do site em que o projeto
     * esta hospedado e um boolean indicando se o projeto eh conclusivo ou nao.
     *
     * @param dni dni do deputado criador do projeto.
     * @param ano data de criacao do projeto.
     * @param ementa ementa do projeto.
     * @param interesses interesses relacionados ao projeto.
     * @param url url do site em que o projeto esta hospedado.
     * @param artigos serie de artigos da constituicao Que o PLP se relaciona.
     */
    public PLP(String dni, int ano, String ementa, String interesses, String url, String artigos) {
        super(dni, ano, ementa, interesses, url);
        this.artigos = artigos;
    }

    /**
     * Metodo responsavel por criar uma representacao textual do objeto atraves do dni do autor, da ementa, da conclusao
     * do projeto de legislativo complementar e da situacao em que ele se encontra.
     *
     * @param codigo codigo do projeto.
     * @return string que representa o objeto.
     */
    public String toString(String codigo){
        return "Projeto de Lei Complementar - " + codigo + " - " + super.dniAutor + " - " + super.ementa + " - " + this.artigos + " - " + super.situacao;
    }
}