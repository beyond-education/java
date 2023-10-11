package com.beyond.train_time_estimation.data;

import java.time.LocalTime;

public record TrainArrival(String id, LocalTime arrivalTime) {
}
