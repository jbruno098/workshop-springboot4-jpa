package com.educandoweb.course.repositories;

import com.educandoweb.course.Entities.Order;
import com.educandoweb.course.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
