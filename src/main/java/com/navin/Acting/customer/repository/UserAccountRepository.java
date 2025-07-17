package com.navin.Acting.customer.repository;

import com.navin.Acting.customer.entity.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccountEntity,Integer> {
}
