package kg.itacademy.firstappTest.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quality", nullable = false)
    private String quality;
    @Column(name = "date_time",nullable = false)
    private LocalDateTime dateTime;
    @ManyToOne
    @JoinColumn(name = "movie_id",nullable = false)
    private Movie movie;
    @OneToMany
    @JoinColumn(name = "cinema_id",nullable = false)
    private Cinema cinema;
}
