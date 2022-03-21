package ru.springapp.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.springapp.entities.Role;

@Repository
public interface RoleRepository  extends CrudRepository<Role, Long> {
}
