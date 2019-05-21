
public class Teste {
 public static void main(String[] args){

    Diretor p1=new Diretor();
        p1.setNome("Spielberg");
        Data d1=new Data();
        d1.setDia(31);
        d1.setMes(01);
        d1.setAno(1964);
        p1.setDataDeNascimento(d1);
        
        
        
        Filme f1=new Filme();
        f1.setDiretor(p1);
        Data d2=new Data();
        d2.setDia(24);
        d2.setMes(2);
        d2.setAno(2003);
        f1.setData(d2);
       
        
        p1.mostrar();
        f1.informarGenero("Ação");
        f1.mostrar();


}       
}
