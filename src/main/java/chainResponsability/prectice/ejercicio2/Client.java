package chainResponsability.prectice.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String []args){

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("4546","Mario",41));//1
        personas.add(new Persona("3421","Mariana",31));//2
        personas.add(new Persona("5745","Carlos",11));//3
        personas.add(new Persona("1232","Jaden",51));//4
        personas.add(new Persona("1216","Juan",23));//5
        personas.add(new Persona("1221","Juana",1));//6
        personas.add(new Persona("7865","Julio",21));//7
        personas.add(new Persona("5433","Mauro",34));//8
        personas.add(new Persona("8634","Rocio",44));//9
        personas.add(new Persona("8766","Julia",33));//10

        ManagerHandler managerHandler= new ManagerHandler();
        managerHandler.criteriaHandler(personas);


        ArrayList<Persona> personas2 = new ArrayList<>();
        personas2.add(new Persona("4546","Mario",41));//1
        personas2.add(new Persona("3421","Mariana",31));//2
        personas2.add(new Persona("5745","Carlos",11));//3
        personas2.add(new Persona("1232","Jaden",51));//4
        personas2.add(new Persona("1216","Juan",23));//5
        personas2.add(new Persona("1221","Juana",1));//6
        personas2.add(new Persona("7865","Julio",21));//7
        personas2.add(new Persona("5433","Mauro",34));//8
        personas2.add(new Persona("8634","Rocio",44));//9
        personas2.add(new Persona("8766","Julia",33));//10
        personas2.add(new Persona("1111","Juliana",99));//11
        personas2.add(new Persona("4545","Julian",54));//12
        personas2.add(new Persona("3242","Ricardo",22));//13
        personas2.add(new Persona("4213","Manuel",12));//14
        personas2.add(new Persona("7655","Roberta",66));//15
        personas2.add(new Persona("5431","Roberto",64));//16
        personas2.add(new Persona("9871","Nessa",30));//17
        personas2.add(new Persona("0954","Ariana",43));//18
        personas2.add(new Persona("6811","Natalia",2));//19
        personas2.add(new Persona("6543","Abril",39));//20
        personas2.add(new Persona("4755","Manu",77));//21
        personas2.add(new Persona("6576","Diego",70));//22
        personas2.add(new Persona("1122","Grisel",76));//23
        personas2.add(new Persona("7821","Mario",45));//24
        personas2.add(new Persona("7324","Manuela",35));//25

        ManagerHandler managerHandler2= new ManagerHandler();
        managerHandler2.criteriaHandler(personas2);



        ArrayList<Persona> personas3 = new ArrayList<>();
        personas3.add(new Persona("4546","Mario",41));//1
        personas3.add(new Persona("3421","Mariana",31));//2
        personas3.add(new Persona("5745","Carlos",11));//3
        personas3.add(new Persona("1232","Jaden",51));//4
        personas3.add(new Persona("1216","Juan",23));//5
        personas3.add(new Persona("1221","Juana",1));//6
        personas3.add(new Persona("7865","Julio",21));//7
        personas3.add(new Persona("5433","Mauro",34));//8
        personas3.add(new Persona("8634","Rocio",44));//9
        personas3.add(new Persona("8766","Julia",33));//10
        personas3.add(new Persona("1111","Juliana",99));//11
        personas3.add(new Persona("4545","Julian",54));//12
        personas3.add(new Persona("3242","Ricardo",22));//13
        personas3.add(new Persona("4213","Manuel",12));//14
        personas3.add(new Persona("7655","Roberta",66));//15
        personas3.add(new Persona("5431","Roberto",64));//16
        personas3.add(new Persona("9871","Nessa",30));//17
        personas3.add(new Persona("0954","Ariana",43));//18
        personas3.add(new Persona("6811","Natalia",2));//19
        personas3.add(new Persona("6543","Abril",39));//20
        personas3.add(new Persona("4755","Manu",77));//21
        personas3.add(new Persona("6576","Diego",70));//22
        personas3.add(new Persona("1122","Grisel",76));//23
        personas3.add(new Persona("7821","Mario",45));//24
        personas3.add(new Persona("7324","Manuela",35));//25
        personas3.add(new Persona("9256","Elena",15));//26
        personas3.add(new Persona("9876","Ernesto",30));//27
        personas3.add(new Persona("3226","Estela",29));//28
        personas3.add(new Persona("6546","Andrea",19));//29
        personas3.add(new Persona("4443","Andres",36));//30
        personas3.add(new Persona("7655","Cecilia",50));//31
        personas3.add(new Persona("1754","Celia",90));//32
        personas3.add(new Persona("9888","Laura",88));//33
        personas3.add(new Persona("9878","Rihanna",81));//34
        personas3.add(new Persona("8668","Cesar",52));//35
        personas3.add(new Persona("1211","Susana",26));//36
        personas3.add(new Persona("2223","Sandra",37));//37
        personas3.add(new Persona("7764","Sandro",81));//38
        personas3.add(new Persona("5426","Samuel",72));//39
        personas3.add(new Persona("9886","Katia",10));//40
        personas3.add(new Persona("1215","Raul",4));//41
        personas3.add(new Persona("7657","Ana",6));//42
        personas3.add(new Persona("4233","Azul",9));//43
        personas3.add(new Persona("4546","Mario",41));//44
        personas3.add(new Persona("3421","Mariana",31));//45
        personas3.add(new Persona("5745","Carlos",11));//46
        personas3.add(new Persona("1232","Jaden",51));//47
        personas3.add(new Persona("1216","Juan",23));//48
        personas3.add(new Persona("1221","Juana",1));//49
        personas3.add(new Persona("7865","Julio",21));//50
        personas3.add(new Persona("5433","Mauro",34));//51
        personas3.add(new Persona("8634","Rocio",44));//52
        personas3.add(new Persona("8766","Julia",33));//53

        ManagerHandler managerHandler3= new ManagerHandler();
        managerHandler3.criteriaHandler(personas3);





    }
}

