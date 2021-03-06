package com.shoppingvirtual.repository;

import com.shoppingvirtual.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
    User findByCPF(String cpf);
    List<User> queryByNomeLike(String name);
}