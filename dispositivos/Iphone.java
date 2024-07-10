package dispositivos;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {

  @Override
  public void ligar(String numeroTelefone) {
    System.out.println("LIGANDO PARA "+ numeroTelefone+" DE IPHONE");
  }

  @Override
  public void atender() {
    System.out.println("ATENDENDO DE IPHONE");
  }

  @Override
  public void correioDeVoz() {
    System.out.println("SALVANDO CORREIO DE VOZ");
  }

  @Override
  public void tocarMusica() {
    System.out.println("TOCANDO MUSICA NO IPHONE");
  }

  @Override
  public void pausarMusica() {
    System.out.println("PAUSANDO MUSICA NO IPHONE");
  }

  @Override
  public void selecionarMusica(String nomeMusica) {
    System.out.println("SELECIONANDO MUSICA "+nomeMusica+" NO IPHONE");
  }

  @Override
  public void exbirPagina(String url) {
    System.out.println("ACESSANDO PAGINA "+url+" NO IPHONE");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("ATUALIZANDO PAGINA WEB NO IPHONE");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("ADICIONANDO NOVA ABA NO IPHONE");
  }
    
}