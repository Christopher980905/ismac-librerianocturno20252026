package com.distribuida.service;

import com.distribuida.dao.FacturaDetalleRepository;
import com.distribuida.model.FacturaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaDetalleServiceImpl implements FacturaDetalleService {
    @Autowired
    private FacturaDetalleRepository facturaDetalleRepository;


    @Override
    public List<FacturaDetalle> findAll() {
        return facturaDetalleRepository.findAll();
    }

    @Override
    public Optional<FacturaDetalle> findOne(int id) {
        return facturaDetalleRepository.findById(id);
    }

    @Override
    public FacturaDetalle save(FacturaDetalle facturaDetalle) {
        return facturaDetalleRepository.save(facturaDetalle);
    }

    @Override
    public FacturaDetalle update(int id, FacturaDetalle facturaDetalle) {
        Optional<FacturaDetalle> facturadetalleExistente = facturaDetalleRepository.findById(id);

        if (facturadetalleExistente == null) {
            return null;
        }

        facturadetalleExistente.orElse(null).setCantidad(facturaDetalle.getCantidad());
        facturadetalleExistente.orElse(null).setSubtotal(facturaDetalle.getSubtotal());
        facturadetalleExistente.orElse(null).setFactura(facturaDetalle.getFactura());
        facturadetalleExistente.orElse(null).setLibro(facturaDetalle.getLibro());

        return facturaDetalleRepository.save(facturadetalleExistente.orElse(null));


    }

    @Override
    public void delete(int id) {
        if (facturaDetalleRepository.existsById(id)) {
            facturaDetalleRepository.deleteById(id);
        }
    }
}
