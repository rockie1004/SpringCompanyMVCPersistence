package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Position;

public interface PositionRepository extends JpaRepository<Position, Long>{

}
