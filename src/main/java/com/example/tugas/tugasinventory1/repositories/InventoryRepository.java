/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tugas.tugasinventory1.repositories;

import com.example.tugas.tugasinventory1.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Besari Maliik
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    
}
