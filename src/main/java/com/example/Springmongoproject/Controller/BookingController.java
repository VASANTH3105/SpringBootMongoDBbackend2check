package com.example.Springmongoproject.Controller;

import com.example.Springmongoproject.Entity.Booking;
import com.example.Springmongoproject.Service.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/booking")
public class BookingController {

    @Autowired
    private BookingServices bookingServices;

    //@RequestBody is an annotation used to map the request body of an HTTP request to a Java object.
    @PostMapping(value = "/save")
    public String saveBooking(@RequestBody Booking bookings) {
        bookingServices.saveorUpdate(bookings);
        return bookings.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Booking> getBooking() {
        return bookingServices.listAll();
    }
    @PutMapping(value = "/edit/{id}")
    public Booking update(@RequestBody Booking booking, @PathVariable(name = "id") String _id) {
        booking.set_id(_id);
        bookingServices.saveorUpdate(booking);
        return booking;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteBooking(@PathVariable("id") String _id) {
        bookingServices.deleteBooking(_id);
    }

    @RequestMapping("/search/{id}")
    private Booking setBooking(@PathVariable(name = "id") String bookingid) {
        return bookingServices.getBookingID(bookingid);
    }
}
