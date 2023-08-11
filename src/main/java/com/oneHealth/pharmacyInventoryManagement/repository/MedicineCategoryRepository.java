package com.oneHealth.pharmacyInventoryManagement.repository;

import com.oneHealth.pharmacyInventoryManagement.entity.MedicineCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineCategoryRepository extends JpaRepository<MedicineCategory, Long> {

    // Define any custom repository methods if needed

}
