import static java.lang.System.*;
import java.util.Scanner;
class u1131{
    public static void main(String[]args) {
        Scanner io=new Scanner(in);
        int f=1;
        int iw=0;
          int gw=0;
          int d=0;
          int gr=0;
        while(io.hasNext()){
          if(f==1){
            gr++;
            int i=io.nextInt();
            int g=io.nextInt();
            if(i>g)
              iw++;
            else if(i<g)
              gw++;
            else
              d++;
          }
          out.println("Novo grenal (1-sim 2-nao)");
          f=io.nextInt();
          if(f!=1)
            break;
        }
        out.println(gr+" grenais\nInter:"+iw+"\nGremio:"+gw+"\nEmpates:"+d);
        if(iw>gw)
            out.println("Inter venceu mais");
          else if(gw<iw)
            out.println("Gremio venceu mais");
          else
            out.println("Não houve vencedor");
    }
}