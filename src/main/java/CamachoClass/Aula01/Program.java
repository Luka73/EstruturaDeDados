package CamachoClass.Aula01;

import java.util.function.Function;

public class Program {
    public static void main(String[] args) {
        /*CamachoClass.Aula01.Pacote pacote1 = new CamachoClass.Aula01.Pacote();
        CamachoClass.Aula01.Pacote pacote2 = new CamachoClass.Aula01.Pacote();
        CamachoClass.Aula01.Relogio relogio = new CamachoClass.Aula01.Relogio();
        relogio.hora = 12;
        CamachoClass.Aula01.Armario armario = new CamachoClass.Aula01.Armario();
        armario.tamanho = 15;

        pacote1.item = relogio;
        pacote2.item = armario;

        System.out.println(((CamachoClass.Aula01.Relogio)pacote1.item).hora);
        System.out.println(((CamachoClass.Aula01.Relogio)pacote2.item).hora);


        CamachoClass.Aula01.PacoteGenerico<CamachoClass.Aula01.Relogio> pg1 = new CamachoClass.Aula01.PacoteGenerico<>();
        CamachoClass.Aula01.PacoteGenerico<CamachoClass.Aula01.Armario> pg2 = new CamachoClass.Aula01.PacoteGenerico<>();
        pg1.item = relogio;
        pg2.item = armario;

        System.out.println(pg1.item.hora);
        System.out.println(pg2.item.tamanho);

        CamachoClass.Aula01.PacoteArmario pa = new CamachoClass.Aula01.PacoteArmario();
        CamachoClass.Aula01.PacoteRelogio pr = new CamachoClass.Aula01.PacoteRelogio();

        pa.item = armario;
        pr.item = relogio;

        System.out.println(pa.item.tamanho);
        System.out.println(pr.item.hora);


        int i = 0;

        i = ++i;

        System.out.println(i);*/

        /*LinkedList<Integer> intList = new LinkedList<>();
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);*/


      /*  ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        OneArgument<Integer> a = element -> {
            System.out.println(element);
        };


        list.forEach(System.out::println);

        //list.forEach(a);

        //list.forEach(e -> System.out.println(e)); */

      ArrayList<Integer> myList = new ArrayList<>();
      myList.add(1);
      myList.add(2);
      myList.add(3);
      myList.add(4);
      myList.add(5);

      Function<Integer, String> myFun
              = Program::toString;

      ArrayList<String> stringArrayList = myList.map(myFun);


      for (int i = 0; i < stringArrayList.size(); i++) {
          System.out.println(stringArrayList.get(i));
      }







      //int n = myList.get(20);

      //System.out.println(n);


     /* myList.remove(2);
      myList.forEach(e -> System.out.println(e));
      System.out.println("Total: " + myList.size());*/




    }

    public static String toString(Integer a)
    {
        return a.toString();
    }
}
