package com.example.hotel.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class GuestDto {
    @NotNull(message = "Full name is required")
    @NotBlank(message = "Name is required")
    var fullName: String? = null

    @NotNull(message = "Checkin date is required")
    @NotBlank(message = "Checkin date is required")
    var checkinDate: String? = null
}