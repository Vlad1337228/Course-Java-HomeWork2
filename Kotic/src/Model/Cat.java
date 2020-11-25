package Model;
import java.util.Scanner;
public class Cat
{
    private static int CountCat=0;
    private String name;
    private int weight;
    private int prettiness;
    private String meow;
    private int eat;

    public static int getCountCat()
    {
        return CountCat;
    }
    /////////
    public void setName(String value)
    {
        name=value;
    }
    public void setWeight(int value)
    {
        weight=value;
    }
    public void setPrettiness(int value)
    {
        prettiness=value;
    }
    public void setMeow(String value)
    {
        meow=value;
    }
    public void setEat(int value)
    {
        eat=value;
    }
/////////////////////
    public String getName()
    {
        return name;
    }
    public int getWeight()
    {
        return weight;
    }
    public int getPrettiness()
    {
        return prettiness;
    }
    public String getMeow()
    {
        return  meow;
    }
    public int getEat()
    {
        return eat;
    }
   //////////////////////
    public Cat()
    {

    }
    public Cat(int Prettiness, String Name, int Weight, String Meow, int Eat)
    {
        name=Name;
        prettiness=Prettiness;
        weight=Weight;
        meow=Meow;
        eat=Eat;
        CountCat++;
    }
    public void setCat(int Prettiness, String Name, int Weight, String Meow, int Eat)
    {
        name=Name;
        prettiness=Prettiness;
        weight=Weight;
        meow=Meow;
        eat=Eat;
        CountCat++;
    }
    public boolean Sleep()
    {
        return Energy(1);

    }
    public boolean Play()
    {
        return Energy(2);

    }
    public boolean chaseMouse()
    {
        return Energy(3);
    }
    public boolean Meow()
    {
        return Energy(1);
    }

    public boolean Washes()
    {
        return Energy(2);
    }
    public void Eat(int ed)
    {
        eat+=ed;
    }
    public void Eat(int ed, String s)
    {
        eat+=ed;
    }
    public void Eat()
    {
        System.out.println("Введите кол-во единиц еды и ее название");
        Scanner in = new Scanner(System.in);
        int e=in.nextInt();
        String s=in.next();
        Eat(e,s);
    }
    public boolean Energy(int energy ) // проверяет кол-во энергии
    {
        if( eat-energy>0)
        {
            eat-=energy;
            return true;
        }
            return false;
    }

    public void Proverka(Cat cat1)
    {
        System.out.println("У кота нет эенергии, чтобы сделать действие. Пожалуйста покормите.");
        System.out.println("Введите 1,если вы хотите ввести кол-во единиц еды, или введите 2 или 3 ,если вы хотите ввести кол-во единиц еды и название еды.");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case (1): {
                int e = in.nextInt();
                cat1.Eat(e);
                break;
            }
            case (2): {
                int e = in.nextInt();
                String s = in.next();
                cat1.Eat(e, s);
                break;
            }
            case (3): {
                cat1.Eat();
                break;
            }
            default:
                System.out.println("Вы ввели число не равное 1 , 2 или 3");
        }

    }
    public void LiveAnotherDay()
    {
        for(int i=0;i<24;i++)
        {
            switch((int)(Math.random()*5 + 1))
            {
                case(1):
                {
                    if(Sleep())
                        System.out.println("Кот поспал");
                    else
                        Proverka(this);
                    break;
                }
                case(2):
                {
                    if(Play())
                        System.out.println("Кот поиграл");
                    else
                        Proverka(this);
                    break;
                }
                case(3):
                {
                    if(chaseMouse())
                        System.out.println("Кот побегал за мышкой");
                    else
                        Proverka(this);
                    break;
                }
                case(4):
                {
                    if(Washes())
                        System.out.println("Кот помылся");
                    else
                        Proverka(this);
                    break;
                }
                case(5):
                {
                    if(Meow())
                        System.out.println("Кот помяукал");
                    else
                        Proverka(this);
                    break;
                }
            }
        }
    }
}
