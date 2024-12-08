package com.pk_plan_be.repository;

import com.pk_plan_be.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}