package com.beyond.train_time_estimation.runner;

import com.beyond.train_time_estimation.logic.TrainEstimator;
import com.beyond.train_time_estimation.data.TrainArrival;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Optional;
import java.util.Set;

@Component
public class TrainEstimationRunner implements ApplicationRunner {
    private final TrainEstimator trainEstimator;

    public TrainEstimationRunner(TrainEstimator trainEstimator) {
        this.trainEstimator = trainEstimator;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Set<TrainArrival> trainArrivals = Set.of(new TrainArrival("1", LocalTime.of(10, 10)),
                new TrainArrival("2", LocalTime.of(15, 15)),
                new TrainArrival("3", LocalTime.of(15, 45)));
        LocalTime time = LocalTime.of(14, 0);
        Optional<TrainArrival> closestTrainArrival = trainEstimator.getNextTrain(trainArrivals, time);

        if (closestTrainArrival.isEmpty()) {
            System.out.println("Train service is discontinued for today");
        } else {
            TrainArrival trainArrival = closestTrainArrival.get();
            System.out.println("The next train has the id " + trainArrival.id());
        }
    }
}
