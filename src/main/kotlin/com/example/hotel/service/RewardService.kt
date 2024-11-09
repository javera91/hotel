package com.example.hotel.service

import com.example.hotel.dto.RewardDto
import com.example.hotel.entity.Reward
import com.example.hotel.mapper.RewardMapper
import com.example.hotel.repository.RewardRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RewardService {

    @Autowired
    lateinit var rewardRepository: RewardRepository

    //Este metodo lo que hace es devolver todos los clientes guardados en la base de datos.
    fun getRewards() : List<Reward> {
        return rewardRepository.findAll()
    }

    fun save(rewardDto: RewardDto) : Reward {
        val reward = RewardMapper.toEntity(rewardDto)
        return rewardRepository.save(reward)
    }
}