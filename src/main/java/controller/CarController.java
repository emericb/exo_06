package controller;

import entity.Car;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.inject.Inject;
import service.CarService;

import java.util.List;
import java.util.Optional;

@Path("/cars")
public class CarController {
    @Inject
    private CarService carService;

    @GET
    @Produces("application/json")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getCarById(@PathParam("id") Long id) {
        try {
            Optional<Car> car = carService.getCarById(id);
            if (car.isPresent()) {
                return Response.ok(car.get()).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}