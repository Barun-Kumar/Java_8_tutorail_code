package java8.feature.consumer;

import db.PersonRepository;
import model.Person;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerTest {
    public static void main(String[] args) {

        Consumer<Person> extractHobby= (person) -> {
            person.getHobbies().forEach(name -> System.out.println(name.toLowerCase()));
        };

        Consumer<Person> addQuomma= (person) -> {
            person.getHobbies().forEach(name -> System.out.println(name+"===="));
        };




        List<Person> persons = PersonRepository.getAllPersons();
        Set<String> uniqueHobby=persons.stream()
                .flatMap(person -> person.getHobbies().stream())
                .map(hobby -> hobby.toLowerCase())
                .collect(Collectors.toSet());
        System.out.println(uniqueHobby);

        persons.stream().forEach(extractHobby.andThen(addQuomma));
    }
}
