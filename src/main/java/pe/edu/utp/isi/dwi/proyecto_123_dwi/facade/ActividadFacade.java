package pe.edu.utp.isi.dwi.proyecto_123_dwi.facade;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import pe.edu.utp.isi.dwi.proyecto_123_dwi.dao.ActividadDAO;
import pe.edu.utp.isi.dwi.proyecto_123_dwi.entities.Actividad;

@Stateless
public class ActividadFacade {

    @Inject
    private ActividadDAO actividadDAO;

    public void guardarActividad(Actividad actividad) {
        actividadDAO.guardarActividad(actividad);
    }

    public void actualizarActividad(Actividad actividad) {
        actividadDAO.actualizarActividad(actividad);
    }

    public void eliminarActividad(int idActividad) {
        actividadDAO.eliminarActividad(idActividad);
    }

    public Actividad buscarPorId(int idActividad) {
        return actividadDAO.buscarPorId(idActividad);
    }

    public List<Actividad> listarActividadesPorSolicitud(int idSolicitud) {
        return actividadDAO.listarActividadesPorSolicitud(idSolicitud);
    }

    public List<Actividad> listarTodasLasActividades() {
        return actividadDAO.listarTodasLasActividades();
    }
}
