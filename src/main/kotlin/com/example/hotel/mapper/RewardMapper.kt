package com.example.hotel.mapper

import com.example.hotel.dto.RewardDto
import com.example.hotel.entity.Reward

object RewardMapper {
    fun toEntity(rewardDto: RewardDto): Reward {
        val reward = Reward()
        reward.description = rewardDto.description
        reward.minimumDays = rewardDto.minimumDays
        return reward
    }
}