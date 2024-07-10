import dispositivos.*;

public class App{
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    //APARALHO TELEFONICO
    iphone.ligar("123456789");
    iphone.atender();

    //REPRODUTOR MUSICAL
    iphone.selecionarMusica("All eyes on me");
    iphone.tocarMusica();
    iphone.pausarMusica();

    //NAVEGADOR DE INTERNET
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
    iphone.exbirPagina("www.google.com.br");
    
  }
}