package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastNameAndFirstName(String lastName, String firstName);

  List<Customer> findByLastNameOrFirstName(String lastName, String firstName);

  List<Customer> findByLastNameOrFirstNameContaining(String lastName, String firstName);

  List<Customer> findByLastName(String lastName);

  List<Customer> findByFirstName(String firstName);

  List<Customer> findByLastNameContaining(String LastName);

}
