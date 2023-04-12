package com.example.CustemerInfo.repository;

import com.example.CustemerInfo.entity.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustmerRepository extends JpaRepository<Custmer,Long> {
}
