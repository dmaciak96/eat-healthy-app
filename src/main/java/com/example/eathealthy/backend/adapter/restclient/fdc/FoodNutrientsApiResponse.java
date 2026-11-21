package com.example.eathealthy.backend.adapter.restclient.fdc;

public record FoodNutrientsApiResponse(
                long nutrientId,
                String nutrientName,
                String nutrientNumber,
                String unitName,
                String derivationCode,
                String derivationDescription,
                long derivationId,
                double value,
                long foodNutrientSourceId,
                String foodNutrientSourceCode,
                String foodNutrientSourceDescription,
                long rank,
                long indentLevel,
                long foodNutrientId,
                long dataPoints) {
}
