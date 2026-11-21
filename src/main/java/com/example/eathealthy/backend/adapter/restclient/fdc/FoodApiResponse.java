package com.example.eathealthy.backend.adapter.restclient.fdc;

import java.time.Instant;
import java.util.List;

public record FoodApiResponse(
                long fdcId,
                String description,
                String commonNames,
                String additionalDescriptions,
                String dataType,
                long ndbNumber,
                Instant publishedDate,
                String foodCategory,
                String allHighlightFields,
                double score,
                List<FoodNutrientsApiResponse> foodNutrients) {
}
