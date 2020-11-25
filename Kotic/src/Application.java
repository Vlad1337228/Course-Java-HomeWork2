import Model.Cat;

import java.util.Scanner;

public class Application {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите привлекательность, имя, вес, как кот мяукает, сытость кота ");
        Cat cat1=new Cat();
        cat1.setCat(in.nextInt(),in.next(),in.nextInt(),in.next(),in.nextInt());
        System.out.println("Введите привлекательность, имя, вес, как кот мяукает, сытость кота ");
        Cat cat2=new Cat(in.nextInt(), in.next(), in.nextInt(), in.next(), in.nextInt());

        System.out.println("Имя кота и его вес: "+cat1.getName()+" "+cat1.getWeight());
        cat1.LiveAnotherDay();
        if(EqualsMeow(cat1.getMeow(),cat2.getMeow()))
            System.out.println("Коты мяукают одинакого");
        else
            System.out.println("Коты мяукают по-разному");
        System.out.println(Cat.getCountCat());
    }

    public static boolean EqualsMeow(String s1,String s2)
    {
        var ss1=s1.toCharArray();
        var ss2=s2.toCharArray();
        if(s1.length()==s2.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                if(!(ss1[i]==ss2[i]))
                    return false;

            }
            return true;
        }
        else
            return false;
    }
}
