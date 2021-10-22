package db;

import model.Person;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getAllPersons(){
        Person p1 = new Person("Varun",167,80000,Gender.Male.toString(),2, Arrays.asList("Running","Swimming","Walking","Ridding"));
        Person p2 = new Person("Kumar",167,90000,Gender.Male.toString(),3, Arrays.asList("Eating","Dancing"));
        Person p3 = new Person("Lav",167,120000,Gender.Male.toString(),2, Arrays.asList("Tv","Eating","Walking"));
        Person p4 = new Person("Rahul",167,70000,Gender.Male.toString(),1, Arrays.asList("Running","Swimming","Reading"));
        Person p5 = new Person("Deeksha",167,180000,Gender.Female.toString(),2, Arrays.asList("Running","Reading","Walking","Trekking"));
        Person p6 = new Person("Golu",167,88000,Gender.Male.toString(),3, Arrays.asList("Running","Reading","Walking","Trekking"));
        Person p7 = new Person("Sameer",167,10000,Gender.Male.toString(),5, Arrays.asList("Eating","Tv","Walking","Dancing"));
        return Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
    }
}
