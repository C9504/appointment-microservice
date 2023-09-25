package org.negrdo.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.quarkus.panache.common.Parameters;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Query;
import org.negrdo.entities.Appointment;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class AppointmentRepository implements PanacheRepositoryBase<Appointment, UUID> {

    public List<Appointment> listAppointmentsWithCustomer() {
        String query = "SELECT a FROM Appointment a LEFT JOIN FETCH a.customer";
        Query jpaQuery = getEntityManager().createQuery(query, Appointment.class);
        return jpaQuery.getResultList();
    }
}
