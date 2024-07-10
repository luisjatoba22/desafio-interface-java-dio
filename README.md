```mermaid
classDiagram
    Iphone --|> interface ReprodutorMusical
    Iphone --|> interface AparelhoTelefonico
    Iphone --|> interface NavegadorDeInternet 

    interface ReprodutorMusical --|> Ipod
    interface AparelhoTelefonico --|> Nokia
    interface NavegadorDeInternet --|> InternetExplorer

    
    class interface ReprodutorMusical{
        + tocar();
        + pausar();
        + selecionarMusica(String nomeMusica);
    }
    class interface AparelhoTelefonico{
        + ligar(String numero);
        + atender();
        + iniciarCorreioDeVoz();
    }
    class interface NavegadorDeInternet{
        + exibirPagina(url);
        + atualizarPagina();
        + adicionarNovaAba();
    }
