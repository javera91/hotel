package com.example.hotel.controller

import com.example.hotel.dto.GuestDto
import com.example.hotel.entity.Guest
import com.example.hotel.response.SuccessResponse
import com.example.hotel.service.GuestService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/guests")
class GuestController {
    @Autowired
    lateinit var guestService: GuestService

    @GetMapping
    fun getGuests() : ResponseEntity<*> {
        val response= guestService.getGuests()
        return ResponseEntity(
            SuccessResponse().apply {
                status = "success"
                data = response
            },HttpStatus.OK)
    }

    @PostMapping
    fun save (@RequestBody @Valid guestDto: GuestDto): ResponseEntity<*> {
        val response= guestService.save(guestDto)
        return ResponseEntity (
            SuccessResponse().apply {
                status = "success"
                data = response
            },
            HttpStatus.CREATED)

    }



}