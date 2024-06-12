public class iphone implements Navegador, ReprodutorMusical, Telefone {

   public void exibirPagina(){
        System.out.println("Abrerta pagina do navegador");
   }
   public void adicionarNovaAba(){
     System.out.println("Adicionanda nova aba");
   }
   public void atualizarPagina(){
        System.out.println("Atualizada a pagina");
   }

   public void tocarMusica(){
    System.out.println("Tocando musica..");
   }
    public void pausaMusica(){
      System.out.println("Musica pausada");
    }
    public void SelecionarMusica(){
        System.out.println("Musica selecionada");
    }
    public void ligar(){
        System.out.println("Ligando");
    }

    public void atender(){
        System.out.println("Atendeu o iphone");
    }

    public void iniciarCorreio(){
        System.out.println("Iniciado correio de voz");
    }
}
