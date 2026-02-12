package com.example.services;

import com.example.dto.DashboardResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DashboardService {

    public DashboardResponse getDashboardData(String username) {
        // Generate sample data for the dashboard
        List<DashboardResponse.SafrateData> safetyRate = new ArrayList<>();
        safetyRate.add(new DashboardResponse.SafrateData("Jan", 95.5));
        safetyRate.add(new DashboardResponse.SafrateData("Feb", 92.3));
        safetyRate.add(new DashboardResponse.SafrateData("Mar", 88.7));
        safetyRate.add(new DashboardResponse.SafrateData("Apr", 91.2));
        safetyRate.add(new DashboardResponse.SafrateData("May", 96.8));
        safetyRate.add(new DashboardResponse.SafrateData("Jun", 94.1));

        List<DashboardResponse.ActivityData> activityData = new ArrayList<>();
        activityData.add(new DashboardResponse.ActivityData("Mon", 12));
        activityData.add(new DashboardResponse.ActivityData("Tue", 19));
        activityData.add(new DashboardResponse.ActivityData("Wed", 15));
        activityData.add(new DashboardResponse.ActivityData("Thu", 22));
        activityData.add(new DashboardResponse.ActivityData("Fri", 18));
        activityData.add(new DashboardResponse.ActivityData("Sat", 8));
        activityData.add(new DashboardResponse.ActivityData("Sun", 5));

        return new DashboardResponse(
            "Dashboard loaded successfully",
            username,
            safetyRate,
            activityData
        );
    }
}
