package com.example.hotel.mapper
import com.example.hotel.dto.GuestDto
import com.example.hotel.entity.Guest

object GuestMapper {
    fun toEntity(guestDto: GuestDto): Guest {
        val guest = Guest()
        guest.fullName = guestDto.fullName
        guest.checkinDate = guestDto.checkinDate
        return guest
    }
}