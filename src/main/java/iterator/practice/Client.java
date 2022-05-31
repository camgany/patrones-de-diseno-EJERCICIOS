package iterator.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Client {
    public static void main(String[]args){
        Automovil a1 = new Automovil();
        a1.setCosto(12325);
        a1.setModelo("XPANDER");
        a1.setNumeroAsiento(7);
        a1.setTipo("MITSUBISHI");

        Automovil a2 = new Automovil();
        a2.setCosto(13552);
        a2.setModelo("OUTLANDER");
        a2.setNumeroAsiento(7);
        a2.setTipo("MITSUBISHI");

        Automovil a3 = new Automovil();
        a3.setCosto(23424);
        a3.setModelo("L200");
        a3.setNumeroAsiento(5);
        a3.setTipo("MITSUBISHI");

        Automovil a4 = new Automovil();
        a4.setCosto(43213);
        a4.setModelo("MONTERO SPORT");
        a4.setNumeroAsiento(5);
        a4.setTipo("MITSUBISHI");

        Automovil a5 = new Automovil();
        a5.setCosto(1200000);
        a5.setModelo("MODEL S");
        a5.setNumeroAsiento(4);
        a5.setTipo("TESLA");

        Automovil a6 = new Automovil();
        a6.setCosto(1212222);
        a6.setModelo("MODEL 3");
        a6.setNumeroAsiento(4);
        a6.setTipo("TESLA");

        Automovil a7 = new Automovil();
        a7.setCosto(988123);
        a7.setModelo("CLA COUPE");
        a7.setNumeroAsiento(5);
        a7.setTipo("MERCEDES-BENZ");

        Automovil a8 = new Automovil();
        a8.setCosto(853476);
        a8.setModelo("URUS");
        a8.setNumeroAsiento(2);
        a8.setTipo("LAMBORGHINI");
        HashMap<Integer,Automovil> automovilHashMap = new HashMap<>();


        int position = 0;


      ConcreteAggregateImportadora1 inmicruz  = new ConcreteAggregateImportadora1();
      inmicruz.add(a1);
      inmicruz.add(a2);

      ConcreteAggregateImportadora2 losCarruajes = new ConcreteAggregateImportadora2();
      losCarruajes.add(a3);
      losCarruajes.add(a4);

      ConcreteAggregateImportadora3 autosSales = new ConcreteAggregateImportadora3();
      autosSales.add(a5);
      autosSales.add(a6);

      ConcreteAggregateImportadora4 mightyRides = new ConcreteAggregateImportadora4();
      mightyRides.add(a7);
      mightyRides.add(a8);

      Iterator iterator;
      iterator = inmicruz.createIterator();
      while (iterator.hasNext()){
          Automovil automovil = (Automovil) iterator.next();
          automovilHashMap.put(position,automovil);
          position++;

      }

      iterator = losCarruajes.createIterator();
      while (iterator.hasNext()){
          Automovil automovil = (Automovil) iterator.next();
          automovilHashMap.put(position,automovil);
          position++;

      }

      iterator = autosSales.createIterator();
      while (iterator.hasNext()){
          Automovil automovil = (Automovil) iterator.next();
          automovilHashMap.put(position,automovil);
          position++;
      }

      iterator = mightyRides.createIterator();
      while (iterator.hasNext()){
          Automovil automovil = (Automovil) iterator.next();
          automovilHashMap.put(position,automovil);
          position++;
      }

      for(int i = 0; i<position; i++){
          int a = i+1;
          System.out.println("------------------------AUTO REGISTRO "+a+"-----------------------------");
          System.out.println("MODELO: "+automovilHashMap.get(i).getModelo());
          System.out.println("COSTO: "+automovilHashMap.get(i).getCosto());
          System.out.println("NUMERO DE ASIENTOS: "+automovilHashMap.get(i).getNumeroAsiento());
          System.out.println("TIPO: "+automovilHashMap.get(i).getTipo());
      }

    }
}
