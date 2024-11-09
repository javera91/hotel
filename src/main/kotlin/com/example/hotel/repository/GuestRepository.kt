package com.example.hotel.repository

import com.example.hotel.entity.Guest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GuestRepository: JpaRepository<Guest, Long> {
}