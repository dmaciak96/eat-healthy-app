package com.example.eathealthy.backend.adapter.restclient.fdc;

import java.util.List;

public record FoodPageApiResponse(
        int totalHits,
        int currentPage,
        int totalPages,
        List<FoodApiResponse> foods) {
}
