public class App {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de Machine Learning");
        v[2] = new Video("Aula de Deep Learning");

        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Luiz", 22, "M", 1 , "luiz");
        a[1] = new Aluno("Carlos", 45, "M", 10 , "carlinhos99");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(a[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(a[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());

        
        /*System.out.println("VÍDEOS\n--------------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nALUNOS\n------------------------------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());*/
    }
}
