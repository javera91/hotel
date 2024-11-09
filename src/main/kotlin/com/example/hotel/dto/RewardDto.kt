package com.example.hotel.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class RewardDto {
    @NotNull(message = "Description is required")
    @NotBlank(message = "Description is required")
    var description: String? = null

    @NotNull(message = "Minimum days is required")
    @NotBlank(message = "Minimum days is required")
    var minimumDays: Int? = null
}