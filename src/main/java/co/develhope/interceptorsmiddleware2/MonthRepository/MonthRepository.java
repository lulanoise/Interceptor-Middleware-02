package co.develhope.interceptorsmiddleware2.MonthRepository;

import co.develhope.interceptorsmiddleware2.entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<Month,Long> {
}
