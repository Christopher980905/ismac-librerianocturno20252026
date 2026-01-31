package com.distribuida.controller;

import com.distribuida.model.FacturaDetalle;
import com.distribuida.service.FacturaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facturaDetalles")

public class FacturaDetalleController {

    @Autowired
    private FacturaDetalleService FacturaDetalleService;

    @GetMapping
    public ResponseEntity<List<FacturaDetalle>> findAll() {
        List<FacturaDetalle> facturaDetalles = FacturaDetalleService.findAll();
        return ResponseEntity.ok().body(facturaDetalles);
    }


    @GetMapping("/{id}")
    public ResponseEntity<FacturaDetalle> findOne(@PathVariable int id) {
        Optional<FacturaDetalle> FacturaDetalle = FacturaDetalleService.findOne(id);
        if (FacturaDetalle == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(FacturaDetalle.orElse(null));
    }

    @PostMapping
    public ResponseEntity<FacturaDetalle> save(@RequestBody FacturaDetalle FacturaDetalle) {

        FacturaDetalle FacturaDetalleNueva = FacturaDetalleService.save(FacturaDetalle);
        return ResponseEntity.ok(FacturaDetalleNueva);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FacturaDetalle> update(@PathVariable int id, @RequestBody FacturaDetalle FacturaDetalle) {
        FacturaDetalle FacturaDetalleActualizado = FacturaDetalleService.update(id, FacturaDetalle);
        if (FacturaDetalleActualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(FacturaDetalleActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        FacturaDetalleService.delete(id);
        return ResponseEntity.noContent().build();

    }
}
