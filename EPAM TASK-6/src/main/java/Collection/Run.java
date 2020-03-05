package Collection;	
import Collection.List;
public class Run
{
    public static void main(String[] args) 
    {
       List<Integer> listRun = new List<Integer>();

        listRun.add(7);
        listRun.add(3);
        listRun.add(45);
        System.out.println(listRun);

        listRun.remove(2);
        System.out.println(listRun);

        System.out.println( listRun.get(0) );
        System.out.println( listRun.get(1) );

        System.out.println(listRun.size());
    }
}