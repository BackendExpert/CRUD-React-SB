// interacting with the database
// manage database operations without writing SQL queries explicitly.
// Spring Data JPA

package com.example.mycrud.repository;

// get model  
import com.example.mycrud.model.Item;

// JPARepo in Springbootframeowk
import org.springframework.data.jpa.repository.JpaRepository;

// Item: Specifies the entity class this repository manages.
// Long: Specifies the type of the primary key in the Item entity

public interface ItemRepository extends JpaRepository<Item, Long> {
}
