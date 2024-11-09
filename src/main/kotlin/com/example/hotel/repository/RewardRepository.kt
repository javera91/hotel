package com.example.hotel.repository

import com.example.hotel.entity.Reward
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface RewardRepository: JpaRepository<Reward, Long> {
}