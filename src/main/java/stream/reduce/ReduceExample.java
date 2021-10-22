package stream.reduce;

import db.PersonRepository;
import model.Person;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Person> persons= PersonRepository.getAllPersons();
        //Sum all persons salary
        int totalSalary =persons.stream()
                .mapToInt(Person::getSalary)
                .reduce(1,(totalSal, sal)-> totalSal + sal);
        System.out.println(totalSalary);


    }
}
