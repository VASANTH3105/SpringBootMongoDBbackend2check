package com.example.Springmongoproject.Service;

import com.example.Springmongoproject.Entity.Booking;
import com.example.Springmongoproject.Repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServices {

    @Autowired
    private BookingRepo repo;

    public void saveorUpdate(Booking bookings) {
        repo.save(bookings);
    }

    public Iterable<Booking> listAll() {
        return this.repo.findAll();
    }

    public void deleteBooking(String id) {
        repo.deleteById(id);
    }

    public Booking getBookingID(String bookingid) {
        return repo.findById(bookingid).get();
    }
}
