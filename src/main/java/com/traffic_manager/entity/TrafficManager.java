package com.traffic_manager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "traffic_history", indexes = @Index(columnList = "intersectionId"))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrafficManager {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String intersectionId;

        @Column(nullable = false)
        private String direction; // NORTH, SOUTH, EAST, WEST

        @Column(nullable = false)
        private String state; // RED, YELLOW, GREEN

        @Column(nullable = false)
        private LocalDateTime timestamp;

        public TrafficManager(String intersectionId, String direction, String state) {
            this.intersectionId = intersectionId;
            this.direction = direction;
            this.state = state;
            this.timestamp = LocalDateTime.now();
        }


}
