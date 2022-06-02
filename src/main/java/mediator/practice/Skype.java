package mediator.practice;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion{
    private int numero1 = 0;
    private int numero2 = 0;
    private int numero3 = 0;

    Map<Integer,ConcreteDev> concreteDevHashMap = new HashMap<>();
    Map<Integer,ConcreteQa> concreteQaHashMap = new HashMap<>();
    Map<Integer,ConcreteSm> concreteSmHashMap = new HashMap<>();


    public Skype addQA(ConcreteQa concreteQa){
        concreteQaHashMap.put(numero1, concreteQa);
        numero1 ++;
        return this;
    }

    public Skype addDEV(ConcreteDev concreteDev){
        concreteDevHashMap.put(numero2, concreteDev);
        numero2 ++;
        return this;
    }

    public Skype addSM(ConcreteSm concreteSm){
        concreteSmHashMap.put(numero3, concreteSm);
        numero3 ++;
        return this;
    }




    @Override
    public void send(String msg, Persona persona) {

        if (persona instanceof ConcreteQa){
            for (int i = 0; i<numero1; i++){
                if(!persona.getCi().equals(concreteQaHashMap.get(i).getCi())){
                    concreteQaHashMap.get(i).received(msg);
                }
            }


        }else if(persona instanceof ConcreteDev){
            for (int i = 0; i<numero2; i++){
                if(!persona.getCi().equals(concreteDevHashMap.get(i).getCi())){
                    concreteDevHashMap.get(i).received(msg);
                }
            }

        }else if(persona instanceof ConcreteSm){
            for (int i = 0; i<numero3; i++){
                if(!persona.getCi().equals(concreteSmHashMap.get(i).getCi())){
                    concreteSmHashMap.get(i).received(msg);
                }
            }
            for(int j  = 0; j<numero2;j++){
                concreteDevHashMap.get(j).received(msg);
            }
            for(int k  = 0; k<numero1;k++){
                concreteQaHashMap.get(k).received(msg);
            }
        }


    }
}
