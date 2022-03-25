
package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");
        
        //System.out.println(v[0].toString());
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Nat", 22, "F", "na");
        g[1] = new Gafanhoto("Vivi",20, "F", "vi");
        //System.out.println(g[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(g[1], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        System.out.println("");
        
        vis[1] = new Visualizacao(g[1], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
    }
    
}
