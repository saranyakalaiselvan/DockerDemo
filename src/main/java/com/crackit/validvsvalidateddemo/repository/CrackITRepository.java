package com.crackit.validvsvalidateddemo.repository;

import com.crackit.validvsvalidateddemo.model.CrackIT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrackITRepository extends JpaRepository<CrackIT, Long> {
}
