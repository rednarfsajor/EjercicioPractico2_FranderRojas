
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.EmpleadoDao;
import com.EjercicioPractico1.domain.Empleado;
import com.EjercicioPractico1.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Empleado> getEmpleados() {
        var lista=empleadoDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Empleado getEmpleado(Empleado empleado) {
        return empleadoDao.findById(empleado.getId()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoDao.save(empleado);
    }
    
     @Override
    @Transactional
    public void delete(Empleado empleado) {
        empleadoDao.delete(empleado);
    }
    //FIltro de busqueda
    /*@Override
    @Transactional(readOnly=true)
    public List<Empleado> findByTituloContaining(String titulo){
        return empleadoDao.findByTituloContaining(titulo);
    }*/
}
