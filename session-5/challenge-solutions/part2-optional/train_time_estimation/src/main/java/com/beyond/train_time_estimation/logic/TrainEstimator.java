package com.beyond.train_time_estimation.logic;

import com.beyond.train_time_estimation.data.TrainArrival;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.Optional;
import java.util.Set;

@Component
public class TrainEstimator {
    public Optional<TrainArrival> getNextTrain(Set<TrainArrival> trainArrivals, LocalTime now) {
        return trainArrivals.stream()
                .filter(trainArrival -> trainArrival.arrivalTime().isAfter(now))
                .sorted(Comparator.comparing(TrainArrival::arrivalTime))
                .findFirst();
    }
}
