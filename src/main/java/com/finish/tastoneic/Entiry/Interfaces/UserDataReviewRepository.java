package com.finish.tastoneic.Entiry.Interfaces;

import com.finish.tastoneic.Entiry.Userdatareview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDataReviewRepository extends JpaRepository<Userdatareview, Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM userdatareview where EMAIL=?1")
    List<Userdatareview> findByEmail(String Email);
}
