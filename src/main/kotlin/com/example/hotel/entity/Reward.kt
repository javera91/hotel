package com.example.hotel.entity

import jakarta.persistence.*

@Entity
@Table(name = "reward")

class Reward {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var description: String? = null
    var minimumDays: Int? = null
}