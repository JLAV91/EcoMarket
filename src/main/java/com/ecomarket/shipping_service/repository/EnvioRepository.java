package com.ecomarket.shipping_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecomarket.shipping_service.model.Envio;


@Repository
public interface EnvioRepository extends JpaRepository<Envio, Long> {

}
