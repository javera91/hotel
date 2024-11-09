package com.example.hotel.service

import com.example.hotel.dto.GuestDto
import com.example.hotel.entity.Guest
import com.example.hotel.mapper.GuestMapper
import com.example.hotel.repository.GuestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GuestService {

    @Autowired
    lateinit var guestRepository: GuestRepository

    //Este metodo lo que hace es devolver todos los clientes guardados en la base de datos.
    fun getGuests() : List<Guest> {
        return guestRepository.findAll()
    }

    fun save(guestDto: GuestDto) : Guest {
        val guest = GuestMapper.toEntity(guestDto)
        return guestRepository.save(guest)
    }
}