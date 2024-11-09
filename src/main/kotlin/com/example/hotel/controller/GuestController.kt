package com.example.hotel.controller

import com.example.hotel.dto.GuestDto
import com.example.hotel.entity.Guest
import com.example.hotel.service.GuestService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/guests")
class GuestController {
    @Autowired
    lateinit var guestService: GuestService

    @GetMapping
    fun getGuests() = guestService.getGuests()

    @PostMapping
    fun save (@RequestBody @Valid guestDto: GuestDto): Guest {
        return guestService.save(guestDto)

    }
}