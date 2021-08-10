package Ex_Feitos.string_builder;
/*import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Post {

    private static SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    
    private Date dataMomento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    List<Comentario> lista = new ArrayList<>();

    public Post(Date dataMomento, String titulo, String conteudo, Integer likes) {
        this.titulo = titulo;
        this.dataMomento = dataMomento;
        this.conteudo = conteudo;
        this.likes = likes;
    }
    public List<Comentario> getLista() {
        return lista;
    }
    public void addComentario(Comentario lista){
       this.lista.add(lista);
    }
    public void remComentario(Comentario lista){
        this.lista.remove(lista);
    }
  

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(titulo + "\n");
        sb.append(conteudo + "\n");
        sb.append(likes + "\n");
        sb.append(s1.format(dataMomento)+"\n");

        for (Comentario comentario : lista) {
            sb.append(comentario.getComentario()+"\n");
        }
        return sb.toString();
    }
        
        

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Date getDataMomento() {
        return dataMomento;
    }
    public void setDataMomento(Date dataMomento) {
        this.dataMomento = dataMomento;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
*/