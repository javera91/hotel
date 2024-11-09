package com.example.hotel.controller

import com.example.hotel.dto.RewardDto
import com.example.hotel.entity.Reward
import com.example.hotel.service.RewardService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/rewards")

class RewardController {
    @Autowired
    lateinit var rewardService: RewardService

    @GetMapping
    fun getRewards() = rewardService.getRewards()

    @PostMapping
    fun save (@RequestBody @Valid rewardDto: RewardDto): Reward {
        return rewardService.save(rewardDto)

    }
}