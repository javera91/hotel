package com.example.hotel.entity

import jakarta.persistence.*

@Entity
@Table(name = "guest")

class Guest {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var fullName: String? = null
    var checkinDate: String? = null
    var checkoutDate: String? = null
    var daysStayed: Int = 0
    var rewardId: String? = null
}