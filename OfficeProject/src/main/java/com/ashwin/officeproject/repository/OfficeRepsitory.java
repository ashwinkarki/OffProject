package com.ashwin.officeproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.officeproject.model.Office;

public interface OfficeRepsitory extends JpaRepository<Office, Long> {

}
