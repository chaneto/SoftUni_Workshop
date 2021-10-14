package coffeeshop.coffeeshop.repositories;

import coffeeshop.coffeeshop.models.entities.CategoryName;
import coffeeshop.coffeeshop.models.entities.Order;
import coffeeshop.coffeeshop.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByCategory_NameOrderByPriceDesc(CategoryName categoryName);

    @Query("select sum(o.category.neededTime) from Order as o")
    BigDecimal getAllTimeSum();

    @Query("select count(o) from Order as o where o.employee.username = ?1")
    int getAllUserOrders(String username);

    @Query("select o.employee.username from Order as o group by o.employee order by count(o.id) desc")
    List<String> getAllUsers();
}