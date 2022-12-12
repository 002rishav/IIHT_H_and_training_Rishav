package com.library.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.Entity.Library;

@Repository
public interface ILibraryRepo extends JpaRepository<Library, Integer> {
}
