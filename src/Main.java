import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass("Askar","Almazbekov",32,"Plov",
                new String[]{"Java","English","Softskills"});
        MyClass myClass1 = new MyClass("Kymbat","Ishembekova","Shashlyk",
                new String[]{"Js","English","Softskills"},30);

        System.out.println(myClass.getName()+"\n"+myClass.getSurname()+"\n"+myClass.getAge()+"\n"+myClass.getFood()+
               "\n"+Arrays.toString(myClass.getCourses()));
        System.out.println(myClass1.getName()+"\n"+myClass1.getSurname()+"\n"+myClass1.getAge()+"\n"+myClass1.getFood()+
                "\n"+Arrays.toString(myClass1.getCourses()));
    }
}