import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //кол-во сообщений
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<=n; i++){
            list.add(in.nextLine()); //адресаты сообщений в порядке отправки/получения
        }

     outer:   for(int i=0; i<list.size();i++){
                for(int j=i+1; j<list.size(); j++){
                    if(list.get(i).equals(list.get(j))){
                        list.remove(i);
                        i--;
                        continue outer;
                    }
                }
            }
        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
     }
}
