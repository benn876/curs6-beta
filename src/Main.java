public class Main {
    public static void main(String[] args) {
        Clock defaultConstructorObject = new Clock();
        Clock myFirstClockObject = new Clock(18,31);
        System.out.println(myFirstClockObject.getTime());
        System.out.println(defaultConstructorObject.getTime());

        System.out.println(myFirstClockObject.getHour());
        System.out.println(myFirstClockObject.getMinutes());

        myFirstClockObject.setHour(26);
        myFirstClockObject.setMinutes(70);

        System.out.println(myFirstClockObject.getTime());
        System.out.println("Address:" + myFirstClockObject);

        System.out.println("-----------------------+++++++++++++++++++++-------------------");

        Clock anotherClock = new Clock();
        System.out.println("Address:" + anotherClock);
        anotherClock.setHour(12);
        anotherClock.setMinutes(50);
        System.out.println(anotherClock.getTime());

        System.out.println("-----------------------+++++++++++++++++++++-------------------");

        Animal cat = new Animal("Felina","Red",4,10,20,25);
        System.out.println("My cat type:" + cat.getType());

        Animal animal = new Animal("Canine","Brown",4, 6, 33,35);
        System.out.println(animal.toString());
        System.out.println(cat.toString());

        String result = animal.getType().equals("Canine") ? "It's a dog" : "It's not a dog";
//        if (animal.getType().equals("Canine")){
//            result = "It's a dog";
//        } else {
//            result = "It's not a dog";
//        }

        System.out.println(result);
    }
}


