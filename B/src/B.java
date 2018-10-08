import java.util.Scanner;
public class B {
    public static void main(String[] args){
        //Считывание данных
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); // длина пути Шатла
        int x1 = in.nextInt(); // точка отправления Васи
        int x2 = in.nextInt(); // прибытия Васи
        int t1 = in.nextInt(); // время Шатла для продаления 1 метра
        int t2 = in.nextInt(); // время Васи для преодаления 1 метра
        int p = in.nextInt(); // позиция Шатла, когда Вася пришел в точку х1
        int d = in.nextInt(); // направление Шатла
        in.close();

        //Вычисления
        {
            int tv = (x2-x1)*t2; // время затраченное Васей пешком
            if(tv<0){
                tv *= -1;
            }
            int tsh = 0; // Время шатла
            ////1/////B-> Ш->
            if(x1<x2 && d==1){
                if(p<=x1){
                    tsh = (x2-p)*t1;
                } else{
                    tsh = ((s-p)+s+x2)*t1;
                }
            }
            ////2////B-> Ш<-
            if(x1<x2 && d==-1){
                tsh = (p+x2)*t1;
            }
            ////3////B<- Ш->
            if(x1>x2 && d==1){
                tsh = ((s-p)+(s-x2))*t1;
            }
            ////4////B<- Ш<-
            if(x1>x2 && d==-1){
                if(p>=x1){
                    tsh = (p-x2)*t1;
                } else {
                    tsh = (p+s+(s-x2))*t1;
                }
            }
            //////Выбор меньшего времени и вывод
            if(tv<tsh){
                System.out.println(tv);
            } else {
                System.out.print(tsh);
            }
        }
    }
}
