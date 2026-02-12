package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DashboardResponse {
    private String message;
    private String username;
    private List<SafrateData> safetyRate;
    private List<ActivityData> activityData;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SafrateData {
        private String month;
        private double rate;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ActivityData {
        private String day;
        private int count;
    }
}
