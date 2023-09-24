package org.negrdo.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.negrdo.entities.Appointment;

import java.util.UUID;

@ApplicationScoped
public class AppointmentRepository implements PanacheRepositoryBase<Appointment, UUID> {
}
