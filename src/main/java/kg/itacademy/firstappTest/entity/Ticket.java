package kg.itacademy.firstappTest.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "row",nullable = false)
    private Integer row;
    @Column(name = "places",nullable = false)
    private Integer places;
    @Column(name = "price",nullable = false)
    private Integer price;
    @OneToOne
    @JoinColumn(name = "movie_id",nullable = false)
    private Movie movie;
    @OneToMany//много билетов в одном кинотеатре
    @JoinColumn(name = "cinema_id",nullable = false)
    private Cinema cinema;
    @ManyToOne
    @JoinColumn(name = "client_id",nullable = false)
    private Client client;

}
